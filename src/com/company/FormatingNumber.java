package com.company;

import java.text.NumberFormat;

public class FormatingNumber {
    public static void main(String []args)
    {
        NumberFormat percent=NumberFormat.getCompactNumberInstance();
       String result= percent.format(1000000000);
        System.out.println(result);

        String india=NumberFormat.getCurrencyInstance().format(1010000);
        System.out.println(india);

    }
}
