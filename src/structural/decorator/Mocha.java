package structural.decorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " ��ī";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
