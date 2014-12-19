IntelliJ , maven 그리고 Junit 사용한 경로찾기 프로젝트입니다.
-2010108169 컴퓨터공학과 강관우 

커밋 로그 설명 - [커밋 로그의 대한 설명이 부족한거 같아 자세히 설명하였습니다]


Commits on Dec 6, 2014

Commit comment : my first step is Junit Test 
	-Junit Test를 실행하고 확인하였습니다.

Commit comment :Readme.md
	-README 파일을 추가하였습니다.



Commits on Dec 7, 2014

Commit comment : 다익스트라 알고리즘 적용을 위한 단위 테스트.
	-다익스트라테스트를 위한 테스트 코드입니다.다익스트라Class에 경로를 추가하여 내부의 코드중 경로 숫자를 확인하는 메소드를 테스트하였습니다.

Commit comment : 경로 설정 메소드 추가 & 테스트 1번부터 6번까지 최단경로 추적
	-다익스트라Test code의 최단경로를 구하는 메소드를 테스트하였습니다. 메소드 이름은 start입니다.

Commit comment : 다익스트라 클래스 추가
	-테스트가 완료된 DijkstraTest 를 클래스로 생성하였습니다.

Commit comment : main class 추가 및 제주와 서울간 최단경로 단위테스트
	-PathFindTest 클래스를 생성하였습니다. 해당 클래스는 사용자로부터 출발지, 도착지를 입력받고 설정된 경로를 다익스트라 클래스
	로 넘겨준 후 최단경로를 테스트하는 테스트 클래스입니다. 정상 작동하여 PathFind 클래스로 빼내었습니다.

Commit comment : create method that check to place number
	-PathFindTest에서 main 메소드 안에있던 가독성이 떨어지는 코드를 메소드로 빼내어 가독성을 높였습니다.
	테스트가 정상 작동하자 PathFind 클래스에도 적용을 하였습니다.

Commit comment : 반복적인 print문 메소드로 뺌
	-pathfindtest 테스트 코드에서 반복적인 패턴의 System.out.println부분을 메소드로 추가하였고 테스트 완료 후 클래스에 적용하였
	습니다.

Commit comment : invalidInput 변수 메소드 안으로 넣음.
	-테스트 코드에서 출발지 입력인지, 도착지 입력인지 확인하는 플래그 변수를 메소드 안으로 넣고 테스트 완료 후 클래스에 적용하였		습니다.

Commit comment : 경로 설정하는 일을 다익스트라 클래스로 바꿈
	-map 생성하고 경로 설정하는 것을 다익스트라 클래스로 넣어 테스트 후 적용하였습니다.


Commits on Dec 18, 2014

Commit comment : User 클래스 Test
	-User - pathfind - 다익스트라 알고리즘의 흐름을 적용하기 위해 테스트 코드를 작성하였습니다. ( Vehicle 인터페이스를 추가하였	습니다)

Commit comment : 실패한 테스트.
	-pathfind test 코드에 vehicle 로직을 테스트 하였습니다. 

Commit comment : Time test
	-vehicle 인터페이스와 airplane , train등 탈것을 정하는 로직을 테스트 하기위한 테스트 코드입니다.


Commit comment : Vehicle interface , User class 추가
	-user와 vehicle 테스트 완료 후 class로 생성하였습니다.

Commit comment : i create package
	-클래스들을 패키지에 넣어서 흐름을 이해하기 쉽게 하였습니다.

Commit comment : update my package
	-class들에 탈 것 인터페이스 구조를 구체화하였습니다.

Commit comment : create interface algorithm and map package
	-map 패키지와 algorithm 인터페이스를 생성하여서 확장에 열려있게 하였습니다 (OCP)

Commit comment : delete Test code
	-사용하지않는 테스트 코드를 모두 삭제하였습니다.



Commits on Dec 19, 2014

Commit comment : code refactoring
	-변수명을 조금 더 의미있게 변경하였습니다.

Commit comment : variables of name change from PathFind Class
	-변수명을 조금 더 의미있게 변경하였습니다.

Commit comment : variables of name change from PathFind Class
	-map의 의존을 Pathfind에서 map클래스로 변경하였습니다.

