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
        

<br/>
시작은 @component 사용하려 할 때 'cannot resolve symbol component'였습니다.
해결 방법을 찾아 보고 해결하는 중에, gradle을 refresh하는 방법을 사용하려 하였습니다.
그러나 gradle이 제 프로젝트의 tool window에 보이지 않자, 이 오류를 해결하는 방법을 구글링해봤습니다.
그 방법 중에 '.idea' 파일을 삭제 후 intellij를 재실행해보라는 방법이 있었고, 그대로 실행하자 프로젝트 내 모든 디렉터리가 보이지 않기 시작했습니다.
이 문제도 구글링을 통해 해결하려 하였는데, project setting 내의 import module에서, 'import module from external module' 내의 gradle을 선택, 실행했습니다.
이후 'does not contain a gradle build'라면서 빌드에 실패했는데, 드라이브 내에 확인해보니 .gradle 파일이 존재했습니다.
.gradle 파일이 프로젝트 내부에 위치해야 하나요? 아니면 이 파일과는 완전히 별개의 문제인가요?