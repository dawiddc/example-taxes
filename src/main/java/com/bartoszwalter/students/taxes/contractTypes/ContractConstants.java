package com.bartoszwalter.students.taxes.contractTypes;

import java.text.DecimalFormat;

public class ContractConstants {
    // decimal formats
    final static DecimalFormat twoDecimalPlacesFormat = new DecimalFormat("#.00");
    final static DecimalFormat zeroDecimalPlacesFormat = new DecimalFormat("#");
    public static double kwotaZmiejsz = 46.33; // kwota zmienjszająca podatek 46,33 PLN
    public static double podstawa = 0;
    // składki na ubezpieczenia zdrowotne
    public static double s_zdrow1 = 0; // od podstawy wymiaru 9%
    public static double s_zdrow2 = 0; // od podstawy wymiaru 7,75 %
    public static double zaliczkaNaPod = 0; // zaliczka na podatek dochodowy 18%
    public static double zaliczkaUS = 0;
    public static double s_emerytalna = 0;
    public static double s_rentowa = 0;
    public static double u_chorobowe = 0;
    /* Constants */
    static double kosztyUzyskania = 111.25;
    static double zaliczkaUS0 = 0;

}
