package vo;

public class SeatVO {
	private int seatCode; //좌석코드
	private int screen; //상영관
	private String seatNum; // 좌석번호
	
	
	public int getSeatCode() {
		return seatCode;
	}
	public void setSeatCode(int seatCode) {
		this.seatCode = seatCode;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
}
