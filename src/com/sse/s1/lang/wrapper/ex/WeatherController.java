package com.sse.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {

	private Scanner sc;
	private WeatherDTO[] dtos;
	private WeatherService weatherService;
	private WeatherView weatherView;

//	지금 변수명들 앞에 this.(이 객체의 주소)이 다 생략 됐다고 생각해!
//	모든 변수의 초기화는 WeatherController 생성자 내에서 하기
//	1.날씨 전체 정보 2. 종료를 하는 start 메서드 만들기

	public WeatherController() {

		weatherService = new WeatherService();
		dtos = weatherService.init();
		weatherView = new WeatherView();
		sc = new Scanner(System.in);
	}

	public void start() {

		boolean flag = true;

		while (flag) {

			System.out.println("1.날씨 전체 정보");
			System.out.println("2.날씨 정보 검색");
			System.out.println("3.날씨 정보 추가");
			System.out.println("4.날씨 정보 삭제");
			System.out.println("5.종료");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				weatherView.view(dtos);
				System.out.println("날씨 정보 출력 완료, 처음으로 돌아갑니다");
				break;
			case 2:

				WeatherDTO citywether = weatherService.findByCity(dtos);
				weatherView.view(citywether);

				break;

			case 3:

				dtos = weatherService.addWeather(dtos);
				System.out.println("날씨 정보 추가 완료, 처음으로 돌아갑니다");
				break;

			case 4:

				dtos = weatherService.removeWeather(dtos);

				break;

			case 5:
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			default:
				System.out.println("없는 메뉴입니다. 처음으로 돌아갑니다.");
				break;
			}

		}

	}

}
