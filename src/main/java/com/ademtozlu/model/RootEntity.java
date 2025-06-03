package com.ademtozlu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity<T> {

    private boolean result;

    private String errorMessage;

    private T data;

    public static <T> RootEntity <T> ok (T data) {
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setResult(true);
        rootEntity.setData(data);
        rootEntity.setErrorMessage(null);
        return rootEntity;
    }



}
