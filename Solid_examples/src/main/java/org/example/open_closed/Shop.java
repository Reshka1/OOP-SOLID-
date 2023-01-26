package org.example.open_closed;

import java.util.ArrayList;

public class Shop {
    private CarPrice carPrice;

    public Shop(CarPrice carPrice) {this.carPrice = carPrice;}

    public String shop(){return this.carPrice.getPrice(); }

    public ArrayList<CarPrice> allModel = new ArrayList<>()
    {
        Tesla
        Skoda;
    };
}
