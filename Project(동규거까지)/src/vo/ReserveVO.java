package vo;

public class ReserveVO {
	private int reserveCode; //예매 코드
	private String userID; //사용자 아이디
	private int showingCode; // 상영코드
	private int seatCode; // 좌석코드
	
	
	public int getReserveCode() {
		return reserveCode;
	}
	public void setReserveCode(int reserveCode) {
		this.reserveCode = reserveCode;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getShowingCode() {
		return showingCode;
	}
	public void setShowingCode(int showingCode) {
		this.showingCode = showingCode;
	}
	public int getSeatCode() {
		return seatCode;
	}
	public void setSeatCode(int seatCode) {
		this.seatCode = seatCode;
	}
}
