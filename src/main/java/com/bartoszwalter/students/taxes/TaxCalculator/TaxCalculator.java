package com.bartoszwalter.students.taxes.TaxCalculator;

import com.bartoszwalter.students.taxes.contractTypes.ContractConstants;

public class TaxCalculator {

    public static void obliczZaliczke() {
        ContractConstants.zaliczkaUS = ContractConstants.zaliczkaNaPod - ContractConstants.s_zdrow2 - ContractConstants.kwotaZmiejsz;
    }

    public static void obliczPodatek(double podstawa) {
        ContractConstants.zaliczkaNaPod = (podstawa * 18) / 100;
    }

    public static double obliczPodstawe(double podstawa) {
        ContractConstants.s_emerytalna = (podstawa * 9.76) / 100;
        ContractConstants.s_rentowa = (podstawa * 1.5) / 100;
        ContractConstants.u_chorobowe = (podstawa * 2.45) / 100;
        return (podstawa - ContractConstants.s_emerytalna - ContractConstants.s_rentowa - ContractConstants.u_chorobowe);
    }

    public static void obliczUbezpieczenia(double podstawa) {
        ContractConstants.s_zdrow1 = (podstawa * 9) / 100;
        ContractConstants.s_zdrow2 = (podstawa * 7.75) / 100;
    }

}
