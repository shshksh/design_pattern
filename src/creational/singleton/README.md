# Singleton Pattern

> 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패턴. 
>
> 스레드 풀, 대화상자, 사용자 설정 등 프로그램의 실행 중 하나의 인스턴스만 필요한 경우 사용한다.

<br>

## 고전적인 싱글턴 패턴

- ```java
  public class ClassicSingleton {
      private static ClassicSingleton uniqueInstance;
  
      // other instance variable
  
      private ClassicSingleton() {}
  
      public static ClassicSingleton getInstance() {
          if(uniqueInstance == null) {
              uniqueInstance = new ClassicSingleton();
          }
          return uniqueInstance;
      }
  
      // other method
  }
  ```
  
- 생성자는 private로 제한하고 클래스의 정적 메소드를 이용하여 싱글턴 객체를 반환한다.

- 하지만 멀티스레드 환경에서 getInstance 메소드가 충돌할 수 있다.

<br>

## synchronized

- getInstance를 동기화하여 하나의 스레드만 접근할수 있게 한다.

- ```java
  public class ClassicSingleton {
      private static ClassicSingleton uniqueInstance;
  
      // other instance variable
  
      private ClassicSingleton() {}
  
      public static synchronized ClassicSingleton getInstance() {
          if(uniqueInstance == null) {
              uniqueInstance = new ClassicSingleton();
          }
          return uniqueInstance;
      }
  
      // other method
  }
  ```

  

- 실제로 동기화가 필요한 시점은 객체가 생성되기 이전 한번의 경우밖에 없기 때문에 오버헤드가 증가한다.

- getInstance 의 속도가 크게 중요하지 않을 때 사용

<br>

## 정적 객체 변수의 초기화

- 싱글턴 객체를 참조하는 변수를 시작부터 초기화하여 사용한다.W

- ```java
  public class ClassicSingleton {
      private static ClassicSingleton uniqueInstance = new ClassicSingleton();
  
      // other instance variable
  
      private ClassicSingleton() {}
  
      public static ClassicSingleton getInstance() {
          return uniqueInstance;
      }
  
      // other method
  }
  ```

  

- 클래스가 로딩될 때  JVM에서 싱글턴 인스턴스를 생성한다.

- 싱글턴 객체가 딱히 필요 없을때도 객체를 생성한다는 비용이 있다.

<br>

## Double-checking Locking

- ```java
  public class ClassicSingleton {
      private volatile ClassicSingleton uniqueInstance;
      
      // other instance variable
      
      private ClassicSingleton() {}
      
      public static synchronized ClassicSingleton getInstance() {
          if(uniqueInstance == null) {
              synchronized (ClaasicSingleton.class) {
                  if(uniqueInstance == null) {
                      uniqueInstance = new ClassicSingleton();
                  }
              }
          }
          return uniqueInstance;
      }
      
      // other method
  }
  ```

- 일단 객체가 생성되어 있는지 확인 하고 객체가 없을때만 코드블럭을 동기화 하여 오버헤드를 줄인다.