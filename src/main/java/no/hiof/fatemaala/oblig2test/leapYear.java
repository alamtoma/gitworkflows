package no.hiof.fatemaala.oblig2test;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        boolean isleapYear;
        isleapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isleapYear)
        {
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");


    }


}