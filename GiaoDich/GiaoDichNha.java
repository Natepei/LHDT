package GiaoDich;
import java.util.Scanner;
public class GiaoDichNha extends GiaoDich{
	private String loaiNha;
	private String diaChi;
	public GiaoDichNha() {
		super();
	}
	public GiaoDichNha(String loaiNha, String diaChi) {
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return super.toString() + ", loai nha: " + this.loaiNha + ", dia chi: " + this.diaChi;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai nha(cao cap/ thuong): ");
		loaiNha = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
	}
}
