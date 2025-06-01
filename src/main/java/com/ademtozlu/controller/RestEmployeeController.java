package com.ademtozlu.controller;

import com.ademtozlu.dto.DtoEmployee;


public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);

}
