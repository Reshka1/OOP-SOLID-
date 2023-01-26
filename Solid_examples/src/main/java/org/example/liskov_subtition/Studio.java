package org.example.liskov_subtition;

public class Studio extends HouseParametr {

    public void countRooms()
    {
      System.out.println("Studio has 1 room");
    }

    public void decorated()
    {
        System.out.println("Studio has not decorated");
    }
}
