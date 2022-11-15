package com.bridgelabz;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HotelReservation {
    static List<HotelDetails> hotelList = new ArrayList<>();

    public void addHotel(HotelDetails obj){

        hotelList.add(obj);
    }

    public long getTotalNoOfDays(String start, String end) throws ParseException {
        Date startDate = new SimpleDateFormat("ddMMMyyyy").parse(start);
        Date endDate = new SimpleDateFormat("ddMMMyyyy").parse(end);
        long TotalNoOfDays = 1 + (endDate.getTime() - startDate.getTime());
        return TotalNoOfDays;
    }
    public HotelDetails findCheapestHotel(){
        HotelDetails cheapestHotel = hotelList.stream().min(Comparator.comparing(HotelDetails::getWeekDayRateRegCus))
                .orElse(null);
        return cheapestHotel;
    }

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("*****WELCOME TO HOTEL RESERVATION******");
//        HotelDetails hotel1 = new HotelDetails("Lakewood", 90, 110, 80, 80);
//        HotelDetails hotel2 = new HotelDetails("Bridgewoood", 60, 160, 50, 110);
//        HotelDetails hotel3 = new HotelDetails("Ridgewood", 150, 220, 40, 100);
//
//        HotelReservation hotelReservation = new HotelReservation();
//        hotelReservation.addNewHotel(hotel1);
//        hotelReservation.addNewHotel(hotel2);
//        hotelReservation.addNewHotel(hotel3);
//        System.out.println(hotel1);
//        System.out.println(hotel2);
//        System.out.println(hotel3);
//
//        System.out.println("CHEAPEST HOTEL");
//        System.out.println(hotelReservation.findCheapestHotel());

        Scanner sc = new Scanner(System.in);
        System.out.println("*****WELCOME TO HOTEL RESERVATION******");
        HotelDetails hotel1 = new HotelDetails("Lakewood", 90, 110, 80, 80);
        HotelDetails hotel2 = new HotelDetails("Bridgewoood", 60, 160, 50, 110);
        HotelDetails hotel3 = new HotelDetails("Ridgewood", 150, 220, 40, 100);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel(hotel1);
        hotelReservation.addHotel(hotel2);
        hotelReservation.addHotel(hotel3);
        System.out.println("Enter the check in date in proper format(ddMMMyyyy) ex.10Sep2020");
        String startDate = sc.nextLine();
        System.out.println("Enter the check out date in proper format(ddMMMyyyy) ex.11Sep2020");
        String endDate = sc.nextLine();
        HotelDetails cheapestHotel = hotelReservation.findCheapestHotel();
        long totalDays = hotelReservation.getTotalNoOfDays("10Sep2020", "11Sep2020");
        long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;

        System.out.println("Cheapest Hotel for your stay: " + cheapestHotel.getName());
        System.out.println("Total expense: " + totalCost);
        }
    }
