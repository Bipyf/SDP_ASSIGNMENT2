package com.company;

public class Main {

    public static void main(String[] args) {
	    Airport airport1 = new Airport();
	    airport1.addFlight("Astana - Almaty");
	    airport1.addFlight("Astana - Kyzylorda");
	    airport1.addFlight("Astana - Aqtau");

	    Passanger passanger1 = new Passanger("Alixan");
	    airport1.registerPassanger(passanger1);
	    Passanger passanger2 = new Passanger("Alina");
		airport1.registerPassanger(passanger2);
	    Passanger passanger3 = new Passanger("Alibek");
		airport1.registerPassanger(passanger3);

	    airport1.addFlight("Astana - Aktobe");
	    airport1.removeFlight("Astana - Almaty");
	    airport1.removeFlight("Astana - Kostanai");

	    airport1.unregisterPassanger(passanger2);
	    airport1.addFlight("Astana - Kostanai");
    }
}
