# Factory Method Pattern

> 객체를 생성하기 위한 인터페이스를 정의하여 객체 생성을 캡슐화 한다. 어느 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만든다.

<br>

## Simple Factory

- 객체의 생성을 담당하는 클래스를 만들어 객체 생성을 위임한다.
  - 객체 생성이 필요한 클래스가 많을경우 생성을 담당하는 클래스만 변경하여 효율적으로 관리할 수 있다.
<img src="https://github.com/shhhhhhhhhhhh/practice/blob/master/designPattern/res/simple_factory_pattern.png?raw=true" alt="simple_factory_pattern" style="zoom: 80%;" />

## 구조

<img src="https://github.com/shhhhhhhhhhhh/practice/blob/master/designPattern/res/factory_method_pattern.png?raw=true" alt="factory_method_pattern" style="zoom: 80%;" />

<br>

## 디자인 원칙

- **의존성 뒤집기 원칙**
  - 추상화된 것에 의존하도록 만들어라. 구상 클래스에 의존하게 만들지 않도록 한다.
  - 고수준 구성요소가 저수준 구성요소에 의존하면 안 된다는 것이 내포되어 있다.
  - 고수준 구성요소란 다른 저수준 구성요소에 의해 정의되는 행동이 들어있는 구성요소를 말한다. Pizza Store의 행동은 Pizza에  의해 정의되므로 고수준 구성요소라 할 수 있다. 
  - PizzaStore의 행동을 ConcretePizza가 아닌 Pizza 인터페이스라는 고수준 구성요소에 의존하도록 만든다

<br>

## 정리

- 팩토리 메소드 패턴은 객체 생성을 캡슐화 한다

- 장점

  - 객체 생성 코드의 중복을 제거한다.
  - 팩토리 클래스만 변경 한다면 클라이언트 부분은 신경쓰지 않아도 된다.
  - 클라이언트는 인터페이스만 필요 하므로 유연성과 확장성이 뛰어나다.

- 단점

  - 각각의 concrete creator 마다 product의 구현 클래스가 필요하다.

    - 새로운 종류의 제품 추가시 concrete creator마다 다른 구현 제품이 필요하다.


