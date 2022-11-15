package com.bridgelabz;

public class HotelDetails {
    private String name;
    private int weekEndRateRegCus;
    private int weekDayRateRegCus;
    private int weekEndRateRewCus;
    private int weekDayRateRewCus;

    public HotelDetails() {
    }

    public HotelDetails(String name, int weekEndRateRegCus, int weekDayRateRegCus, int weekEndRateRewCus, int weekDayRateRewCus) {
        this.name = name;
        this.weekEndRateRegCus = weekEndRateRegCus;
        this.weekDayRateRegCus = weekDayRateRegCus;
        this.weekEndRateRewCus = weekEndRateRewCus;
        this.weekDayRateRewCus = weekDayRateRewCus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekEndRateRegCus() {
        return weekEndRateRegCus;
    }

    public void setWeekEndRateRegCus(int weekEndRateRegCus) {
        this.weekEndRateRegCus = weekEndRateRegCus;
    }

    public int getWeekDayRateRegCus() {
        return weekDayRateRegCus;
    }

    public void setWeekDayRateRegCus(int weekDayRateRegCus) {
        this.weekDayRateRegCus = weekDayRateRegCus;
    }

    public int getWeekEndRateRewCus() {
        return weekEndRateRewCus;
    }

    public void setWeekEndRateRewCus(int weekEndRateRewCus) {
        this.weekEndRateRewCus = weekEndRateRewCus;
    }

    public int getWeekDayRateRewCus() {
        return weekDayRateRewCus;
    }

    public void setWeekDayRateRewCus(int weekDayRateRewCus) {
        this.weekDayRateRewCus = weekDayRateRewCus;
    }

    @Override
    public String toString() {
        return "HotelDetails{" +
                "name='" + name + '\'' +
                ", weekEndRateRegCus=" + weekEndRateRegCus +
                ", weekDayRateRegCus=" + weekDayRateRegCus +
                ", weekEndRateRewCus=" + weekEndRateRewCus +
                ", weekDayRateRewCus=" + weekDayRateRewCus +
                '}';
    }
}
