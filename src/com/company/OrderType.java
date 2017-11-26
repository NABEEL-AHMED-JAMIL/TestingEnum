package com.company;

/**
 * Created by Nabeel on 11/22/2017.
 */
public enum OrderType {

    TAKEAWAY("TAKEAWAY"),
    DINEIN("DINEIN"),
    DELIVERY("DELIVERY"),
    CATERING("CATERING");

    private String value;

    private OrderType(String value) {
        this.value = value;
    }

    public String getValue() { return value; }

    public static OrderType create(String value) {
        OrderType[] units = OrderType.values();
        for (OrderType unit: units){
            if(unit.getValue().equals(value)){
                return unit;
            }
        }
        return TAKEAWAY;
    }
}
