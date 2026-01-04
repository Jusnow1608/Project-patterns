package co.devfoundry.patterns.strategy;

import co.devfoundry.patterns.strategy.chef.Chef;

public class Main {
    public static void main(String [] args){
    //nowe zamówienie - jajka na twardo

        Chef chef = new Chef("Gordon Gessler");
        chef.cook();
    //nowe zamówienie - jajka na miękko!
        chef.cook();
    }

}
