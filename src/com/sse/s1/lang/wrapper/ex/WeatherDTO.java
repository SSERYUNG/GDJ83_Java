package com.sse.s1.lang.wrapper.ex;

public class WeatherDTO {

//	DTO의 모든 멤버변수는 private 설정
//	그렇기 때문에 Getters,Setters가 필요
//	생성자는 여러개 만들어도 상관 x but 기본생성자는 필수

//	도시명
	private String city;
//	기온
	private double gion;
//	날씨정보(ex 맑음, 흐림 등등)
	private String status;
//	습도
	private int humidity;

//	getter,setter 시작점
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
