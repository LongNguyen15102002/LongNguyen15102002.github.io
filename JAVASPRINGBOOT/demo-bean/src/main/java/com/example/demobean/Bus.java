package com.example.demobean;

import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Đi học bằng xe bus");
    }
}
