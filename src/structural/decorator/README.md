# Decorator Pattern

> 객체에 추가적인 요건을 동적으로 첨가한다. 데코레이터는 서브 클래스를 만드는 것을 통해서 기능을 유연하게 확징할 수 있는 방법을 제공한다.

<br>

## 구조

<img src="https://github.com/shhhhhhhhhhhh/practice/blob/master/designPattern/res/decorator_pattern.png?raw=true" alt="decorator_pattern" />

- Component
  - 각 구성요소는 직접 사용될 수도 있고 데코레이터로 감싸져서 사용될 수도 있다. 
  - Beverage
- ConcreteComponent
  - 새로운 행동을 동적으로 추가할 수 있다.
  - HouseBlend, DarkRoast, Espresso, Decaf
- Decorator
  - 각 데코레이터 안에는 Component 객체가 들어 있다. Decorator는 자신이 장식할 구성요소과 같은 인터페이스 또는 추상 클래스를 구현한다.
  - CondimentDecorator
- ConcreteDecorator
  - 그 객제가 장식하고 있는 것을 위한 인스턴스 변수가 있다.
  - Milk, Mocha, Soy, Whip

<br>

## 디자인 원칙

- #### OCP(Open-Closed Principle)

  - 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.