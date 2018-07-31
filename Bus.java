public class Bus extends Vehicle{
	public void playHorn(){
		System.out.println("Bus Ko awaj");
	}
	public void play(){
		super.playHorn();
		this.playHorn();
	}
	public static void main(String[] args){
		Bus b=new Bus();
		b.playHorn();
	}
}