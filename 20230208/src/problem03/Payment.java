package problem03;

public interface Payment {
	//필드(상수)
	static final double ONLINE_PAYMENT_RATIO = 0.05;
	static final double OFFLINE_PAYMENT_RATIO = 0.03;
	
	//추상 메소드
	public int online(int price);
	public int offline(int price);
	public void showInfo();
	
}
