
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
#### 3.Fragment -> Activity 데이터 전달 
<img src="https://github.com/wndnjs00/FragmentExample/assets/89961868/866f8c11-7985-428c-a735-47a9cafc008b" width="200" height="400">

#### Fragment에서 Activity로 데이터 보내기
-> newInstance함수를 만들고, newInstance함수에 전달할 값을 담아서 Fragment로 전달<br/>
-> newInstance함수에는 MainActivity에서 받아온데이터를 bundle을 사용해서 arguments에 저장 <br/>
#### Activity에서 데이터받기
-> arguments를 사용해서 MainActivity에서 보낸 데이터를 꺼내서 param1에 넣어줌 <br/>
-> text에 받아온 param1데이터를 뿌려줌<br/>





<br/><br/><br/>
해당 개념정리한 블로그 링크<br/>
<https://coding-juuwon2.tistory.com/274>
