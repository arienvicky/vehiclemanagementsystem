package com.sms.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.auth.model.VehicleContact;

public interface VehicleContactRepository extends JpaRepository<VehicleContact, Long> {

}
