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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStahhid() {
		return stahhid;
	}

	public void setStahhid(int stahhid) {
		this.stahhid = stahhid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class RemoteStaff extends Staff {
	public String location;
	public RemoteStaff(String name, int stahhid, String email) {
		super(name, stahhid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}

public class StaffInfo {
	
	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada", 12345, "yamada@gmail");
		RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 23456, "tanaka@gmail");
		tanaka.location = "大阪";
//		yamada.name = "Taro Yamada";
		
//		yamada.sayhello();
		System.out.println("社員情報");
		System.out.println("氏名：" + yamada.getName());
		System.out.println("社員番号：" + yamada.getStahhid());
		System.out.println("Email：" + yamada.getEmail());
		
		System.out.println("社員情報");
		System.out.println("氏名：" + tanaka.getName());
		System.out.println("社員番号：" + tanaka.getStahhid());
		System.out.println("Email：" + tanaka.getEmail());
		System.out.println("勤務地：" + tanaka.location);
		
	}

}
