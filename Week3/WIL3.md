## 2023-2 BackEnd 스터디 3주차

- **Spring Bean**
    - Bean
        - Spring IoC 컨테이너에 의해 관리되는 자바 객체
    - Spring IoC 컨테이너
        - Bean을 관리하는 객체
    - Bean Scope
        - Bean이 생성되어 존재하고 적용되는 범위
        - @scope Annotation으로 지정 가능
        - 스프링에서 지원하는 스코프
            1. 싱글톤: 스프링 컨테이너의 시작부터 종료까지 유지되는 가장 넓은 범위의 스코프
            2. 프로토타입: 스프링 컨테이너가 프로토타입 빈의 생성과 의존관계 주입까지만 관여하고 더는 관리하지 않는 매우 짧은 범위의 스코프
            3. 웹 관련 스코프
                - request: 웹 요청이 들어오고 나갈 때까지 유지되는 스코프. 각각의 웹 요청마다 별도의 빈 인스턴스가 생상되고 관리된다.
                - session: 웹 세션이 생성되고 종료될 때까지 유지되는 스코프
                - application: 웹의 서블릿 컨텍스트(SurvletContext)와 같은 범위로 유지되는 스코프<br/>
                  참조 : [빈 스코프(Bean Scope)란? - [Spring] - 코드 연구소 - 티스토리](https://code-lab1.tistory.com/186)
- **Spring Bean 등록 방법**
    - @bean annotation 사용
        - Bean 객체는 singleton이 아니다.
        - @configuration annotation을 사용하면 singleton으로 구현 가능
    - 의존성을 자동 주입해야 할 인터페이스 구현체가 두 개 이상일 경우
        - 어떤 구현체를 자동 주입할 지 결정할 수 엇어 충돌 발생
        - Primary, Qualifier annotationㅇ르 사용하여, 의존성 주입 시 우선숭위를 정할 수 있다.
    - Component Scan 사용
        - 스프링이 자동으로 스프링 빈을 등록
        - @ComponentScan, @Component annotation 사용
        - 등록된 Bean은 singleton이다.

- **과제 로그**
    - 모든 Bean 출력
  ![AllBean](file:///D:/%EC%B2%9C%EC%88%98%EA%B2%B8/%ED%99%8D%EC%9D%B5%EB%8C%80/GDSC/2023-2%20%EB%B0%B1%EC%97%94%EB%93%9C%20%EC%8A%A4%ED%84%B0%EB%94%94/03%EC%A3%BC%EC%B0%A8%20%EC%BA%A1%EC%B3%90/%EB%AA%A8%EB%93%A0%20Bean%20%EC%B6%9C%EB%A0%A5.png)
    - ClassA Bean 값 출력
  ![ClassABean](file:///D:/%EC%B2%9C%EC%88%98%EA%B2%B8/%ED%99%8D%EC%9D%B5%EB%8C%80/GDSC/2023-2%20%EB%B0%B1%EC%97%94%EB%93%9C%20%EC%8A%A4%ED%84%B0%EB%94%94/03%EC%A3%BC%EC%B0%A8%20%EC%BA%A1%EC%B3%90/ClassA%20Bean%20%EC%B6%9C%EB%A0%A5.png)