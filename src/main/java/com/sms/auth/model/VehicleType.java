package com.sms.auth.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "vehicle_type")
public class VehicleType {
    private Long id;
    @NotBlank
    private String type;
    @NotBlank
    private String stickerno;
    @NotBlank
    private String dateofissue;
    @NotBlank
    private String vehicleno;
  /**
	 * @return the vehicleno
	 */
	public String getVehicleno() {
		return vehicleno;
	}

	/**
	 * @param vehicleno the vehicleno to set
	 */
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the stickerno
	 */
	public String getStickerno() {
		return stickerno;
	}

	/**
	 * @param stickerno the stickerno to set
	 */
	public void setStickerno(String stickerno) {
		this.stickerno = stickerno;
	}

	/**
	 * @return the dateofissue
	 */
	public String getDateofissue() {
		return dateofissue;
	}

	/**
	 * @param dateofissue the dateofissue to set
	 */
	public void setDateofissue(String dateofissue) {
		this.dateofissue = dateofissue;
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

		public VehicleType() {
			super();
			// TODO Auto-generated constructor stub
		}

		public VehicleType(Long id, String type, String stickerno, String dateofissue, VehicleUser vehicleUser) {
			super();
			this.id = id;
			this.type = type;
			this.stickerno = stickerno;
			this.dateofissue = dateofissue;
			this.vehicleUser = vehicleUser;
		}


}
