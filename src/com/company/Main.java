package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

	// write your code here
    }
}
