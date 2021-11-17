package fkfkfk9.java8learn.java8learn;

//함수형 인터페이스인 것을 어노테이션으로 정의해준다.
@FunctionalInterface
public interface FunctionalInterfaceEx {
    //하나의 추상메서드를 선언해야 함수형 인터페이스로 사용가능하다.
    void doIt();

    // 추가 추상메서드를 생성한다면 컴파일에러가 발생한다.
    //void doIt2();

    //Java8에서는 이전 버전에서 Interface에서 추상메서드만 선언 가능했던 부분이
    //static, default 메서드를 선언가능하도록 변경 되었다.

    //static 메서드는 선언이 가능하다.
    static void staticDoIt(){
        System.out.println("Static");
    }
    //default 메서드 또한 선언이 가능하다.
    default void defaultDoIt(){
        System.out.println("Default");
    }
}
