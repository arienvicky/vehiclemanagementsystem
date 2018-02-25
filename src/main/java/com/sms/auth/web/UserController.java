package com.sms.auth.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sms.auth.model.User;
import com.sms.auth.model.VehicleUser;
import com.sms.auth.service.SecurityService;
import com.sms.auth.service.UserService;
import com.sms.auth.service.VehicleUserService;
import com.sms.auth.validator.UserValidator;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private VehicleUserService vehicleuserService;
    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/vehicleregistration";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/vehicleregistration"}, method = RequestMethod.GET)
    public String welcome(Model model, String success, String error) {
        model.addAttribute("vehicleForm", new VehicleUser());
        if (success != null)
            model.addAttribute("message", "You have been logged out successfully.");
        if (error != null)
            model.addAttribute("error", "Some Error has occured.");
        return "vehicleregistration";
    }
   
    
    @RequestMapping(value = "/vehicleregistration", method = RequestMethod.POST)
    public String registerVehicle(@ModelAttribute("vehicleForm") @Valid VehicleUser vehicleForm, BindingResult bindingResult, Model model) {
       // userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "vehicleregistration";
        }

        vehicleuserService.save(vehicleForm);


        return "redirect:/vehicleregistration?success=true";
    }
    
    @RequestMapping(value = {"/vehiclesearch"}, method = RequestMethod.GET)
    public String search() {
       
        return "vehiclesearch";
    }
    
}
