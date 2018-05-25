package com.bartoszwalter.students.taxes;

import com.bartoszwalter.students.taxes.contractTypes.ContractAgreement;
import com.bartoszwalter.students.taxes.contractTypes.ContractConstants;
import com.bartoszwalter.students.taxes.contractTypes.ContractOfEmployment;
import com.bartoszwalter.students.taxes.contractTypes.ContractType;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {
        char umowa;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            System.out.print("Podaj kwotę dochodu: ");
            ContractConstants.podstawa = Double.parseDouble(bufferedReader.readLine());

            System.out.print("Typ umowy: (P)raca, (Z)lecenie: ");
            umowa = bufferedReader.readLine().charAt(0);

        } catch (Exception ex) {
            System.out.println("Błędna kwota");
            System.err.println(ex);
            return;
        }

        if (umowa == 'P') {
            ContractType contract = new ContractOfEmployment();
            contract.printContractInfoToConsole();
        } else if (umowa == 'Z') {
            ContractType contract = new ContractAgreement();
            contract.printContractInfoToConsole();
        } else {
            System.out.println("Nieznany typ umowy!");
        }
    }
}
