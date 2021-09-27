package com.company;

import java.util.ArrayList;
import java.util.List;

public class Airport implements Observable {

    private List<String> flights = new ArrayList<>();
    private List<Observer> passengers = new ArrayList<>();

    public void addFlight(String flight) {
        this.flights.add(flight);
        notifyAllPassangers("we want to tell that a new flight: "+flight+" has been added on schedule");

    }

    public void removeFlight(String flight) {
        if (this.flights.indexOf(flight)== -1)
            System.out.println("No such flight exists");
        else
            this.flights.remove(flight);
            notifyAllPassangers("we want to tell the flight: "+flight+" has been taken off and removed from schedule.");
    }

    @Override
    public void registerPassanger(Observer passanger) {
        this.passengers.add(passanger);
    }

    @Override
    public void unregisterPassanger(Observer passanger) {
        this.passengers.remove(passanger);
    }

    @Override
    public void notifyAllPassangers(String stmnt) {
        for (Observer passanger:passengers)
            passanger.update(this.flights, stmnt);

    }
}
