package com.sms.auth.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_user_contact")
public class VehicleContact {
    private Long id;
    private String phoneno;
    private VehicleUser vehicleUser;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	/**
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return phoneno;
	}

	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

    /**
	 * @return the vehicleUser
	 */
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vehicleuserid")
	public VehicleUser getVehicleUser() {
		return vehicleUser;
	}

	/**
	 * @param vehicleUser the vehicleUser to set
	 */
	public void setVehicleUser(VehicleUser vehicleUser) {
		this.vehicleUser = vehicleUser;
	}

	public VehicleContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleContact(Long id, String phoneno, VehicleUser vehicleUser) {
		super();
		this.id = id;
		this.phoneno = phoneno;
		this.vehicleUser = vehicleUser;
	}
   
}
