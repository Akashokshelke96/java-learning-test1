package questions;

import java.util.Calendar;

class leapYear {

        public static void main(String args[]) {

            //Testing some leap and non-leap year using Java library code
            System.err.println("Is 2000 a leap year ? : " + isLeapYear(2000));
            System.err.println("Is 2012 a leap year ? : " + isLeapYear(2012));
            System.err.println("Is 1901 a leap year ? : " + isLeapYear(1901));
            System.err.println("Is 1900 a leap year ? : " + isLeapYear(1900));


            //Checking leap year without using library or API and applying logic
            System.err.println("Does 2000 a leap year : " + doesLeapYear(2000));
            System.err.println("Does 2012 a leap year : " + doesLeapYear(2012));
            System.err.println("Does 1901 a leap year : " + doesLeapYear(1901));
            System.err.println("Does 1900 a leap year : " + doesLeapYear(1900));
        }


    public static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance(); //gets Calendar based on local timezone and locale
        cal.set(Calendar.YEAR, year); //setting the calendar year
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

        if (noOfDays > 365) {
            return true;
        }

        return false;
    }

    /*
     * This method uses standard logic to check leap year in Java.
     * A year is a leap year if its multiple of 400 or multiple of 4 but not 100
     */
    public static boolean doesLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0));
    }
}