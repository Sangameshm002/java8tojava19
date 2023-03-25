package org.example.java10;

import java.util.HashMap;

public class VarDemo {

    public static void main(String[] args) {

        var map=new HashMap<String,String>();

        for(var entry:map.entrySet()){
            var value=entry.getValue();
        }
    }
}
