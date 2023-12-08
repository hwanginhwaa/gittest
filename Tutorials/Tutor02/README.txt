[Tutor02]

(실행)
http://localhost:10116/board/boards

(프로젝트)
1. Java : 1.8
2. SpringBoot : 2.7.2
3. Oracle : 19c
4. Oracle JDBC : ojdbc8
5. JSP : 
	-jstl 1.2, 
	-jsptags : 1.1.4
	
(board)
CREATE TABLE board (
	boardno NUMBER PRIMARY KEY, 	/*게시판 번호*/
	title	 VARCHAR2(300),			/*제목*/
	content	 VARCHAR2(4000),		/*내용*/
	writer	 VARCHAR2(100),			/*작성자*/
	regdata DATE DEFAULT SYSDATE	/*작성일자*/
);	

(sequence)
CREATE SEQUENCE seq_board;			/*게시판 번호 발생기*/
