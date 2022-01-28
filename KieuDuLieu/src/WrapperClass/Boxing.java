package WrapperClass;

public class Boxing {
	public static void main(String[] args) {
		
	int a = 5;
	Integer y = new Integer(5);	
	int z = a + y; 	//autoboxing, cu the la unboxing chuyen Interger ve int 
	System.out.println(z);
	
	
	int b1 = Integer.valueOf(20);			
	int b2 = Integer.valueOf(10);	
	System.out.println(b1 + b2);
 	
	Integer k = 10;	
	//o day boxing chuyen int thanh Integer
	//k o day la bien tham chieu
	//10 thanh kieu doi tuong
	k = new Integer(10);	
	
	int x1 = 10;
	int x2 = 10;
	Integer x3 = 10;
	System.out.println(x1 == x2);
	System.out.println(x1 == x3);
	
	Integer k1 = new Integer(10);
	Integer k2 = new Integer(10);
	int k3 = 10;
	// k1 va k2 la bien tham chieu
	System.out.println(k1 == k2);
	System.out.println(k1 == k3);	//khi nay k1 duoc unboxing
	System.out.println(k1.equals(k2));	// equals so sanh gia tri ben trong 
	
	}
}
