package com.bartoszwalter.students.taxes.Constants;

import java.text.DecimalFormat;

public class ContractConstants {
    // decimal formats
    public final static DecimalFormat twoDecimalPlacesFormat = new DecimalFormat("#.00");
    public final static DecimalFormat zeroDecimalPlacesFormat = new DecimalFormat("#");
    public static double taxDecresingAmount = 46.33; // kwota zmienjszająca podatek 46,33 PLN
    public static double base = 0;
    // składki na ubezpieczenia zdrowotne
    public static double healthContribution1 = 0; // od podstawy wymiaru 9%
    public static double healthContribution2 = 0; // od podstawy wymiaru 7,75 %
    public static double incomeTaxAdvance = 0; // zaliczka na podatek dochodowy 18%
    public static double advanceUS = 0;
    public static double pensionContribution = 0;
    public static double rentContribution = 0;
    public static double healthInsurance = 0;
    /* Constants */
    public static double incomeCosts = 111.25;
    public static double advanceUS0 = 0;

}
