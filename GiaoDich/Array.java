package GiaoDich;
import java.util.ArrayList;
import java.util.Scanner;
public class Array {
	Scanner sc = new Scanner(System.in);
	ArrayList<GiaoDichDat> arrgdd = new ArrayList<>();
	ArrayList<GiaoDichNha> arrgdn = new ArrayList<>();
	long tb = 0;
	long tonggdd = 0;
	int sogdd = 0;
	int sogdn = 0;
	public void nhapdat() {
		System.out.println("Nhap so giao dich dat: ");
		sogdd = sc.nextInt();
		System.out.println("Nhap thong tin dat: ");
		for(int i = 0; i < sogdd; i++) {
			System.out.println("Giao dich dat thu " + (i+1) + ":");
			GiaoDichDat gdd = new GiaoDichDat();
			gdd.nhap();
			arrgdd.add(gdd);
		}
	}
	public void nhapnha() {
		System.out.println("Nhap so giao dich nha: ");
		sogdn = sc.nextInt();
		System.out.println("Nhap thong tin nha: ");
		for(int i = 0; i < sogdn; i++) {
			System.out.println("Giao dich nha thu " + (i+1) + ":");
			GiaoDichNha gdn = new GiaoDichNha();
			gdn.nhap();
			arrgdn.add(gdn);
		}
	}
	public void xuatdat() {
		System.out.println("THong tin giao dich dat: ");
		for(int i = 0; i < arrgdd.size(); i++) {
			System.out.println(arrgdd.get(i).toString());
		}
	}
	public void xuatnha() {
		System.out.println("THong tin giao dich nha: ");
		for(int i = 0; i < arrgdn.size(); i++) {
			System.out.println(arrgdn.get(i).toString());
		}
	}
	public void tinhtongdat() {
		for(int i = 0; i < arrgdd.size() ; i++) {
			if(arrgdd.get(i).getLoaiDat().equalsIgnoreCase("A")) {
				tonggdd += arrgdd.get(i).getDienTich() * arrgdd.get(i).getDonGia() * 1.5;
			}else if(arrgdd.get(i).getLoaiDat().equalsIgnoreCase("B") || arrgdd.get(i).getLoaiDat().equalsIgnoreCase("C")){
				tonggdd += arrgdd.get(i).getDienTich() * arrgdd.get(i).getDonGia();
			}
		}
		System.out.println("Tong tien: " + tonggdd);
	}
	public void trungbinhthanhtiendat() {
		tb = tonggdd / (arrgdd.size());
		System.out.println("Trung binh thanh tien = " + tb);
	}
	public void cachoadonthang9nam2013() {
		System.out.println("Cac giao dich cua thang 9 nam 2013: ");
		System.out.println("Giao dich dat");
		for(int i = 0; i < arrgdd.size(); i++) {
			String[] dateGiaoDichDat = arrgdd.get(i).getNgayGiaoDich().split("/");
			if(dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
				System.out.println(arrgdd.get(i).toString());
			}
		}
		System.out.println("Giao dich nha");
		for(int i = 0; i < arrgdn.size(); i++) {
			String[] dateGiaoDichNha = arrgdn.get(i).getNgayGiaoDich().split("/");
			if(dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
				System.out.println(arrgdn.get(i).toString());
			}
		}
	}
	public void menu() {
		System.out.println("------------------------------------------");
		System.out.println("1. Nhap thong tin dat ");
		System.out.println("2. Xuat thong tin dat ");
		System.out.println("3. Nhap thong tin nha ");
		System.out.println("4. Xuat thong tin nha ");
		System.out.println("5. Tinh tong ");
		System.out.println("6. Trung binh thanh tien cua giao dich dat ");
		System.out.println("7. Giao dich thang 9 nam 2013");
		System.out.println("-------------------------------------------");
		System.out.println("Nhap so khac de thoat");
	}
}
