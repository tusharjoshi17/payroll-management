package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
