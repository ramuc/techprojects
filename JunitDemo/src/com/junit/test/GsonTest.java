package com.junit.test;

import com.google.gson.Gson;

public class GsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GsonTest car=new GsonTest();
		Car c=car.new Car();
		c.id = 10;
		c.name = "Waganer";

		Gson gson = new Gson();

		String json = gson.toJson(c);
		System.out.println("json output ::"+json);

	}
	class Car{
		
		int id;
		String name;
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
		
	}

}
