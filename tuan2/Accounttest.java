package tuan2;
public class Accounttest {
	public static void main(String[] args) {
		Account ac = new Account(999999, "chua xac dinh", 50, "" );
		Acountlist acl = new Acountlist();
		ac.naptien();
		ac.ruttien();
		ac.daohan();
		acl.themtaikhoan(ac);
		System.out.println(ac);
	}
}
