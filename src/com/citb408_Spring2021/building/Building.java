package com.citb408_Spring2021.building;

public class Building {
    private double area;

    public Building(double area) {
        this.area = area;
    }

    public void capacity(){
        System.out.println("Capacity of Building"+area);
    }
    @Override
    public String toString() {
        return "Building{" +
                "area=" + area +
                '}';
    }

    public double getArea() {
        return area;
    }
}
