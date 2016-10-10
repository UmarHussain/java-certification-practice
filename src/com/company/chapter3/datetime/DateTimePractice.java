package com.company.chapter3.datetime;

import java.time.*;

/**
 * Created by bv on 8/12/2016.
 */
public class DateTimePractice {

    public void dataPractice1(){
        LocalDate date = LocalDate.of(2014,Month.JANUARY,20);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28
    }

    public void decreasingDate(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30
        System.out.println(dateTime.minusNanos(23));
        System.out.println(dateTime);
    }

    public void EpochDateTime(){
        LocalDateTime dateTime =  LocalDateTime.now();

        Long epoch = dateTime.toEpochSecond(ZoneOffset.UTC);

    }

    public void periodClassPractice(){
        LocalDate start = LocalDate.of(2015,Month.JANUARY,1);
        LocalDate end  = LocalDate.of(2015,Month.MARCH,30);
        Period period = Period.ofMonths(1);
        //perf
    }

    public static void main(String[] args) {

       DateTimePractice dateTimePractice = new DateTimePractice();

      //  dateTimePractice.dataPractice1();
        dateTimePractice.decreasingDate();

    }

}
