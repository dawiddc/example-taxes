package com.bartoszwalter.students.taxes.contractTypes;

import com.bartoszwalter.students.taxes.TaxCalculator.TaxCalculator;

public class ContractAgreement extends ContractConstants implements ContractType {

    public void printContractInfoToConsole() {
        System.out.println("UMOWA-ZLECENIE");
        System.out.println("Podstawa wymiaru składek " + podstawa);
        double oPodstawa = TaxCalculator.obliczPodstawe(podstawa);
        System.out.println("Składka na ubezpieczenie emerytalne "
                + twoDecimalPlacesFormat.format(s_emerytalna));
        System.out.println("Składka na ubezpieczenie rentowe    "
                + twoDecimalPlacesFormat.format(s_rentowa));
        System.out.println("Składka na ubezpieczenie chorobowe  "
                + twoDecimalPlacesFormat.format(u_chorobowe));
        System.out
                .println("Podstawa wymiaru składki na ubezpieczenie zdrowotne: "
                        + oPodstawa);
        TaxCalculator.obliczUbezpieczenia(oPodstawa);
        System.out.println("Składka na ubezpieczenie zdrowotne: 9% = "
                + twoDecimalPlacesFormat.format(s_zdrow1) + " 7,75% = " + twoDecimalPlacesFormat.format(s_zdrow2));
        kwotaZmiejsz = 0;
        ContractConstants.kosztyUzyskania = (oPodstawa * 20) / 100;
        System.out.println("Koszty uzyskania przychodu (stałe) "
                + kosztyUzyskania);
        double podstawaOpodat = oPodstawa - kosztyUzyskania;
        double podstawaOpodat0 = Double.parseDouble(zeroDecimalPlacesFormat.format(podstawaOpodat));
        System.out.println("Podstawa opodatkowania " + podstawaOpodat
                + " zaokrąglona " + zeroDecimalPlacesFormat.format(podstawaOpodat0));
        TaxCalculator.obliczPodatek(podstawaOpodat0);
        System.out.println("Zaliczka na podatek dochodowy 18 % = "
                + zaliczkaNaPod);
        double podatekPotracony = zaliczkaNaPod;
        System.out.println("Podatek potrącony = "
                + twoDecimalPlacesFormat.format(podatekPotracony));
        TaxCalculator.obliczZaliczke();
        zaliczkaUS0 = Double.parseDouble(zeroDecimalPlacesFormat.format(zaliczkaUS));
        System.out.println("Zaliczka do urzędu skarbowego = "
                + twoDecimalPlacesFormat.format(zaliczkaUS) + " po zaokrągleniu = "
                + zeroDecimalPlacesFormat.format(zaliczkaUS0));
        double wynagrodzenie = podstawa
                - ((s_emerytalna + s_rentowa + u_chorobowe) + s_zdrow1 + zaliczkaUS0);
        System.out.println();
        System.out
                .println("Pracownik otrzyma wynagrodzenie netto w wysokości = "
                        + twoDecimalPlacesFormat.format(wynagrodzenie));

    }
}
