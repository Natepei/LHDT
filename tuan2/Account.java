package tuan2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Account {
	private long sotaikhoan;
	private String tentaikhoan;
	private double sotien;
	private String trangthai;
	Locale localVI = new Locale("vi", "vn");
	Scanner sc = new Scanner(System.in);
	public Account() {}
	public Account(long sotaikhoan, String tentaikhoan, double sotien, String trangthai) {
		this.sotaikhoan = sotaikhoan;
		this.sotien = sotien;
		this.tentaikhoan = tentaikhoan;
		this.trangthai = tentaikhoan;
	}
	public long getSotaikhoan() {
		return sotaikhoan;
	}
	public void setSotaikhoan(long sotaikhoan) {
		this.sotaikhoan = sotaikhoan;
	}
	public String getTentaikhoan() {
		return tentaikhoan;
	}
	public void setTentaikhoan(String tentaikhoan) {
		this.tentaikhoan = tentaikhoan;
	}
	public double getSotien() {
		return sotien;
	}
	public void setSotien(double sotien) {
		this.sotien = sotien;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	@Override
	public String toString() {
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvn = currencyVN.format(sotien);
		return "Account [So tai khoan=" + sotaikhoan + ", Ten tai khoan=" + tentaikhoan + ", So tien=" + tienvn
				+ ", Trang thai=" + trangthai + "]";
	}
	public void naptien() {
		System.out.println("Nhap so tien muon nap: ");
		double tiennap = sc.nextDouble();
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvnnap = currencyVN.format(tiennap);
		sotien = tiennap + sotien;
		System.out.println("Ban vua nap: " + tienvnnap + "VND");
	}
	public void ruttien() {
		System.out.println("Nhap so tien rut: ");
		double tienrut = sc.nextDouble();
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvnrut = currencyVN.format(tienrut);
		sotien = sotien - tienrut;
		System.out.println("Ban vua rut: " + tienvnrut + "VND");
	}
	public void daohan() {
		double laisuat = 0.035;
		sotien = sotien + sotien*laisuat;
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tiendaohan = currencyVN.format(sotien);
		System.out.println("Dao han: " + tiendaohan + "VND");
	}
	public void nhapsotk() {
		System.out.println("Nhap so tai khoan: ");
		sotaikhoan = sc.nextLong();
	}
}
