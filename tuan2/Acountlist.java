package tuan2;
import java.util.Scanner;
import java.util.ArrayList;
public class Acountlist {
	Scanner sc = new Scanner(System.in);
	int count;
	int n;
	ArrayList<Account> acclist;
	public Acountlist() {
		count = 0;
		n = 10;
		acclist = new ArrayList<>();
	}
	public Acountlist (int count, int n) {
		this.count = count;
		this.n = n;
		System.out.println("Nhap so phan tu n= ");
		n = sc.nextInt();
		if(n > 0) {
			System.out.println("Co " + n + "phan tu ");
		}
		else {
			n = 10;
			count = 0;
		}
	}
	public void themtaikhoan(Account ac) {
		System.out.println("Nhap so luong can them: ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			ac.nhapsotk();
			acclist.add(ac);
		}
	}
}
