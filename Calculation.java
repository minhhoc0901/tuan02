package BT;

public class Calculation {
	private double a, b;
	
	public Calculation(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double sum() {
		return a + b;
	}
	
	public double minus() {
		return a - b;
	}
	
	public double mul() {
		return a * b;
	}
	
	public double div() {
		return a / b;
	}
	
	public static void main(String[] args) {
		Calculation c = new Calculation(3,2);
		System.out.println("cộng " + c.sum());
		System.out.println("trừ " + c.minus());
		System.out.println("Nhân " + c.mul());
		System.out.println("chia " + c.div());
	}
}