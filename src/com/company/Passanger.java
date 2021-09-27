package com.company;

import java.util.List;

public class Passanger implements Observer {
    private String passangerName;

    public Passanger(String passangerName) {
        this.passangerName = passangerName;
    }

    @Override
    public void update(List<String> flights, String stmnt) {
        System.out.println("Dear "+passangerName+", "+stmnt+" and please be aware that of the available flights right now:");
        System.out.println(flights);

    }
}
