package Day13.homework.class실습;

class Tv{
	private String color = "black";
	private boolean power = false;
	private int channel = 0;

	public Tv() {}
	public void power(){
		if(power==true){
			power = false;
		}else{
			power = true;
		}
	}
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void print(){
		System.out.printf("color	:%s		power:%b		channel:%d\n",color,power,channel);
	}
}

public class Prob1 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.print();  // 첫번째 출력문
		t.power();
		t.print();  // 두번째 출력문
		t.channelUp();
		t.channelUp();
		t.print(); // 세번째 출력문
		
	}
}
