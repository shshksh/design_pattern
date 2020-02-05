package creational.factoryMethod.creator;

import creational.factoryMethod.product.Pizza;

public abstract class PizzaStore {
	
	final public Pizza orderPizza (String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
