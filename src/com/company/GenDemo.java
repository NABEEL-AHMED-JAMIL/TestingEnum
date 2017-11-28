package com.demo.enums;

/**
 * Created by Nabeel on 12/17/2016.
 */
public class GenDemo {

    public static void main(String[] args){
        //
        Gen<Integer> iob = new Gen<Integer>(10);
        // get the value
        int i = iob.getOb();
        //
        Gen<String> iob1 = new Gen<String>("Nabeel");
        // get the value
        String str = iob1.getOb();

        System.out.print(str+"    "+i);
    }
}
