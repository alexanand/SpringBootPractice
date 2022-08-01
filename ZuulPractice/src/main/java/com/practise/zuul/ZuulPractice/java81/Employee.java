package com.practise.zuul.ZuulPractice.java81;

public class Employee {

	
	private String empName;
	 private String empDepat;
	 private long empMobno;
	 private int empId;
	 
	 public Employee(String empName,String empDepat,long empMobno,int empId) {
		 this.empName=empName;
		 this.empDepat=empDepat;
		 this.empMobno=empMobno;
		 this.empId=empId;
		 
	}
	 
	 public String getEmpName() {
		return empName;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDepat=" + empDepat + ", empMobno=" + empMobno + ", empId=" + empId
				+ "]";
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepat() {
		return empDepat;
	}
	public void setEmpDepat(String empDepat) {
		this.empDepat = empDepat;
	}
	public long getEmpMobno() {
		return empMobno;
	}
	public void setEmpMobno(long empMobno) {
		this.empMobno = empMobno;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}
