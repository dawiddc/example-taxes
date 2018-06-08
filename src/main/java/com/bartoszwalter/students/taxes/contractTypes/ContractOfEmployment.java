package com.bartoszwalter.students.taxes.contractTypes;

import com.bartoszwalter.students.taxes.TaxCalculator.TaxCalculator;

import java.util.HashMap;
import java.util.Map;

public class ContractOfEmployment extends ContractConstants implements ContractType {

    Map valuesMap = new HashMap<String, String>();

    public Map getValuesMap() {
        return valuesMap;
    }

    public void calculateContractRates() {
        double oPodstawa = TaxCalculator.obliczPodstawe(podstawa);
        TaxCalculator.obliczUbezpieczenia(oPodstawa);
        double podstawaOpodat = oPodstawa - kosztyUzyskania;
        double podstawaOpodat0 = Double.parseDouble(zeroDecimalPlacesFormat.format(podstawaOpodat));
        TaxCalculator.obliczPodatek(podstawaOpodat0);
        double podatekPotracony = zaliczkaNaPod - kwotaZmiejsz;
        TaxCalculator.obliczZaliczke();
        zaliczkaUS0 = Double.parseDouble(zeroDecimalPlacesFormat.format(zaliczkaUS));
        double wynagrodzenie = podstawa - ((s_emerytalna + s_rentowa + u_chorobowe) + s_zdrow1 + zaliczkaUS0);

        valuesMap.put("typUmowy", "UMOWA O PRACĘ");
        valuesMap.put("podstawa", podstawa);
        valuesMap.put("s_emerytalna", twoDecimalPlacesFormat.format(s_emerytalna));
        valuesMap.put("s_rentowa", twoDecimalPlacesFormat.format(s_rentowa));
        valuesMap.put("u_chorobowe", twoDecimalPlacesFormat.format(u_chorobowe));
        valuesMap.put("oPodstawa", twoDecimalPlacesFormat.format(oPodstawa));
        valuesMap.put("s_zdrow1", twoDecimalPlacesFormat.format(s_zdrow1));
        valuesMap.put("s_zdrow2", twoDecimalPlacesFormat.format(s_zdrow2));
        valuesMap.put("kosztyUzyskania", twoDecimalPlacesFormat.format(kosztyUzyskania));
        valuesMap.put("podstawaOpodat", podstawaOpodat);
        valuesMap.put("podstawaOpodat0", zeroDecimalPlacesFormat.format(podstawaOpodat0));
        valuesMap.put("zaliczkaNaPod", zaliczkaNaPod);
        valuesMap.put("podatekPotracony", twoDecimalPlacesFormat.format(podatekPotracony));
        valuesMap.put("zaliczkaUS", twoDecimalPlacesFormat.format(zaliczkaUS));
        valuesMap.put("zaliczkaUS0", zeroDecimalPlacesFormat.format(zaliczkaUS0));
        valuesMap.put("wynagrodzenie", twoDecimalPlacesFormat.format(wynagrodzenie));
    }
}
