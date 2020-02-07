package creational.abstractFactory.AbstractFactory;

import creational.abstractFactory.AbstractProducts.*;

public interface PizzaIngredientFactory {

    // 인터페이스에 각 재료별 생성 메소드를 정의
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

    // 재료를 생산한다는 행동만 선언하고 구체적 구현은 구현 클래스에서 담당
    // 모든 팩토리 인스턴스에서 공통적으로 사용하는 부분이 있다면 인터페이스를 추상 클래스로 생성할 수도 있다.

}
