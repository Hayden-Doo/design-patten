package com.company.design.adapter;

public class HairDryer implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("Hair Dryer 110V On");
    }
}
