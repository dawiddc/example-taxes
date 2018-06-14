package com.bartoszwalter.students.taxes.ContractTypes;

import com.bartoszwalter.students.taxes.Constants.ContractConstants;
import com.bartoszwalter.students.taxes.TaxCalculator.TaxCalculator;

import java.util.HashMap;
import java.util.Map;

public class ContractOfEmployment extends ContractConstants implements ContractType {

    Map valuesMap = new HashMap<String, String>();

    public Map getValuesMap() {
        return valuesMap;
    }

    public void calculateContractRates() {
        double oBase = TaxCalculator.countBase(base);
        TaxCalculator.countInsurance(oBase);
        double taxBase = oBase - incomeCosts;
        double taxBase0 = Double.parseDouble(zeroDecimalPlacesFormat.format(taxBase));
        TaxCalculator.countTax(taxBase0);
        double taxDeduct = incomeTaxAdvance - taxDecresingAmount;
        TaxCalculator.countAdvance();
        advanceUS0 = Double.parseDouble(zeroDecimalPlacesFormat.format(advanceUS));
        double salary = base - ((pensionContribution + rentContribution + healthInsurance) + healthContribution1 + advanceUS0);

        valuesMap.put("typUmowy", "UMOWA O PRACĘ");
        valuesMap.put("base", base);
        valuesMap.put("pensionContribution", twoDecimalPlacesFormat.format(pensionContribution));
        valuesMap.put("rentContribution", twoDecimalPlacesFormat.format(rentContribution));
        valuesMap.put("healthInsurance", twoDecimalPlacesFormat.format(healthInsurance));
        valuesMap.put("oPodstawa", twoDecimalPlacesFormat.format(oBase));
        valuesMap.put("healthContribution1", twoDecimalPlacesFormat.format(healthContribution1));
        valuesMap.put("healthContribution2", twoDecimalPlacesFormat.format(healthContribution2));
        valuesMap.put("incomeCosts", twoDecimalPlacesFormat.format(incomeCosts));
        valuesMap.put("podstawaOpodat", taxBase);
        valuesMap.put("podstawaOpodat0", zeroDecimalPlacesFormat.format(taxBase0));
        valuesMap.put("incomeTaxAdvance", incomeTaxAdvance);
        valuesMap.put("podatekPotracony", twoDecimalPlacesFormat.format(taxDeduct));
        valuesMap.put("advanceUS", twoDecimalPlacesFormat.format(advanceUS));
        valuesMap.put("advanceUS0", zeroDecimalPlacesFormat.format(advanceUS0));
        valuesMap.put("wynagrodzenie", twoDecimalPlacesFormat.format(salary));
    }
}
