package com.sms.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.auth.model.VehicleContact;
import com.sms.auth.model.VehicleType;
import com.sms.auth.model.VehicleUser;
import com.sms.auth.repository.VehicleContactRepository;
import com.sms.auth.repository.VehicleRepository;
import com.sms.auth.repository.VehicleTypeRepository;

@Service
public class VehicleUserServiceImpl implements VehicleUserService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private VehicleContactRepository vehicleContactRepository;
    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    @Override
    public void save(VehicleUser vehicleuser) {
        vehicleRepository.save(vehicleuser);
        for(VehicleContact vc : vehicleuser.getVehicleContact()){
        	vc.setVehicleUser(vehicleuser);
        }
        vehicleContactRepository.save(vehicleuser.getVehicleContact());
        for(VehicleType vt : vehicleuser.getVehicleType()){
        	vt.setVehicleUser(vehicleuser);
        }
        vehicleTypeRepository.save(vehicleuser.getVehicleType());
    }

}
