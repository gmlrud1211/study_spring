package dao;

import dto.Dept;

public interface DeptDao {
	//deptno로 조회하기
	public Dept selectByDeptno(int deptno);

}
