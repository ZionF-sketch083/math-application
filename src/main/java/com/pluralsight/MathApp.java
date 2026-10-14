package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args){
        System.out.println("Here is the total, Bob and Jerry.");

        double bobSalary = 6328.89;
        double garySalary = 3598.52;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is $"+ highestSalary);

        double carPrice = 78594.65;
        double truckPrice = 47902.08;
        double lowestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The lowest price is $"+ lowestPrice);

        double rad = 7.25;
        double area = Math.PI * rad * rad;
        System.out.println("Area of a Circle is: "+ area);

        double squareValue = 5.0;
        double squareRoot = Math.sqrt(5.0);
        System.out.println("The root of "+ squareValue +" is "+ squareRoot);

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x1,x2) + Math.pow(y1,y2));
        System.out.println("The distance between the points is "+ distance);

        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value of "+ negativeValue +" is "+ absoluteValue);

        double randomNum = Math.random();
        System.out.println("The random number is "+ randomNum);

        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        int hours = days * hoursPerDay;
        int minutes = hours * minutesPerHour;

        int seconds = Math.multiplyExact(minutes, secondsPerMinute);
        long milliseconds = Math.multiplyExact(seconds, millisecondsPerSecond);

        System.out.println("Minutes in "+ days +"days: "+ minutes);
        System.out.println("Milliseconds in "+ days +" days: "+ milliseconds);










    }
}
