package com.company;

public interface Observable {
    void registerPassanger(Observer passanger);
    void unregisterPassanger(Observer passanger);
    void notifyAllPassangers(String stmnt);
}
