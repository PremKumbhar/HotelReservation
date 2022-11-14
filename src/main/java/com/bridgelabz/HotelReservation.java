package com.bridgelabz;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
    static List<HotelDetails> hotelList = new ArrayList<>();

    public void addNewHotel(String name, int price){
        HotelDetails temp = new HotelDetails(name, price);
        hotelList.add(temp);
    }

    public int countNoOfHotels(){
        return hotelList.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****WELCOME TO HOTEL RESERVATION******");

        System.out.println("How many hotels you want to enter : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println("Enter the hotel name : ");
            String hotelName = sc.next();
            System.out.println("Enter the hotel rates : ");
            int rates = sc.nextInt();

            HotelDetails list = new HotelDetails(hotelName, rates);
            hotelList.add(list);
        }
        System.out.println(hotelList);
    }
}
