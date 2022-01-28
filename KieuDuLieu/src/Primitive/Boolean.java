package Primitive;

public class Boolean {
	String name;
	boolean GioiTinh ;
	int a = 1;        
	
	Boolean(){}
	
	Boolean(String name, boolean GioiTinh){
		this.name = name;
		this.GioiTinh = GioiTinh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean student = new Boolean("Hai Anh", false);
		
		if(student.isGioiTinh() == true ) {
			System.out.println(student.getName() + " gioi tinh Nam");
		}else {
			System.out.println(student.getName() + " gioi tinh Nu");
		}
		
	}
}
