package structural.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "��ũ �ν�Ʈ"	;
	}
	
	@Override
	public double cost() {
		return .99;
	}

}
