package com.bartoszwalter.students.taxes.utils;

import java.util.Map;

public class ResultPrinter {

    public static void printContractInfoToConsole(Map valuesMap) {

        System.out.println(valuesMap.get("typUmowy"));
        System.out.println("Podstawa wymiaru składek: " + valuesMap.get("podstawa"));
        System.out.println("Składka na ubezpieczenie emerytalne: " + valuesMap.get("s_emerytalna"));
        System.out.println("Składka na ubezpieczenie rentowe: " + valuesMap.get("s_rentowa"));
        System.out.println("Składka na ubezpieczenie chorobowe: " + valuesMap.get("u_chorobowe"));
        System.out.println("Podstawa wymiaru składki na ubezpieczenie zdrowotne: " + valuesMap.get("oPodstawa"));
        System.out.println("Składka na ubezpieczenie zdrowotne: 9%: " + valuesMap.get("s_zdrow1") + "; 7,75%: " + valuesMap.get("s_zdrow2"));
        System.out.println("Koszty uzyskania przychodu (stałe): " + valuesMap.get("kosztyUzyskania"));
        System.out.println("Podstawa opodatkowania: " + valuesMap.get("podstawaOpodat")
                + "; zaokrąglona: " + valuesMap.get("podstawaOpodat0"));
        System.out.println("Zaliczka na podatek dochodowy 18%: " + valuesMap.get("zaliczkaPodatekDochodowy"));
        System.out.println("Podatek potrącony: " + valuesMap.get("podatekPotracony"));
        System.out.println("Zaliczka do urzędu skarbowego: " + valuesMap.get("zaliczkaUS") + "; po zaokrągleniu: "
                + valuesMap.get("zaliczkaUS0"));
        System.out.println();
        System.out.println("Pracownik otrzyma wynagrodzenie netto w wysokości: " + valuesMap.get("wynagrodzenie"));

    }
}
