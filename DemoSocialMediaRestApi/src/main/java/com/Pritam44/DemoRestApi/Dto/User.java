package com.Pritam44.DemoRestApi.Dto;

public class User {
	private String name ;
	private int age;
	private String skill;
	public User(String name, int age, String skill) {
		super();
		this.name = name;
		this.age = age;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", skill=" + skill + "]";
	}
	

}
