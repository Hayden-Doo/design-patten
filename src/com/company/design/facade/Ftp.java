package com.company.design.facade;

public class Ftp {

    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path){
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("FTP Host : " + host + " Port : " + port + " connecting...");
    }

    public void moveDirectory(){
        System.out.println("FTP path : " + path + " moving...");
    }

    public void disConnect(){
        System.out.println("FTP connecting end...");
    }
}
