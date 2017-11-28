package com.demo.enums;

/**
 * Created by Nabeel on 12/17/2016.
 */
public class Gen<T> {


    T ob;
    Gen(T o){
        this.ob = o;
    }

    T getOb(){
        // return the value
        return ob;
    }
}
