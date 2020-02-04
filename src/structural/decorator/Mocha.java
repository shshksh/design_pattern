package structural.decorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	} // Mocha 로 장식하고자 하는 대상을 저장

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
