package com.capstone.assesment_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String empName;
	private String email;
	private String password;
    private Role role;
    
    public Employee(String empName,String email,String password,Role role) {
    	this.empName=empName;
    	this.email=email;
    	this.password=password;
    	this.role=role;
    }
}
