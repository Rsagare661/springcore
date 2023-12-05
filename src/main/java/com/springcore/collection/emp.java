package com.springcore.collection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class emp {
	@Autowired
      private String name;
      private List<String> phones;
      private Set<String> address;
      private Map<String,String> Courses;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		Courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
}
