package aaa.bbb.ccc.ddd;

import java.lang.Override;import java.lang.Runnable;import java.lang.String;import java.lang.System;import java.util.List;

public class A {
    public void example(List<String> list, String string)
    {

        list.stream().filter(listValue -> string.equals(listValue)); // incorrect lambda replacement
    }
    void b() {
        Runnable c = new Runnable() {
            @Override
            public void run() {

                System.out.println(); // extract functional parameter here
            }
        };
    }
}