# SQL

conn system/manager

create user id identified by password;

grant connect, resource to id;

alter user id identified by password;

set linesize 300;

create table customer(
										id varchar2(10) primary key,
										pass varchar2(10),
										name varchar2(15) not null,
										point number,
										regdate date)

desc customer

insert into customer values('jang','1234','장동건',1000,sysdate);





-컬럼명 대신 alias를 정의해서 사용할 수 있다.

select 컬럼명 alias명, 컬럼명 as alias명, 컬럼명 "alias명"

​																				alias명에 공백이 있는 경우 사용

-여러 컬럼을 합쳐서 하나의 컬럼으로 조회할 수 있다.

|연산자이용

-오라클의 문자열, 날짜 데이터는 ' '로 표현

-연산의 결과로 컬럼을 생성할 수 있다.

 (+,*,/,-, 함수) 단, nul이 포함되어 있는 컬럼은 연산할 수 없다.

-중복이 있는 경우 select 문에 distinct를 추가할 수 있다.

-select절에 조건 추가하기

 select [distinct] 컬럼명, 컬럼명 [alias]

 from 테이블명

 where 조건

-where절에서 조건과 함께 비교하는 값을 추가해야 하는 경우

 문자, 날짜는 작은 따옴표로 묶어주어야 한다.

-SQL은 대소문자를 구분하지 않지만, 값을 비교할때는 대소문자를 구분한다.

-두 개 이상의 조건이 있는 경우 사용할 수 있는 연산자

 and 연산자 : 모든 조건이 일치

 or 연산자 : 모든 조건 중 한개만 일치

 between A and B : and 연산

in 연산자 : or 연산자의 의미와 동일

 not 연산자 : 부정

 null값에 대한 비교

​	is null

​	is not null

-like 연산자 : 대표문자와 함께 사용

​                       조건비교를 위해 입력한 값이 문자열에 포함되어 있는 것을 찾는 경우

## 데이터 정렬

order by 컬럼명 정렬기준

asc 오름차순

desc 내림차순

기본은 오름차순

