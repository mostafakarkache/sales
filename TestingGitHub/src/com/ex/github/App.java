package com.ex.github;

public class App {

	public static void main(String[] args) {
 
		Sales sales = new Sales();
		
		sales.setId(1);
		sales.setName("books");
		
		System.out.println(sales.getId()+"   "+sales.getName());
		System.out.println( "  commited " );

	}

}
