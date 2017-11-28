package com.demo.enums;

/**
 * Created by Nabeel on 12/17/2016.
 */
public class TestEnum {

    public static void main(String[] args){
        //
        Apple apple;
        // know one by one get the value
        // get first id----test
        System.out.println("Jonatan Apple id "+Apple.Jonatan.getId());
        System.out.println("Jonatan Apple price"+Apple.Jonatan.getPrice());
        //
        // get first id----test
        System.out.println("Golden Apple id "+Apple.Golden.getId());
        System.out.println("Golden Apple price "+Apple.Golden.getPrice());
        // know try to set the now value
        Apple.Golden.setId(10000000);
        System.out.println("After the update the id........");
        System.out.println("Golden Apple id "+Apple.Golden.getId());
        //-----------------------------------------------------------
        // know get the name of the All Apple'
        Apple[] apples = Apple.values();
        //
        for (Apple apple1: apples) {
            System.out.println("Apple id "+apple1.getId() );
            System.out.println("Apple Name "+ apple1.getName());
            System.out.println("Apple price "+ apple1.getPrice());
        }

    }

}
