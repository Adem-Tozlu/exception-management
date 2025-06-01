package com.ademtozlu.service;
import com.ademtozlu.dto.DtoEmployee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);

}
