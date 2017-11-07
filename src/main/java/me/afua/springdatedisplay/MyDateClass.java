package me.afua.springdatedisplay;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDateClass {
    LocalDate theDate;
    String theDay;
    String longFormat;


    public MyDateClass()
    {
        theDate = LocalDate.now();
        theDay = theDate.getDayOfWeek().toString();
        this.setLongFormat();
    }

    public MyDateClass(String aDate)
    {
        theDate = LocalDate.parse(aDate);
        theDay = theDate.getDayOfWeek().name();
    }

    public LocalDate getTheDate() {
        return theDate;
    }

    public void setTheDate(LocalDate theDate) {
        this.theDate = theDate;
    }

    public String getTheDay() {
        return theDay;
    }

    public void setTheDay(String theDay) {
        this.theDay = theDay;
    }

    public String getLongFormat() {
        return longFormat;
    }

    public void setLongFormat() {
        DateTimeFormatter wholedate = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        this.longFormat =theDate.format(wholedate);
    }

    public String getTheFormattedDay() {
        return theDate.format(DateTimeFormatter.ofPattern("EEEE")).toString();
    }
}
