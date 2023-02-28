package com.example.demo.model;

import com.example.demo.cadasterWsdl.producer.GetPropertyInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.startup.WebAnnotationSet;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class demoClient extends WebServiceGatewaySupport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String inn;
    @Column
    private String phoneNum;
    @Column
    private String passportSeries;
    @Column
    private Boolean isCitizen;

}
