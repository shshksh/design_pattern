package creational.factoryMethod.concretecreator;

import creational.factoryMethod.product.Pizza;
import creational.factoryMethod.creator.PizzaStore;
import creational.factoryMethod.concreteproduct.*;

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
