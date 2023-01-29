package com.company.design;

import com.company.design.adapter.*;
import com.company.design.proxy.AopBrowser;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

//        singleton
//        AClazz aClazz = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient aClient = aClazz.getSocketClient();
//        SocketClient bClient = bClazz.getSocketClient();
//
//        System.out.println("A = B ?");
//        System.out.println(aClient.equals(bClient));

//        adapter
//        HairDryer hairDryer = new HairDryer();
//        connectTo(hairDryer);

//        Cleaner cleaner = new Cleaner();
//        Electronic110V cleanerAdapter = new SocketAdapter(cleaner);
//        connectTo(cleanerAdapter);
//        connect(cleaner);

//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110V AirAdapter = new SocketAdapter(airConditioner);
//        connectTo(AirAdapter);

//        proxy
//        Without proxy
//        Browser browser = new Browser("www.google.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        With proxy
//        BrowserProxy browserProxy = new BrowserProxy("www.google.com");
//        browserProxy.show();
//        browserProxy.show();
//        browserProxy.show();
//        browserProxy.show();

//        Proxy AOP

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.google.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );
        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        System.out.println("--------------------");

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }

    // 콘센트
    public static void connectTo(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
