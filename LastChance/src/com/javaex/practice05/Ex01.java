package com.javaex.practice05;

class Member {
	private String id;
	private String name;
	private int point;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;		
	}
	public void setName(String name) {
		this.name = name;	
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %d점%n", name, id, point);
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
