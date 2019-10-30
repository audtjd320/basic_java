package data;

import java.util.ArrayList;

import service.UserServiceImpl;
import vo.UserVO;

public class Database {
	//싱글톤 패턴
	private static Database intance;

	private Database(){} //생성자

	public static Database getInstance(){
		if(intance == null){
			intance = new Database();
		}
		return intance;
	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<UserVO>(); //tb_user가 테이블
	
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		
		tb_user.add(user);
	}
	
}
