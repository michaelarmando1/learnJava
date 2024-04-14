package com.michael.learnjava.ch06_collections;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TimeRelated {
    public static void main(String[] args) {
        //localDate();
        //localTimeFunctions();
        //localDateTimeFunctions();
        periodAndDuration();

    }

    private static void periodAndDuration() {
        LocalDateTime ldt1 = LocalDateTime.parse("2020-02-23T20:23:12");
        LocalDateTime ldt2 = ldt1.plus(Period.ofYears(2));
        System.out.println(ldt2); //prints: 2022-02-23T20:23:12
    }

    private static void localDateTimeFunctions() {
        //System.out.println(LocalDateTime.now());

//        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
//        //System.out.println(LocalDateTime.now(zoneId));
//
//        LocalDateTime ldt1 = LocalDateTime.parse("2020-02-23T20:23:12");
//        //System.out.println(ldt1);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        LocalDateTime ldt2 =
//                LocalDateTime.parse("23/02/2020 20:23:12", formatter);
//        System.out.println(ldt2); //prints: 2020-02-23T20:23:12

        LocalDateTime ldt3 = LocalDateTime.of(2020, 2, 23, 20, 23, 12);
        //System.out.println(ldt3); //prints: 2020-02-23T20:23:12

        LocalDateTime ldt4 = LocalDateTime.of(2020, Month.FEBRUARY, 23, 20, 23, 12);
        //System.out.println(ldt4); //prints: 2020-02-23T20:23:12


        LocalDate ld = LocalDate.of(2020, 2, 23);
        LocalTime lt = LocalTime.of(20, 23, 12);
        LocalDateTime ldt5 = LocalDateTime.of(ld, lt);
        System.out.println(ldt5); //prints: 2020-02-23T20:23:12


    }

    private static void localTimeFunctions() {

//        System.out.println(LocalTime.now());

          ZoneId zoneId = ZoneId.of("Asia/Tokyo");

          //System.out.println(LocalTime.now(zoneId));

          LocalTime lt1 = LocalTime.parse("20:23:12");
          //System.out.println(lt1);

          LocalTime lt2 = LocalTime.of(20, 23, 12);
          //System.out.println(lt2); //prints: 20:23:12

          System.out.println(lt2.getHour()); //prints: 20
          System.out.println(lt2.getMinute()); //prints: 23
          System.out.println(lt2.getSecond()); //prints: 12
          System.out.println(lt2.getNano()); //prints: 0

//          System.out.println(lt2.withHour(3)); //prints: 03:23:12
//          System.out.println(lt2.withMinute(10)); //prints: 20:10:12
//          System.out.println(lt2.withSecond(15)); //prints: 20:23:15
//          System.out.println(lt2.withNano(300)); //prints: 20:23:12.000000300
//          System.out.println(lt2.plusHours(10)); //prints: 06:23:12
//          System.out.println(lt2.plusMinutes(2)); //prints: 20:25:12
//          System.out.println(lt2.plusSeconds(2)); //prints: 20:23:14
//          System.out.println(lt2.plusNanos(200)); //prints: 20:23:12.000000200
//          System.out.println(lt2.minusHours(10)); //prints: 10:23:12
//          System.out.println(lt2.minusMinutes(2)); //prints: 20:21:12
//          System.out.println(lt2.minusSeconds(2)); //prints: 20:23:10
//          System.out.println(lt2.minusNanos(200)); //prints: 20:23:11.999999800

    }



    public static void localDate(){
        //System.out.println(LocalDate.now());


//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//        for(String zoneId: zoneIds) {
//            //System.out.println(zoneId);
//        }

        //America/Toronto
        ZoneId zoneId = ZoneId.of("America/Toronto");
        //System.out.println(LocalDate.now(zoneId));

//        LocalDate lc1 = LocalDate.parse("2023-01-13");
//        System.out.println(lc1);

//        LocalDate lc2 = LocalDate.parse("20230123", DateTimeFormatter.BASIC_ISO_DATE);
//        System.out.println(lc2);

//        LocalDate lc4 = LocalDate.of(2020, 2, 23);
//        System.out.println(lc4);

//        LocalDate lc5 = LocalDate.of(2020, Month.FEBRUARY, 23);
//        System.out.println(lc5);

//          LocalDate lc6 = LocalDate.ofYearDay(2023, 87);
//          System.out.println(lc6);
//
//          LocalDate lc = LocalDate.parse("2020-02-23");
//          System.out.println(lc.withYear(2021));
//          System.out.println(lc.withMonth(5));
//          System.out.println(lc.withDayOfMonth(5));
//          System.out.println(lc.plusDays(10)); //prints: 2020-03-04
//          System.out.println(lc.plusMonths(2)); //prints: 2020-04-23
//          System.out.println(lc.plusYears(2)); //prints: 2022-02-23
//          System.out.println(lc.minusDays(10)); //prints: 2020-02-13
//          System.out.println(lc.minusMonths(2)); //prints: 2019-12-23
//          System.out.println(lc.minusYears(2)); //prints: 2018-02-23

//            LocalDate lc1 = LocalDate.parse("2020-02-23");
//            LocalDate lc2 = LocalDate.parse("2020-02-22");
//            System.out.println(lc1.isAfter(lc2)); //prints: true
//            System.out.println(lc1.isBefore(lc2)); //prints: false


    }
}
