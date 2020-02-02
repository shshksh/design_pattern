package creational.abstractFactory;

import creational.abstractFactory.concretePizzaStore.NYPizzaStore;

public class Customer {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
