package structural.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " ���� ��ũ";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
