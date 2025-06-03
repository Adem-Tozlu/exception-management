package com.ademtozlu.controller;

import com.ademtozlu.dto.DtoEmployee;
import com.ademtozlu.model.RootEntity;


public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);

}
