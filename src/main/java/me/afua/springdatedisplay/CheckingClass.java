package me.afua.springdatedisplay;

public class CheckingClass {
    public static void main(String[] args) {
        MyDateClass dateClass = new MyDateClass();
        System.out.println("Today is a " +dateClass.getTheDay());
        System.out.println("Today is "+dateClass.getLongFormat());
    }
}
