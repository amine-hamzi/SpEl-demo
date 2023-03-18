package com.example.speldemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
@Setter
public class Support1 {

    public Support1() {
        prop10.put("s1", new Mod1("s1"));
        prop10.put("s2", new Mod1("s2"));
        prop10.put("s3", new Mod1("s3"));
        prop10.put("s4", new Mod1("s4"));
    }

    private String prop1 = "prop1";
    private static String prop2 = "prop2";
    private String prop5;
    private String prop6;
    private List<Mod1> prop8 = Arrays.asList(new Mod1("s1"), new Mod1("s2"), new Mod1("s3"), new Mod1("s4"));
    private Map<String, Mod1> prop10 = new HashMap<>();


    public static String getStaticProp2() {
        return prop2;
    }
}
