package com.bartoszwalter.students.taxes;

import com.bartoszwalter.students.taxes.Constants.ContractConstants;
import com.bartoszwalter.students.taxes.ContractTypes.ContractAgreement;
import com.bartoszwalter.students.taxes.ContractTypes.ContractOfEmployment;
import com.bartoszwalter.students.taxes.ContractTypes.ContractType;
import com.bartoszwalter.students.taxes.utils.ResultPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    private static char contractType;

    public static void main(String[] args) {
        readInput();
        ContractType contract = createNewContract();
        contract.calculateContractRates();
        ResultPrinter.printContractInfoToConsole(contract.getValuesMap());
    }

    private static ContractType createNewContract() {
        if (contractType == 'P') {
            return new ContractOfEmployment();
        } else if (contractType == 'Z') {
            return new ContractAgreement();
        }
        return null;
    }

    private static void readInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Podaj kwotę dochodu: ");
        try {
            ContractConstants.base = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException ex) {
            System.out.println("Niepoprawna kwota dochodu");
            System.err.println(ex);
        }

        System.out.print("Typ umowy: (P)raca, (Z)lecenie: ");
        try {
            contractType = bufferedReader.readLine().charAt(0);
        } catch (IOException ex) {
            System.out.println("Niepoprawny typ umowy");
            System.err.println(ex);
        }
    }
}
