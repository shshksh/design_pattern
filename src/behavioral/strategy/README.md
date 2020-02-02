# Strategy Pattern

> 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 
>
> 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

<br>

## 구조

<img src="D:\java\practice\designPattern\src\behavioral\strategy\strategy-pattern.png" alt="strategy-pattern" style="zoom: 45%;" />

- Context는 setter로 Strategy를 상황에 맞게 동적으로 설정할 수 있다. (Duck class)
- Strategy는 인터페이스나 추상 클래스로 행동을 포함한다. (FlyBehavior, QuackBehavior)
- ConcreteStrategy는 Strategy의 행동을 구현하여 실제 동작 나타낸다. (FlyNoWay, Quack, Squeak, ...)

<br>

## 디자인 원칙

- 애플리케이션에서 변화하는 부분을 찾아 내고, 변화하지 않는 부분으로부터 분리시킨다.
  - Duck class는 추상 클래스로 객체마다 동일한 행동은 구현하고, 변화하는 행동은 인터페이스를 사용하여 상황에 맞게 동적으로 취할 수 있다.
- 구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.
  - Fly와 Quack이 인터페이스로 정의되어 유연한 변경을 제공한다.
  - Duck은 해당 행동을 직접 구현할 필요 없이 인터페이스가 구현한 행동을 실행하면 된다.

- 상속보다는 구성을 활용한다.
  - 각각의 오리는 Duck 클래스로부터 Fly와 Quack을 상속받는 대신 인터페이스로부터 행동을 위임 받는다. 이렇게 상속보다 구성을 이용하면 시스템의 유연성을 크게 향상시킬 수 있다.

