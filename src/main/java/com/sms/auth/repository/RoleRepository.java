package com.sms.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
