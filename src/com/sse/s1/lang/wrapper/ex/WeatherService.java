package com.sse.s1.lang.wrapper.ex;

public class WeatherService {

	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append(" 서울   , 29.3  -맑음  -   60");
		this.sb.append(" -부산   , 33.6  -흐림  -   90");
		this.sb.append(" -제주   , 26.8  -눈  -   30");
		this.sb.append(" -대구   , 11.1  -태풍  -   70");
	}

	public void init() {
		String info = this.sb.toString();
		info = info.replace(",", "-");

		String[] infoslice = info.split("-");

		for (int i = 0; i < infoslice.length; i++) {
			infoslice[i] = infoslice[i].trim();
//			System.out.println(infoslice[i]);
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
		System.out.println(wdtoar[3].getCity());
	}

}
