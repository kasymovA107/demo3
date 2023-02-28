package com.example.demo.service;

import com.example.demo.cadasterWsdl.producer.GetPropertyInfo;
import com.example.demo.cadasterWsdl.producer.PropertyInfo;

public class CadasterImplService implements Cadaster{
    @Override
    public PropertyInfo getPropertyInfo(GetPropertyInfo request) {

        return  getPropertyInfo(request);
    }
}
