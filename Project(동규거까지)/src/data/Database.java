package data;

import java.util.ArrayList;

import service.UserServiceImpl;
import vo.MovieVO;
import vo.NoticeVO;
import vo.ReserveVO;
import vo.ReviewVO;
import vo.SeatVO;
import vo.ShowingVO;
import vo.UserVO;

public class Database {
	private static Database instance;

	private Database(){}

	public static Database getInstance(){
		if(instance == null){
			instance = new Database();
		}
		return instance;
	}

	public ArrayList<UserVO> tb_user = new ArrayList<UserVO>();
	
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		user.setManager(true);
		
		tb_user.add(user);
		
		UserVO user2 = new UserVO();
		
		user2.setId("test");
		user2.setPassword("test");
		user2.setName("test");
		tb_user.add(user2);
	}
	
	
	
	public ArrayList<NoticeVO> tb_notice = new ArrayList<NoticeVO>();
	
	{
		NoticeVO notice1 = new NoticeVO();
		notice1.setTitle("1번 공지사항");
		notice1.setContents("1번 내용");
		tb_notice.add(notice1);
		
		NoticeVO notice2 = new NoticeVO();
		notice2.setTitle("2번 공지사항");
		notice2.setContents("2번 내용");
		tb_notice.add(notice2);
	}
	
	public ArrayList<MovieVO> tb_movie = new ArrayList<MovieVO>();
	
	{
		MovieVO movie = new MovieVO();
		movie.setMovieCode(1);
		movie.setMovieName("말레피센트");
		movie.setRunTime(120);
		movie.setDirector("요아킴 뢰닝");
		movie.setScore(7.6);
		movie.setActors("안젤리나 졸리");
		movie.setAgeLimit(15);
		movie.setStory("강력한 어둠의 지배자이자 무어스 숲의 수호자 ‘말레피센트’는 딸처럼 돌봐온\r\t\t\t\t\t\t\t\t\t\t\t\t\t\t‘"
				+ "오로라’와 ‘필립 왕자’의  결혼 약속으로 인간 세계의 ‘잉그리스 왕비’와 대립하게 된다.");
		tb_movie.add(movie);
		
		MovieVO mv = new MovieVO();
		mv.setMovieCode(2);
		mv.setMovieName("조커");
		mv.setRunTime(120);
		mv.setDirector("토드 필립스");
		mv.setScore(9.0);
		mv.setActors("호아킨 피닉스");
		mv.setAgeLimit(15);
		mv.setStory("고담시의 광대 아서 플렉은 코미디언을 꿈꾸는 남자 하지만 모두가 미쳐가는\r\t\t\t\t\t\t\t\t\t\t\t\t"
				+ "코미디 같은 세상에서 맨 정신으로는 그가 설 자리가 없음을 깨닫게 되는데\r\t\t\t\t\t\t\t\t\t\t\t\t"
				+ "이제껏 본 적 없는 진짜 ‘조커’를 만나라!");
		
		tb_movie.add(mv);
	}
	
	public ArrayList<ReserveVO> tb_reserve = new ArrayList<ReserveVO>();
	
	public ArrayList<ReviewVO> tb_review = new ArrayList<ReviewVO>();
	{
		ReviewVO rv = new ReviewVO();
		rv.setReviewCode(1);
		rv.setContents("너무 재밌어요. 시간가는줄 몰랐네요.");
		rv.setScore(9);
		tb_review.add(rv);
	}
	
	///동규꺼
	public ArrayList<ShowingVO> tb_showing = new ArrayList<ShowingVO>();
	{
		ShowingVO sv = new ShowingVO();
		sv.setShowingCode(1);
		sv.setMovieCode(1);
		sv.setScreen(1);
		sv.setDate("191023");
		sv.setTime("12:40");
		
		tb_showing.add(sv);
		
		
		ShowingVO sv2 = new ShowingVO();
		sv2.setShowingCode(1);
		sv2.setMovieCode(1);
		sv2.setScreen(2);
		sv2.setDate("191023");
		sv2.setTime("14:50");
		
		tb_showing.add(sv2);
	}
	
	
	public ArrayList<SeatVO> tb_seat= new ArrayList<SeatVO>();
}
