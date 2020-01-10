package headFirstDP.factoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<>();
	
	protected void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding toppings...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}
	}
	
	protected void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	protected void cut() {
		System.out.println("Cutting the pozza into diaginal slices");
	}
	
	protected void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
}
