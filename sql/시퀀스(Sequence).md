## 시퀀스(Sequence)

- 순차적으로 증가하는 컬럼에 사용(ex. 게시판 글 번호)

  ```sql
  -----테스트 환경 준비
  SQL> create table myorder(
    2     ord_num varchar2(10) primary key,
    3     id varchar2(20));
  
  Table created.
  
  SQL> create table order_detail(
    2     ord_num varchar2(10),
    3     prd_num varchar2(20));
  
  Table created.
  
  -----시퀀스 생성
  SQL> create sequence myorder_seq;
  
  Sequence created.
  
  -----시퀀스를 이용해서 새로운 주문번호 생성 
  SQL> insert into myorder values(myorder_seq.nextval,'jang');
  
  1 row created.
  
  -----생성된 주문번호의 현재값을 이용해서 주문상품 레코드 생성
  SQL> insert into order_detail values(myorder_seq.currval,'prd001');
  
  1 row created.
  
  SQL> insert into order_detail values(myorder_seq.currval,'prd002');
  
  1 row created.
  
  SQL> insert into order_detail values(myorder_seq.currval,'prd003');
  
  1 row created.
  
  -----확인
  SQL> select * from myorder;
  
  ORD_NUM              ID
  -------------------- ----------------------------------------
  1                    jang
  
  SQL> select * from order_detail;
  
  ORD_NUM              PRD_NUM
  -------------------- ----------------------------------------
  1                    prd001
  1                    prd002
  1                    prd003
  
  
  -----시퀀스 현재값 확인
  SQL> select myorder_seq.currval from dual;
  
     CURRVAL
  ----------
           4
           
  -----시퀀스 삭제
  SQL> drop sequence myorder_seq;
  
  Sequence dropped.
  ```

  