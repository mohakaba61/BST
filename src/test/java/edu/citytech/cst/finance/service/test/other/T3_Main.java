package edu.citytech.cst.finance.service.test.other;

import edu.citytech.finance.model.Payment;
import edu.citytech.finance.service.MortgageService;
import static edu.citytech.finance.service.MortgageService.*;

import java.util.Date;

public class T3_Main {
    public static void main (String [] args){

        double extraPayment=200;

        Payment [] payments = getAllMonthlyPayments(300_000, 30, .06, extraPayment);

        for(Payment cp: payments){
            System.out.println(cp);
        }
    }
}
