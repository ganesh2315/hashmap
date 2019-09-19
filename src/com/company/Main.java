package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        HashMap users=new HashMap<>();
        HashMap<String,Integer> newuser=new HashMap<>();
        newuser.put("Apu",18);

        System.out.println(newuser.get("Apu"));
        users.put("Aparna",18);
        users.put("Ganesh",21);

        if (users.containsKey("Aparna")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        Iterator it=users.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair=(Map.Entry)it.next();
            System.out.println(pair.getKey() +" = " + pair.getValue());
        }
       // System.out.println("values:"+users.values());
       // System.out.println("entire values :"+users.entrySet());
       // System.out.println(users.get("Aparna"));
       // System.out.println(users.get("Ganesh"));
    }
}
