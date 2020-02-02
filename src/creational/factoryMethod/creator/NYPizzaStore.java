package creational.factoryMethod.creator;

import creational.factoryMethod.Pizza;
import creational.factoryMethod.PizzaStore;
import creational.factoryMethod.product.*;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza (String item) {
		if (item.equals("cheese") ) {
			return new NYStyleCheesePizza();
		} else if (item.contentEquals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
