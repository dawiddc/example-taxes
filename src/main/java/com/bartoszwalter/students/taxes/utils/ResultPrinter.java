package com.bartoszwalter.students.taxes.utils;

import java.util.Map;

public class ResultPrinter {

    public static void printContractInfoToConsole(Map valuesMap) {

        System.out.println(valuesMap.get("typUmowy"));
        System.out.println("Podstawa wymiaru składek: " + valuesMap.get("base"));
        System.out.println("Składka na ubezpieczenie emerytalne: " + valuesMap.get("pensionContribution"));
        System.out.println("Składka na ubezpieczenie rentowe: " + valuesMap.get("rentContribution"));
        System.out.println("Składka na ubezpieczenie chorobowe: " + valuesMap.get("healthInsurance"));
        System.out.println("Podstawa wymiaru składki na ubezpieczenie zdrowotne: " + valuesMap.get("oPodstawa"));
        System.out.println("Składka na ubezpieczenie zdrowotne: 9%: " + valuesMap.get("healthContribution1") + "; 7,75%: " + valuesMap.get("healthContribution2"));
        System.out.println("Koszty uzyskania przychodu (stałe): " + valuesMap.get("incomeCosts"));
        System.out.println("Podstawa opodatkowania: " + valuesMap.get("podstawaOpodat")
                + "; zaokrąglona: " + valuesMap.get("podstawaOpodat0"));
        System.out.println("Zaliczka na podatek dochodowy 18%: " + valuesMap.get("zaliczkaPodatekDochodowy"));
        System.out.println("Podatek potrącony: " + valuesMap.get("podatekPotracony"));
        System.out.println("Zaliczka do urzędu skarbowego: " + valuesMap.get("advanceUS") + "; po zaokrągleniu: "
                + valuesMap.get("advanceUS0"));
        System.out.println();
        System.out.println("Pracownik otrzyma wynagrodzenie netto w wysokości: " + valuesMap.get("wynagrodzenie"));

    }
}
