package com.sms.auth.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "vehicle_user")
public class VehicleUser {
    private Long id;
    @NotBlank
    private String fname;
    private String mname;
    @NotBlank
    private String lname;
    @NotBlank
    private String block;
    @NotBlank
    private String houseno;
    @NotBlank
    private String floor;
    @NotBlank
    private String comments;
    @NotBlank
   private String ownership;
    
    @Email
    private String email;
    @Valid
    private List<VehicleContact> vehicleContact ;
    @Valid
    private List<VehicleType> vehicleType;
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}

	/**
	 * @param mname the mname to set
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the block
	 */
	public String getBlock() {
		return block;
	}

	/**
	 * @param block the block to set
	 */
	public void setBlock(String block) {
		this.block = block;
	}

	/**
	 * @return the houseno
	 */
	public String getHouseno() {
		return houseno;
	}

	/**
	 * @param houseno the houseno to set
	 */
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the ownership
	 */
	public String getOwnership() {
		return ownership;
	}

	/**
	 * @param ownership the ownership to set
	 */
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	/**
	 * @return the vehicleContact
	 */
	@OneToMany(targetEntity=VehicleContact.class, mappedBy="vehicleUser",  cascade = CascadeType.ALL)
	public List<VehicleContact> getVehicleContact() {
		return vehicleContact;
	}

	/**
	 * @param vehicleContact the vehicleContact to set
	 */
	public void setVehicleContact(List<VehicleContact> vehicleContact) {
		this.vehicleContact = vehicleContact;
	}

	/**
	 * @return the vehicleType
	 */
	@OneToMany(targetEntity=VehicleType.class, mappedBy="vehicleUser", cascade = CascadeType.ALL)
	public List<VehicleType> getVehicleType() {
		return vehicleType;
	}

	public VehicleUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleUser(Long id, String fname, String mname, String lname, String block, String houseno, String floor,
			String ownership, List<VehicleContact> vehicleContact, List<VehicleType> vehicleType, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.block = block;
		this.houseno = houseno;
		this.floor = floor;
		this.ownership = ownership;
		this.vehicleContact = vehicleContact;
		this.vehicleType = vehicleType;
		this.email = email;
	}

	/**
	 * @param vehicleType the vehicleType to List
	 */
	public void setVehicleType(List<VehicleType> vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
   
}
