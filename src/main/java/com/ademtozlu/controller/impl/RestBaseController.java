package com.ademtozlu.controller.impl;

import com.ademtozlu.model.RootEntity;

public class RestBaseController {

    public <T> RootEntity<T> ok(T data){
        return RootEntity.ok(data);
    }
   

}
