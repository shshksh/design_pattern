package structural.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "��ī����";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
