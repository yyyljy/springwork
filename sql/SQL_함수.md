# 함수

함수의 종류는 단일행 함수, 그룹함수가 있다.

## 1) 단일행 함수

- 단일행 함수를 정의하면 테이블의 모든 행에 각각 함수가 적용된다.

- select, where, order by절에 모두 사용할 수 있다.

 1.  문자함수

    - lower(문자열 or 컬럼명) : 값을 소문자로 변환

    - upper(문자열 or 컬럼명) : 값을 대문자로 변환

    - initcap(문자열 or 컬럼명) : 첫 글자만 대문자로 변환

      ```sql
      SQL> select lower('TEST'), upper('test'), initcap('test')
        2  from dual;
      
      LOWER('T UPPER('T INITCAP(
      -------- -------- --------
      test     TEST     Test
      ```

    - substr(문자열 or 컬럼명, 시작위치, 문자열의 갯수)

      ```sql
      SQL> select substr('oracle',2)
        2  from dual;
      
      SUBSTR('OR
      ----------
      racle
      
      SQL> select substr('oracle',2,2)
        2  from dual;
      
      SUBS
      ----
      ra
      ```

    - length(문자열 or 컬럼명) : 문자열의 길이를 반환

      ```sql
      SQL> select length('오라클') from dual;
      
      LENGTH('오라클')
      ----------------
                     3
      ```

    - instr(문자열 or 컬럼명, 찾을 문자, 찾을 위치, n번째 문자)

      특정 컬럼이나 문자에서 원하는 글자의 위치를 반환

      위치옵션을 -1로 지정할 경우 오른쪽 끝에서부터 탐색

      ```sql
      SQL> select instr('oracle oracle ORACLE oracle', 'a') from dual;
      
      INSTR('ORACLEORACLEORACLEORACLE','A')
      -------------------------------------
                                          3
      
      SQL> select instr('oracle oracle ORACLE oracle', 'a', 5) from dual;
      
      INSTR('ORACLEORACLEORACLEORACLE','A',5)
      ---------------------------------------
                                           10
      
      SQL> select instr('oracle oracle ORACLE oracle', 'a', 5, 2) from dual;
      
      INSTR('ORACLEORACLEORACLEORACLE','A',5,2)
      -----------------------------------------
                                             24
      
      SQL> select instr('oracle oracle ORACLE oracle', 'a', -1, 2) from dual;
      
      INSTR('ORACLEORACLEORACLEORACLE','A',-1,2)
      ------------------------------------------
                                              10
      ```

    - concat(문자열 or 컬럼명,문자열 or 컬럼명) : 문자열 연결

    - LPAD(문자열 or 컬럼명, 출력할 문자열의 길이, 채움문자)

      지정해준 길이에 문자열을 채우고 부족한 만큼 왼쪽부터 지정한 문자를 채움

    - RPAD(문자열 or 컬럼명, 출력할 문자열의 길이, 채움문자)

      지정해준 길이에 문자열을 채우고 부족한 만큼 오른쪽부터 지정한 문자를 채움

      ```sql
      SQL> select LPAD('oracle',10,'*') from dual;
      
      LPAD('ORACLE',10,'*'
      --------------------
      ****oracle
      
      SQL> select RPAD('oracle',10,'*') from dual;
      
      RPAD('ORACLE',10,'*'
      --------------------
      oracle****
      ```

    - ltrim(문자열 or 컬럼명,제거할 문자열), rtrim(문자열 or 컬럼명,제거할 문자열)

      문자열 or 컬럼에서 특정 문자열을 제거

    

 2. 숫자함수

    - round(숫자,반올림 자리) : 해당 소수점 위치까지 표시하고 그 밑에 자리에서 반올림.
    - ceil(숫자) : 올림
    - floor(숫자) : 버림

	3. 변환함수

    - 데이터의 타입을 변환하기 위한 함수(함수의 타입 혹은 컬럼의 타입과 맞춰주기 위해)

    - cast(값 or 컬럼명 as 타입)

      ```sql
      SQL> select cast('2019/12/12' as date) from dual;
      
      CAST('20
      --------
      19/12/12
      
      SQL> select cast('00001' as integer) from dual;
      
      CAST('00001'ASINTEGER)
      ----------------------
                           1
      
      SQL> select cast('20191231' as date) from dual;
      
      CAST('20
      --------
      19/12/31
      ```

      

    - to_char(변환할 데이터, 표시할 format)

      - 숫자를 문자로 변환 : 세자리마다 , 표시

        숫자의 한 자리를 표시 => 9, 0

        콤마 => ,

        소수점 => .

        통화기호 => ￦, $, L(지역의 통화 기호를 출력)

      - 날짜를 문자열로 변환 : 년 월 일 각각의 데이터를 추출하고 싶은 경우

        YYYY MM DD

      ```sql
      SQL> select ename, sal, to_char(sal,'9,999')
        2  from emp;
      
      ENAME                       SAL TO_CHAR(SAL,
      -------------------- ---------- ------------
      SMITH                       800    800
      ALLEN                      1600  1,600
      WARD                       1250  1,250
      JONES                      2975  2,975
      MARTIN                     1250  1,250
      BLAKE                      2850  2,850
      CLARK                      2450  2,450
      SCOTT                      3000  3,000
      KING                       5000  5,000
      TURNER                     1500  1,500
      ADAMS                      1100  1,100
      
      ENAME                       SAL TO_CHAR(SAL,
      -------------------- ---------- ------------
      JAMES                       950    950
      FORD                       3000  3,000
      MILLER                     1300  1,300
                                              
      SQL> select ename, sal, to_char(sal,'L9,999')
        2  from emp;
      
      ENAME                       SAL TO_CHAR(SAL,'L9,999')
      -------------------- ---------- ---------------------
      SMITH                       800           ￦800
      ALLEN                      1600         ￦1,600
      WARD                       1250         ￦1,250
      JONES                      2975         ￦2,975
      MARTIN                     1250         ￦1,250
      BLAKE                      2850         ￦2,850
      CLARK                      2450         ￦2,450
      SCOTT                      3000         ￦3,000
      KING                       5000         ￦5,000
      TURNER                     1500         ￦1,500
      ADAMS                      1100         ￦1,100
      
      ENAME                       SAL TO_CHAR(SAL,'L9,999')
      -------------------- ---------- ---------------------
      JAMES                       950           ￦950
      FORD                       3000         ￦3,000
      MILLER                     1300         ￦1,300
      ```

    - 날짜 함수

      연산 가능 ex) sysdate-5

    - null처리 함수

      nvl(컬럼, null이 겨우 처리할 식이나 값)

      ```sql
      SQL> select ename, nvl(comm,0) from emp;
      
      ENAME                NVL(COMM,0)
      -------------------- -----------
      SMITH                          0
      ALLEN                        300
      WARD                         500
      JONES                          0
      MARTIN                      1400
      BLAKE                          0
      CLARK                          0
      SCOTT                          0
      KING                           0
      TURNER                         0
      ADAMS                          0
      
      ENAME                NVL(COMM,0)
      -------------------- -----------
      JAMES                          0
      FORD                           0
      MILLER                         0
      
      SQL> select ename, nvl(to_char(comm),'신입사원') from emp;
      
      ENAME                NVL(TO_CHAR(COMM),'신입사원')
      -------------------- -------------------------------------
      SMITH                신입사원
      ALLEN                300
      WARD                 500
      JONES                신입사원
      MARTIN               1400
      BLAKE                신입사원
      CLARK                신입사원
      SCOTT                신입사원
      KING                 신입사원
      TURNER               0
      ADAMS                신입사원
      
      ENAME                NVL(TO_CHAR(COMM),'신입사원')
      -------------------- -------------------------------------
      JAMES                신입사원
      FORD                 신입사원
      MILLER               신입사원
      ```

      nvl2(컬럼, null 아닌경우 표현값1, null인 경우 표현값2)

      ```sql
      SQL> select ename, nvl2(to_char(comm),'영업','타부서') from emp;
      
      ENAME                NVL2(TO_CHAR(COMM)
      -------------------- ------------------
      SMITH                타부서
      ALLEN                영업
      WARD                 영업
      JONES                타부서
      MARTIN               영업
      BLAKE                타부서
      CLARK                타부서
      SCOTT                타부서
      KING                 타부서
      TURNER               영업
      ADAMS                타부서
      
      ENAME                NVL2(TO_CHAR(COMM)
      -------------------- ------------------
      JAMES                타부서
      FORD                 타부서
      MILLER               타부서
      ```

      



## 2) 그룹 함수

그룹함수는 그룹으로 묶인 데이터에 적용되므로 where절에 그룹함수를 사용할 수 없다.

## 그룹함수 사용의 잘못된 예

``` sql
SQL> select ename, sal, comm
  2  from emp
  3  where sal>=avg(sal);
where sal>=avg(sal)
           *
ERROR at line 3:
ORA-00934: group function is not allowed here
```

## 그룹함수 사용의 옳은 예

```sql
SQL> select sum(sal), avg(sal), max(sal), min(sal), count(sal)
  2  from emp
  3  where deptno = 10;

  SUM(SAL)   AVG(SAL)   MAX(SAL)   MIN(SAL) COUNT(SAL)

---------- ---------- ---------- ---------- ----------

      8750 2916.66667       5000       1300          3
```



 1. 그룹화

    select 그룹화 컬럼, 그룹함수

    from 테이블

    where 조건

    order by 컬럼

    group by 컬럼

    group by하기 전에 적용해야 하는 조건은 where절에 정의

    group by한 결과에 그룹함수가 이용되는 조건을 사용하면 having절을 이용

    => from => where => group by => having => select => order by