package com.company.design.facade;

public class Reader {

    private String fileName;

    public Reader(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Connecting Reader %s...", fileName);
        System.out.println(msg);
    }

    public void fileRead(){
        String msg = String.format("Reading Reader %s's context...", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Disconnecting Reader %s...", fileName);
        System.out.println(msg);
    }
}
