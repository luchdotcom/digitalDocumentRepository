package com.citb408_Spring2021.building;

public class Room extends Premise{
    private int numOfBad;

    public Room(double area, Building building, int numOfBad) {
        super(area, building);
        this.numOfBad = numOfBad;
    }


    public int getNumOfBad() {
        return numOfBad;
    }
    public void capacity(){
        super.capacity();
        System.out.println("Capacity of bad"+numOfBad);

    }
    @Override
    public String toString() {
        return "Room{" +
                "numOfBad=" + numOfBad +
                "} " + super.toString();
    }
}
