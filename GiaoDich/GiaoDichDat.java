package GiaoDich;
import java.util.Scanner;
public class GiaoDichDat extends GiaoDich{
	private String loaiDat;
	public GiaoDichDat() {
		super();
	}
	public GiaoDichDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	@Override
	public String toString() {
		return super.toString() + ", loai dat: " + this.loaiDat;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai dat(A/B/C): ");
		loaiDat = sc.nextLine();
	}
}
