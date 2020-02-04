package structural.decorator;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +", 두유";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}

}
