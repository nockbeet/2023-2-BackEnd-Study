## 2023-2 BackEnd 스터디 2주차

- **HTTP**
    - Internet protocol stack에서 application layer의 protocol로, 서로 다른 시스템 사이에서 통신을 주고받게 해준다.
    - 클라이언트 프로그램과 서버 프로그램은 서로 HTTP 메시지를 주고 받으면서 통신한다.
![HTTP](https://media.geeksforgeeks.org/wp-content/uploads/20230521175108/ImageOfHTTPRequestResponse-1024x580-660.webp)
    - HTTP는 TCP를 전송 프로토콜로 사용한다.
    - HTTP 연결 과정
      1. 클라이언트가 서버에 TCP 연결을 시작한다.
      2. 클라이언트가 HTTP request message를 보낸다.
      3. 서버로부터 HTTP response message를 받는다.
- **HTTPS**
    - HTTP 프로토콜에서 보안을 강화한 형태
    - 웹 사이트 사용자의 중요한 데이터를 안전하게 전송하는 데 이용(ex) 웹페이지 로그인 및 자격 증명)
    - 네트워크 상에서 중간에 제3자가 정보를 볼 수 없도록 암호화 지원
- **HTTPS와 HTTP의 비교**
    - HTTPS에는 암호화가 추가되어, HTTP에 비해 데이터를 안전하게 전송할 수 있다.
    - HTTPS는 암호화 및 복호화에도 시간이 소요되므로 HTTP에 비해 처리 속도가 느리다.<br/>
참조 : [[Web] HTTP와 HTTPS의 개념 및 차이점](https://mangkyu.tistory.com/98)
- **RESTful한 URI 설계**
    - 이벤트 목록 조회<br/>
      ~~~~
      GET    /{events}
      ~~~~
    - 이벤트 조회<br/>
      ~~~~
      GET    /events/1
      ~~~~
    - 이벤트 등록<br/>
      ~~~~
      POST    /events/1
      ~~~~
    - 이벤트 수정<br/>
      ~~~~
      PATCH    /events/1
      ~~~~
    - 이벤트 삭제<br/>
      ~~~~
      DELETE    /events/1
      ~~~~
    - 이벤트 상태 변경<br/>
      ~~~~
      PATCH    /events/1/status
      ~~~~
    - 멤버 목록 조회<br/>
      ~~~~
      GET    /{members}
      ~~~~
    - 특정 멤버 권한 변경<br/>
      ~~~~
      PATCH    /members/1/rights
      ~~~~
    - 특정 멤버 정보 조회<br/>
      ~~~~
      GET    /members/1/info
      ~~~~
    - 특정 이벤트의 주문 목록 조회<br/>
      ~~~~
      GET    /events/1/{orders}
      ~~~~
    - 특정 멤버 정보 변경<br/>
      ~~~~
      PATCH    /members/1/info/1
      ~~~~
    - 멤버 등록<br/>
      ~~~~
      POST    /members/1
      ~~~~
참조 : [RESTful API 설계 규칙 - One IT's Devlog - 티스토리](https://one-it.tistory.com/entry/RESTful-API-%EC%84%A4%EA%B3%84-%EA%B7%9C%EC%B9%99)