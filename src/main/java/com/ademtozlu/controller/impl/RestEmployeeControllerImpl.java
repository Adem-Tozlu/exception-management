package com.ademtozlu.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ademtozlu.controller.RestEmployeeController;
import com.ademtozlu.dto.DtoEmployee;
import com.ademtozlu.model.RootEntity;
import com.ademtozlu.service.IEmployeeService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
       return ok(employeeService.findEmployeeById(id));
    }

}
