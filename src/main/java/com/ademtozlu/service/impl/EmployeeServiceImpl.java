package com.ademtozlu.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ademtozlu.dto.DtoDepartment;
import com.ademtozlu.dto.DtoEmployee;
import com.ademtozlu.exception.BaseException;
import com.ademtozlu.exception.ErrorMessage;
import com.ademtozlu.exception.MessageType;
import com.ademtozlu.model.Department;
import com.ademtozlu.model.Employee;
import com.ademtozlu.service.IEmployeeService;
import com.ademtozlu.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

       @Autowired
        private EmployeeRepository employeeRepository;
    @Override
    public DtoEmployee findEmployeeById(Long id) {
    DtoEmployee dtoEmployee = new DtoEmployee();
    DtoDepartment dtoDepartment = new DtoDepartment();



      Optional<Employee> optional = employeeRepository.findById(id);
    if (optional.isEmpty()) {
      throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
        }
        Employee employee = optional.get();
        Department department = employee.getDepartment();
        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);


        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }

}
