package headFirstDP.factoryMethod.creator;

import headFirstDP.factoryMethod.Pizza;
import headFirstDP.factoryMethod.PizzaStore;
import headFirstDP.factoryMethod.product.*;

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
