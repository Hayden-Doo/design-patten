package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Connecting Writer %s...", fileName);
        System.out.println(msg);
    }

    public void fileWriter(){
        String msg = String.format("Writing Writer %s's context...", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Disconnecting Writer %s...", fileName);
        System.out.println(msg);
    }
}
