package creational.abstractFactory.Client.concretePizzas;

import creational.abstractFactory.AbstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    // 피자의 원재료를 공금하는 공장이 필요. 해당 가게에 맞는 공장에서 재료를 공급받는다.
    public CheesePizza (PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
