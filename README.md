
### 1.Activity -> Fragment 데이터 전달 
<img src="https://github.com/wndnjs00/FragmentExample/assets/89961868/a6f4971e-c338-44f7-8930-4e40ea6a6009" width="200" height="400">

#### Activity에서 Fragment로 데이터 보내기
-> newInstance함수를 만들고, newInstance함수에 전달할 값을 담아서 Fragment로 전달<br/>
-> newInstance함수에는 MainActivity에서 받아온데이터를 bundle을 사용해서 arguments에 저장 <br/>
#### Fragment에서 데이터받기
-> arguments를 사용해서 MainActivity에서 보낸 데이터를 꺼내서 param1에 넣어줌 <br/>
-> text에 받아온 param1데이터를 뿌려줌<br/>



<br/><br/>
### 2.Fragment -> Fragment 데이터 전달 
<img src="https://github.com/wndnjs00/FragmentExample/assets/89961868/d6d7bb5f-09c6-4d01-82bf-b5780be09b30" width="200" height="400">

#### Fragment에서 Fragment로 데이터 보내기
-> newInstance함수를 만들고, newInstance함수에 전달할 값을 담아서 Fragment로 전달<br/>
-> newInstance함수에는 FirstFragment에서 받아온데이터를 bundle을 사용해서 arguments에 저장 <br/>
#### Fragment에서 데이터받기
-> arguments를 사용해서 FirstFragment에서 보낸 데이터를 꺼내서 param1에 넣어줌 <br/>
-> text에 받아온 param1데이터를 뿌려줌<br/>




<br/><br/>
### 3.Fragment -> Activity 데이터 전달 
<img src="https://github.com/wndnjs00/FragmentExample/assets/89961868/866f8c11-7985-428c-a735-47a9cafc008b" width="200" height="400">

#### Fragment에서 Activity로 데이터 보내기
-> interface를 따로 생성 <br/>
-> SecondFragment에서 listner변수에 인터페이스 선언한뒤, onAttach()메소드에서 context를 listener에 할당 <br/>
-> 버튼 눌렀을때 인터페이스에 선언한 함수를 통해 데이터전달 <br/>
#### Activity에서 데이터받기
-> MainActivity에서 인터페이스를 상속받기 <br/>
-> 인터페이스에 선언한 함수를 오버라이딩해서 data받아온뒤, 여기서 Fragment에서 받은 데이터를 처리해줌(토스트 메시지로 표시해줌)<br/>





<br/><br/><br/>
해당 개념정리한 블로그 링크<br/>
<https://coding-juuwon2.tistory.com/274>
