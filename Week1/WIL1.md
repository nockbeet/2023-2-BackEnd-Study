## 2023-2 BackEnd 스터디 1주차

- **객체 지향 설계 원칙(SOLID)**
    1. 단일 책임 원칙(SRP, Single Responsibility Principle)
        - 하나의 클래스(객체)는 단 하나의 책임만 가진다.
    2. 개방-폐쇄 원칙(OCP, Open Closed Principle)
        - 클래스는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
        - 기능 추가 시 클래스를 확장하고, 이에 따른 클래스의 수정은 최소화한다. (추상화를 이용한 구축)
    3. 리스코프 치환 원칙(LSP, Liskov Substitution Principle)
        - 프로그렘 객체는 프로그램의 정확성을 깨뜨리지 않으면서, 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
        - **다형성의 원리를 이용하기 위한 원칙**이다.
    4. 인터페이스 분리 원칙(ISP, Interface Segregation Principle)
        - 인터페이스는 각각의 사용 의도에 맞게 잘게 분리해야 한다.
        - **인터페이스의 단일 책임**
    5. 의존관계 역전 원칙(DIP, Dependency Inversion Principle)
        - 특정 클래스를 참조해야 할 때, 직접 참조하는 것이 아니라, 추상 클래스나 인터페이스로 참조해야 한다.
        - 각 클래스 간의 결합도를 낮추기 위함이다.

참조: [객체 지향 설계의 5가지 원칙 - S.O.L.I.D - Inpa Dev ‍ - 티스토리](https://inpa.tistory.com/entry/OOP-%F0%9F%92%A0-%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%EC%84%A4%EA%B3%84%EC%9D%98-5%EA%B0%80%EC%A7%80-%EC%9B%90%EC%B9%99-SOLID#thankYou)


- **추상 클래스와 인터페이스의 비교**
    - 추상 클래스
        - 상속할 객체들의 공통점을 찾아 추상화시킬 목적의 클래스
    - 인터페이스
        - 서로 다른 조상 클래스를 상속하더리도, 같은 기능들을 구현할 필요가 있을 때 사용한다.
    - 예시
        - 구현해야 할 클래스로 고양이, 개, 악어가 있다고 가정하자.
            - 고양이와 개는 포유류이다. 따라서 추상 클래스 Animal의 자식 클래스로 구현하자.
            - 개와 악어는 각각 포유류, 파충류이지만, 둘 다 수영을 할 수 있다. 따라서 인터페이스 Swimmable을 두 클래스에 implements하여 구현할 수 있다.


참조: [[Java] 추상 클래스와 인터페이스의 차이](https://velog.io/@new_wisdom/Java-%EC%B6%94%EC%83%81-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%99%80-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%9D%98-%EC%B0%A8%EC%9D%B4)