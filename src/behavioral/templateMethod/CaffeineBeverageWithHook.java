package behavioral.templateMethod;

public abstract class CaffeineBeverageWithHook { // 추상 클래스로 정의하여 알고리즘의 일부를 서브 클래스에서 정의

    final void prepareRecipe() { // 알고리즘의 단계를 고정하기 위해 final 로 선언
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hooks();
    }

    private void boilWater() { // 공통적인 동작
        System.out.println("물 끓이는 중");
    }
    protected abstract void brew(); // 서브 클래스에서 구체화 되는 동작

    private void pourInCup() { // 공통적인 동작
        System.out.println("컵에 따르는 중");
    }

    protected abstract void addCondiments(); // 서브 클래스에서 구체화 되는 동작

    void hooks() { } // 후크: 기본적으로 아무 동작도 하지 않지만 필요시 서브 클래스에서 재정의하여 사용 가능한 메소드
}
