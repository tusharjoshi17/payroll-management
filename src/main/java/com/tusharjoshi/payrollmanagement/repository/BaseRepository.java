package com.tusharjoshi.payrollmanagement.repository;

import com.tusharjoshi.payrollmanagement.model.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.io.Serializable;

public interface BaseRepository <T, ID> extends JpaRepository<T, ID> {
}

