package com.company.design.adapter;

public class Cleaner implements Electronic220V {
    @Override
    public void connnect() {
        System.out.println("Cleaner 220V On");
    }
}