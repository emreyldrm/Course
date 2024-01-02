package org.example.javaCamp;



import org.example.javaCamp.oop.CreditService;
import org.example.javaCamp.oop.MortgageManager;
import org.example.javaCamp.oop.VehicleManager;

import java.util.ArrayList;

public class CampCode {
    public static void main(String[] args) {


        ArrayList<CreditService> credits = new ArrayList<>();
        credits.add(new MortgageManager());
        credits.add(new VehicleManager());

        for(CreditService credit : credits){
            credit.calculate();
        }
    }
}
