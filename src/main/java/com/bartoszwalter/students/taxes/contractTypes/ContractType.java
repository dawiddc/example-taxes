package com.bartoszwalter.students.taxes.contractTypes;

import java.util.Map;

public interface ContractType {

    void calculateContractRates();

    Map getValuesMap();
}
