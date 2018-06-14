package com.bartoszwalter.students.taxes.TaxCalculator;

import com.bartoszwalter.students.taxes.Constants.ContractConstants;

public class TaxCalculator {

    public static void countAdvance() {
        ContractConstants.advanceUS = ContractConstants.incomeTaxAdvance - ContractConstants.healthContribution2 - ContractConstants.taxDecresingAmount;
    }

    public static void countTax(double base) {
        ContractConstants.incomeTaxAdvance = (base * 18) / 100;
    }

    public static double countBase(double base) {
        ContractConstants.pensionContribution = (base * 9.76) / 100;
        ContractConstants.rentContribution = (base * 1.5) / 100;
        ContractConstants.healthInsurance = (base * 2.45) / 100;
        return (base - ContractConstants.pensionContribution - ContractConstants.rentContribution - ContractConstants.healthInsurance);
    }

    public static void countInsurance(double base) {
        ContractConstants.healthContribution1 = (base * 9) / 100;
        ContractConstants.healthContribution2 = (base * 7.75) / 100;
    }
}
