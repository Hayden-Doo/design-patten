package com.company.design;

import com.company.design.adapter.*;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

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
        HairDryer hairDryer = new HairDryer();
        connectTo(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanerAdapter = new SocketAdapter(cleaner);
        connectTo(cleanerAdapter);
//        connect(cleaner);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V AirAdapter = new SocketAdapter(airConditioner);
        connectTo(AirAdapter);

    }
    // 콘센트
    public static void connectTo(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
