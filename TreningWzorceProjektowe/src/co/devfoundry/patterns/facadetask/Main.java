package co.devfoundry.patterns.facadetask;

import co.devfoundry.patterns.facadetask.bank.AtmMachineFacade;

public class Main {
    public static void main (String [] args){

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
