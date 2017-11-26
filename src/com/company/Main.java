package com.company;

import com.company.OrderType.*;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.regex.Pattern;

public class Main {

    private static final Pattern RESPONSE_PATTERN = Pattern.compile("[A-Za-z0-9_-]+");

    public static void main(String[] args) {
	// write your code here
    //
       OrderType orderType =  OrderType.create("DELIVERY");
       System.out.println(orderType.getValue());
        System.out.println("Check the pattern " +new Main().
                responseSanityCheck("03AO6mBfxfyDqcETbv5Fzh0oyXLQkbgMzNptNKf6XFBHzOP27IIfplPrFu2iHFJek-Bt5mrhg4PvUeSJCeqDecK0ozknzsnqMGrMKYNb40unkw62fwYUgFQSAw-BejmqKs6gOLhJI6VMnEkw28IiNftNWGWFNG6ryiCYVX_lI2a4rWPf-0pCUS4qaiaH8T4sh3XjGQIowERx9AdfwRcYPYxtMkoGsf69bEW-XLokq61KhfrSAsbq13tbEaua-r3b1k440Yp99Jc35zzAQsWFVapEtqBYW4B_66Z-iY0-ricikomQkIfjuZzdfnwqRjuT5J4uK6p-n5fiBjDleAVCZbVFu-SNDfoh3NDZqI92ciIoPPxOpIOGSBJdS3AS5-ui6oKtCQlojBUMqjWjU6VNnzwx7tJE172V_bxw"));
        new Main().test();
    }

    private boolean responseSanityCheck(final String response) {
        // pattern
        return hasLength(response) && RESPONSE_PATTERN.matcher(response).matches() ;
    }

    public static boolean hasLength(String str) {
        return str != null && !str.isEmpty();
    }

    public void test() {
        int steps = 5;
        for (int x = 0; x < steps; x++) {
            System.out.format(((steps == (x + 1)) ? "" : ("%"
                    + ((steps - x - 1) * 5) + "s"))
                    + "  o  ******"
                    + ((x == 0) ? "" : ("%" + (x * 5) + "s"))
                    + "*\n", " ", " ");
            System.out.format(((steps == (x + 1)) ? "" : ("%"
                    + ((steps - x - 1) * 5) + "s"))
                    + " /|\\ *     "
                    + ((x == 0) ? "" : ("%" + (x * 5) + "s"))
                    + "*\n", " ", " ");
            System.out.format(((steps == (x + 1)) ? "" : ("%"
                    + ((steps - x - 1) * 5) + "s"))
                    + " / \\ *     "
                    + ((x == 0) ? "" : ("%" + (x * 5) + "s"))
                    + "*\n", " ", " ");
        }
        for (int i = 0; i < (steps + 1) * 5 + 2; i++) {
            System.out.print("*");
        }
    }

}
