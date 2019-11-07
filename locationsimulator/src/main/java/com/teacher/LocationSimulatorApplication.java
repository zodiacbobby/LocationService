package com.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by teacher on 6/30/17.
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableScheduling
public class LocationSimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationSimulatorApplication.class, args);
    }
}
