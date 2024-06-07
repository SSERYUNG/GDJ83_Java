package com.sse.s1.lang.wrapper.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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

//	엄청 길게 죽죽 있는 String타입을 나누는 준비를 하는 메서드
	public WeatherDTO[] init() {
		String info = this.sb.toString();
		info = info.replace(",", "-");

		WeatherDTO[] wdtoar = this.useTokenizer(info);
		return wdtoar;
	}

//	엄청 길게 죽죽 있는 String타입을 StringTokenizer를 사용하여 나누는 메서드
	private WeatherDTO[] useTokenizer(String info) {

		ArrayList<WeatherDTO> arrays = new ArrayList<WeatherDTO>();

		StringTokenizer st = new StringTokenizer(info, "-");
		WeatherDTO[] usetoken = new WeatherDTO[st.countTokens() / 4];

		int i = 0;

		while (st.hasMoreTokens()) {

			WeatherDTO temp = new WeatherDTO();

			String city = st.nextToken().trim();
			double gion = Double.parseDouble(st.nextToken().trim());
			String status = st.nextToken().trim();
			int humidity = Integer.parseInt(st.nextToken().trim());

			temp.setCity(city);
			temp.setGion(gion);
			temp.setStatus(status);
			temp.setHumidity(humidity);

			arrays.add(temp);

			usetoken[i] = temp;
			i++;
		}

		return usetoken;

	}

//	엄청 길게 죽죽 있는 String타입을 배열...?을 사용하여 나누는 메서드
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
		boolean flag = false;

		for (int i = 0; i < count; i++) {
			if (city.equals(ar[i].getCity())) {

				flag = true;
				for (int j = i + 1; j < count; j++) {
					minusar[j - 1] = ar[j];

				}
				break;
			} else {
				if (i == count - 1) {
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
