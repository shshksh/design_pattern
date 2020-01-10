package headFirstDP.decorator;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +" µŒ¿Ø";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}

}
