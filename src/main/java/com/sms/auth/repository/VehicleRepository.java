package com.sms.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.auth.model.VehicleUser;

public interface VehicleRepository extends JpaRepository<VehicleUser, Long> {

}
