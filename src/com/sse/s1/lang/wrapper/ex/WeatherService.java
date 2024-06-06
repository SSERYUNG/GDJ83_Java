package com.sse.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {

	Scanner sc = new Scanner(System.in);
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append(" 서울   , 29.3  -맑음  -   60");
		this.sb.append(" -부산   , 33.6  -흐림  -   90");
		this.sb.append(" -제주   , 26.8  -눈  -   30");
		this.sb.append(" -대구   , 11.1  -태풍  -   70");
	}

	public WeatherDTO[] init() {
		String info = this.sb.toString();
		info = info.replace(",", "-");

		WeatherDTO[] wdtoar = this.getWeathers(info);
		return wdtoar;
	}

	private WeatherDTO[] getWeathers(String info) {
		String[] infoslice = info.split("-");
		for (int i = 0; i < infoslice.length; i++) {
			infoslice[i] = infoslice[i].trim();
		}

		int count = infoslice.length / 4;
		WeatherDTO[] wdtoar = new WeatherDTO[count];
		int j = 0;

		for (int i = 0; i < infoslice.length; i = i + 4) {

			WeatherDTO wdto = new WeatherDTO();
			wdto.setCity(infoslice[i]);
			wdto.setGion(Double.parseDouble(infoslice[i + 1]));
			wdto.setStatus(infoslice[i + 2]);
			wdto.setHumidity(Integer.parseInt(infoslice[i + 3]));

			wdtoar[j] = wdto;
			j++;

		}

		return wdtoar;

	}

//	날씨정보를 도시명으로 검색해서 해당 날씨 정보를 리턴만! findByCity 메서드

	public WeatherDTO findByCity(WeatherDTO[] wdtoar) {
		System.out.println("날씨를 검색할 도시를 입력하세요.");
		String city = sc.next();
		WeatherDTO cityw = new WeatherDTO();

		for (int j = 0; j < wdtoar.length; j++) {

			if (city.equals(wdtoar[j].getCity())) {

				cityw.setCity(wdtoar[j].getCity());
				cityw.setGion(wdtoar[j].getGion());
				cityw.setStatus(wdtoar[j].getStatus());
				cityw.setHumidity(wdtoar[j].getHumidity());
				break;

			}

		}
		if (cityw.getCity() == null) {
			cityw = null;
		}
		return cityw;

	}

//	날씨정보를 추가하는 addWeather 메서드
//	도시명, 기온, 습도, 상태를 입력받아서 기존의 날씨정보들에 추가

	public WeatherDTO[] addWeather(WeatherDTO[] ar) {
		System.out.println("도시명을 입력하세요");
		String dosi = sc.next();
		System.out.println("온도를 입력하세요");
		double ondo = sc.nextDouble();
		System.out.println("날씨상태를 입력하세요");
		String sta = sc.next();
		System.out.println("습도를 입력하세요");
		int sup = sc.nextInt();

		WeatherDTO newweather = new WeatherDTO();
		newweather.setCity(dosi);
		newweather.setGion(ondo);
		newweather.setStatus(sta);
		newweather.setHumidity(sup);

		WeatherDTO[] addar = new WeatherDTO[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			addar[i] = ar[i];
		}
		addar[addar.length - 1] = newweather;

		return addar;
	}

//	기존 날씨 배열에서 하나를 삭제 removeWeather 메서드
//	도시명을 입력받아서 일치하는 날씨 정보 삭제하기

	public WeatherDTO[] removeWeather(WeatherDTO[] ar) {

		System.out.println("삭제할 도시명을 입력하세요");
		String city = sc.next();
		WeatherDTO[] minusar = new WeatherDTO[ar.length - 1];

		int count = ar.length;
		int num = 0;
		boolean flag = false;

		for (int i = 0; i < count; i++) {
			if (city.equals(ar[i].getCity())) {

//				num++;
//				count--;
				flag = true;
				for (int j = i+1; j < count; j++) {
					minusar[j-1] = ar[j];

				}
				break;
			} else {
				if(i==count-1) {
					break;
				}
				minusar[i] = ar[i];
			}

		}

		if (flag) {
			System.out.println("날씨 정보 삭제 완료, 처음으로 돌아갑니다");
			return minusar;
		} else {
			System.out.println("없는 도시명입니다. 다시 확인해주세요.");
			return ar;
		}

	}

}
