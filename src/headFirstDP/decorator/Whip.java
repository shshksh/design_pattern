package headFirstDP.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " ½ºÆÀ ¹ÐÅ©";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
