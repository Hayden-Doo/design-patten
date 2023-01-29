package com.company.design.adapter;

public class AirConditioner implements Electronic220V {
    @Override
    public void connnect() {
        System.out.println("AirConditioner 220V On");
    }
}
