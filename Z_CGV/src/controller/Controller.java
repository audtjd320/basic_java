package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	//클래스 안에 인스턴스 변수 생성
	UserService userService = UserServiceImpl.getInstance(); //다른 패키지에 있어서 import해줘야 함.
	
	public static void main(String[] args) {
		/*
		 * 조 소개 > 주제 소개 > 주제 선정 배경 > 프로그램 구조 > 시연
		 * 발표자 1명, 도우미 1명
		 * 
		 * Controller : 메뉴 선택
		 * Service	: 메뉴 기능 수행 (싱글톤 패턴으로 생성해야함)
		 * Dao	: 데이터베이스 접속(Date Access Object)
		 * VO	: 데이터를 담는 클래스(Value Object)(싱글톤 패턴으로 생성해야함)
		 * 
		 * VO의 장점 : 무엇이 저장되어 있는지 쉽게 알 수 있다.
		 * HashMap의 장점 : 클래스를 많이 만들 필요가 없다.(key와 value를 이용)
		 */
		
		new Controller().start();
		
	}

	private void start() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do{
			System.out.println("-----------메뉴------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원목록");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine()); //문자열로 입력받아서 int로 변환.(권장)
//			s.nextInt();// 버그가 있으므로 사용하지 말자.
			
			switch(menu){
			case 1: //회원가입
				userService.join();
				break;
			case 2: //로그인
				userService.login();
				break;
			case 3: //회원목록
				userService.userList();
				break;
			case 0: //프로그램 종료
				System.out.println("프로그램 종료");
				break;
			
			}
		}while(menu != 0);
	}

}










