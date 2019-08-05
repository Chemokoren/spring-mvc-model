package com.vega.springit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component //spring now knows that this component needs to be found
@Order(2)
public class DatabaseLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Database Loader ...");
    }
}
