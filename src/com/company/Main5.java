package com.company;

import java.time.LocalTime;

public class Main5 {
    public static void main(String[] args)
    {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time2= time.minusHours(1);
        System.out.println(time2);
    }
}
