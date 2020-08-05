package jp.hashy.javastudy;

class Staff {
	String name;
	int stahhid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}

	public Staff(String name, int stahhid, String email) {
		super();
		this.name = name;
		this.stahhid = stahhid;
		this.email = email;
	}
}
public class StaffInfo {
	
	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada", 12345, "yamada@gmail");
//		yamada.name = "Taro Yamada";
		
		yamada.sayhello();
	}

}
