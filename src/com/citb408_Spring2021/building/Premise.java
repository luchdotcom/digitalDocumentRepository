package com.citb408_Spring2021.building;

public class Premise {
    private double area;
    private Building building;

    public Premise(double area, Building building) {
        this.area = area;
        this.building = building;
    }

    public Building getBuilding() {
        return building;
    }

    public double getArea() {
        return area;
    }
    public void capacity(){
        System.out.println("Capacity of Building"+area);

    }

    @Override
    public String toString() {
        return "Premise{" +
                "area=" + area +
                ", building=" + building +
                '}';
    }
}
