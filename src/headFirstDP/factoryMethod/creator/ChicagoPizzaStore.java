package headFirstDP.factoryMethod.creator;

import headFirstDP.factoryMethod.Pizza;
import headFirstDP.factoryMethod.PizzaStore;
import headFirstDP.factoryMethod.product.*;

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
