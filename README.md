# 디자인 패턴

- 소프트웨어 설계시 공통적으로 발생하는 문제에 대해 재사용 가능한 해결책. 
  각각의 상황을 해결하는데 사용하는 설계 방법 또는 템플릿이라고 할 수 있다. 
- 코드의 불필요한 중복들을 상속과 인터페이스, 다형성 등 객체 지향 설계를 활용하여 해결할 수 있다. 
  디자인 패턴을 적용시 빈번하게 발생하는 문제를 해결하는 틀을 쉽게 설계할 수 있고, 프로그램의 추가적인 확장과 유지 보수에 용이한 설계가 가능하다. 
- 어디까지나 문제 해결 방안 중 하나이기 때문에 모든 문제를 디자인 패턴으로 해결하려는것은 지양하는것이 좋다. 
- 이 문서에서는 각각의 디자인 패턴을 소개하고 패턴의 장단점 및 적용 상황등을 다룰 예정이다.



## 참고 서적

- 한국어로 번역된 서적 중 [GoF의 디자인 패턴][goflink]과 [Head First Design Patterns][headfirstlink]이 디자인 패턴의 기초 지침서로 알려져 있다.


[goflink]: http://www.yes24.com/Product/Goods/17525598
[headfirstlink]: http://www.yes24.com/Product/Goods/1778966?Acode=101



## 분류

* GoF의 디자인 패턴에 따르면 23개의 디자인 패턴이 정리되어 있고 각각의 디자인 패턴은 **생성 패턴, 구조 
  패턴, 행위 패턴**으로 분류된다.

* #### **생성(Creational) 패턴**

  - 추상 팩토리(Abstract Factory)
  - 팩토리 메소드(Factory Method)
  - 빌더(Builder)
  - 프로토타입(Prototype)
  - 싱글톤(Singleton)

* #### **구조(Structural) 패턴**

  - 어탭터(Adapter)
  - 브릿지(Bridge)
  - 컴포지트(Composite)
  - 데코레이터(Decorator)
  - 퍼사드(Facade)
  - 플라이웨이트(Flyweight)
  - 프록시(Proxy)

- #### **행위(Behavioral) 패턴**

  - 책임 연쇄(Chain of Responsibility)
  - 커맨드(Command)
  - 인터프리터(Interpreter)
  - 이터레이터(Iterator)
  - 미디에이터(Mediator)
  - 메멘토(Memento)
  - 옵저버(Observer)
  - 스테이트(State)
  - 스트래티지(Strategy)
  - 템플릿 메소드(Template Method)
  - 비지터(Visitor)