package creational.abstractFactory.ConcreteFactory;

import creational.abstractFactory.AbstractFactory.PizzaIngredientFactory;
import creational.abstractFactory.AbstractProducts.*;
import creational.abstractFactory.ConcreteProducts.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    // 재료군에 들어있는 각 재료로 뉴욕 버전을 생성
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarianraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Gollic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
