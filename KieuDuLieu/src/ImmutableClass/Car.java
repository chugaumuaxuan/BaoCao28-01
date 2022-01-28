package ImmutableClass;

public class Car {
	private final String name;
	private final int year;
	
	 Car(String n, int y) {
		this.name = n;
		this.year = y;
	}
	public String getName() {
		return name;
	}
	 
	public int getYear() {
		return year;
	}
	public static void main(String[] args) {
		Car car1 = new Car("Ford", 2001);
		
		System.out.println("Ten xe o to la: "+ car1.getName());
		System.out.println("Nam san xuat oto: "+ car1.getYear());
	
	}
}

