package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class student {
	@Value("rajSingh")
	private String name;
	@Value("nagpur")
	private String city;
	@Value("#{temp}")
	private List<String> shaherme;

	public List<String> getShaherme() {
		return shaherme;
	}

	public void setShaherme(List<String> shaherme) {
		this.shaherme = shaherme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + "]";
	}

}
