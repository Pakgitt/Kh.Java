package kh.mclass.jdbc.model.dto;

import java.sql.Date;

// 신입사원 등록시 사용자입력자료형
public class EmpAddDto {
//	SQL> desc emp;
//	 이름                                      널?      유형
//	 ----------------------------------------- -------- ----------------------------
//	 EMPNO                                              NUMBER(4)
//	 ENAME                                              VARCHAR2(10)
//	 JOB                                                VARCHAR2(9)
//	 MGR                                                NUMBER(4)
//	 HIREDATE                                           DATE
//	 SAL                                                NUMBER(7,2)
//	 COMM                                               NUMBER(7,2)
//	 DEPTNO                                             NUMBER(2)
	private int empno;
	private String ename;
	private int mgr;
}
