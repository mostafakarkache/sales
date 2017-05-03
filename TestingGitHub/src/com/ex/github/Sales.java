package com.ex.github;
public class Sales {
	
	public Sales(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
public void showAll(){
	System.out.println("item sold are shipped");
}
public void sshowAll(){
	System.out.println("item sold are shipped all of them");
}
	private int id;
	String name;

}
