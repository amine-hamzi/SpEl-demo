package com.example.speldemo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class SpELService {
    //we can @Value("#{support1.getProp1()}")
    @Value("#{support1.prop1}")
    private String prop1;

    //calling static method and static fields
    @Value("#{T(com.example.speldemo.Support1).getStaticProp2()}")
    private String prop2;

    @Value("${SpEL.service.prop3:0.0}")
    private double prop3;

    @Value("#{new String(\"prop4\")}")
    private String prop4;

    //setting value
    @Value("#{support1.prop5 = 'prop5'}")
    private String prop5;

    //safe navigation operator ? to avoid NullPointerException
    @Value("#{support1.prop6?.toLowerCase()}")
    private String prop6;

    //elvis operator
    @Value("#{support1.prop6?:'prop7'}")
    private String prop7;

    //Collection Selection
    @Value("#{support1.prop8.?[prop1.contains('s')]}")
    private List<Mod1> prop8;

    //Collection Projection
    @Value("#{support1.prop8.![prop1]}")
    private List<String> prop9;

    //Collection Projection with map
    @Value("#{support1.prop10.![getValue()]}")
    private List<Mod1> prop10;
}
