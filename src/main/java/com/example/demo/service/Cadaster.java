package com.example.demo.service;



import com.example.demo.cadasterWsdl.producer.GetPropertyInfo;
import com.example.demo.cadasterWsdl.producer.PropertyInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "Cadaster")
public interface Cadaster {
    @WebMethod
    @WebResult(name = "PropertyInfo")
    PropertyInfo getPropertyInfo(@WebParam(name = "GetPropertyInfo") GetPropertyInfo request);
}