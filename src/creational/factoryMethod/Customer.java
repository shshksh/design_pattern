package creational.factoryMethod;

import creational.factoryMethod.concretecreator.ChicagoPizzaStore;
import creational.factoryMethod.concretecreator.NYPizzaStore;
import creational.factoryMethod.creator.PizzaStore;
import creational.factoryMethod.product.Pizza;

public class Customer {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a "+pizza.getName() + "\n");
	}
}
