package com.example.demo.controller;

import com.example.demo.cadasterWsdl.identifiers.ObjectFactory;
import com.example.demo.cadasterWsdl.identifiers.XRoadClientIdentifierType;
import com.example.demo.cadasterWsdl.producer.CadastreReferencesApp;
import com.example.demo.cadasterWsdl.producer.GetPropertyInfo;
import com.example.demo.cadasterWsdl.producer.GetPropertyPdf;
import com.example.demo.cadasterWsdl.producer.PropertyInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
@Controller(value = "/getProperty")
public class SoapClient {
    ObjectFactory factory = new ObjectFactory();
@PostMapping(name = "Info/v1")
public String getPropInfo(@RequestParam Long inn) throws Exception{


    XRoadClientIdentifierType clientIdentifier = factory.createXRoadClientIdentifierType();

    clientIdentifier.setXRoadInstance("--");
    clientIdentifier.setMemberClass("bla bla");
    clientIdentifier.setMemberCode("");
    clientIdentifier.setSubsystemCode("123");
    clientIdentifier.setServiceVersion("1.1.1");

    URL url = new URL("http://localhost:8080/CadasterService/Cadaster?wsdl");
    QName qname = new QName("http://producer.cadasterWsdl.demo.example.com/", "CadasterImplService");

    Service service = Service.create(url, qname);
    CadastreReferencesApp port = service.getPort(CadastreReferencesApp.class);

    GetPropertyInfo request = new GetPropertyInfo();
    request.setRequest(inn);

    PropertyInfo response = port.getPropertyInfo(request);

    System.out.println("Property ID: " + response.getForType());
    System.out.println("Address: " + response.getAddress());
    System.out.println("Own form: " + response.getOwnForm());
    System.out.println("For use type: " + response.getForUseType());
    System.out.println("Type: " + response.getType());
    System.out.println("Prop Code: " + response.getPropCode());
    return "success";

        }
    }
