package com.sse.s1.lang.wrapper.ex;

public class WeatherView {

	public void view(WeatherDTO[] dtos) {

//		날씨들의 정보를 받아서 이쁘게 출력하는거
		System.out.println("도시\t온도\t날씨\t습도");
		for (int i = 0; i < dtos.length; i++) {

			System.out.println(dtos[i].getCity() + "\t" + dtos[i].getGion() + "\t" + dtos[i].getStatus() + "\t"
					+ dtos[i].getHumidity());

		}

	}

	public void view(WeatherDTO cityw) {

		if (cityw != null) {
			System.out.println("도시\t온도\t날씨\t습도");
			System.out.println(
					cityw.getCity() + "\t" + cityw.getGion() + "\t" + cityw.getStatus() + "\t" + cityw.getHumidity());
			System.out.println("날씨 정보 출력 완료, 처음으로 돌아갑니다");
		} else {
			System.out.println("없는 도시명입니다. 다시 확인하세요");
		}

	}

}
