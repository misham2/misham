package com.example.Sample1Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Sample1.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
