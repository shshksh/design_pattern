package structural.adapter.client;

import structural.adapter.target.MallarDuck;
import structural.adapter.adaptee.WildTurkey;
import structural.adapter.adapter.TurkeyAdapter;
import structural.adapter.target.Duck;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
