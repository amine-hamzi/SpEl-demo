package com.example.speldemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpElDemoApplication implements CommandLineRunner {

    private final SpELService spELService;

    public SpElDemoApplication(SpELService spELService) {
        this.spELService = spELService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpElDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.debug(spELService.getProp1()+"");
    }
}
