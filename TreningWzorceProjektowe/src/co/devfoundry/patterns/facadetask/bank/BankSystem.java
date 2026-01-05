package co.devfoundry.patterns.facadetask.bank;

class BankSystem {

    void transferMoney(){
        System.out.println("Money has been transferred.");
    }

    boolean validatePin(){
        System.out.println("PIN number validated.");
        return true;
    }

    boolean validateTransaction (){
        System.out.println("Transaction validated.");
        return true;
    }

    void getTransactionHistory(){
        System.out.println("Transaction history displayed.");
    }
}
