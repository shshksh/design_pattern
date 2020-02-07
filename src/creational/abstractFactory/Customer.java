package creational.abstractFactory;

import creational.abstractFactory.Client.NYPizzaStore;
import creational.abstractFactory.Client.PizzaStore;

public class Customer {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
