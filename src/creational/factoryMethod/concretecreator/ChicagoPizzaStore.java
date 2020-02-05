package creational.factoryMethod.concretecreator;

import creational.factoryMethod.product.Pizza;
import creational.factoryMethod.creator.PizzaStore;
import creational.factoryMethod.concreteproduct.*;

public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza (String item) {
		if (item.equals("cheese") ) {
			return new ChicagoStyleCheesePizza();
		} else if (item.contentEquals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}
