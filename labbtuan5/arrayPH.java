package labbtuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class arrayPH implements chucnang{
	List<phonghoc> dsPhongHoc = null;
	public arrayPH() {
		dsPhongHoc = new ArrayList<phonghoc>();
	}

	public boolean capNhatSoMayTinh(String maPhongHoc,int soLuongCapNhat) {
		phongmaytinh phongCapNhat = new phongmaytinh();
		phonghoc phongTim = this.timPhongHoc(maPhongHoc);
		if(phongTim != null && phongTim instanceof phongmaytinh) {
			phongCapNhat = (phongmaytinh) phongTim;
			phongCapNhat.setSoLuongMayTinh(soLuongCapNhat);
			dsPhongHoc.set(dsPhongHoc.indexOf(phongCapNhat), phongCapNhat);
			return true;
		}else {
			return false;
		}
	}
	

	public List<phonghoc> danhSachPhongMayCo60May() {
		List<phonghoc> dsTam = new ArrayList<phonghoc>();
		for(phonghoc phongHoc: dsPhongHoc) {
			if(phongHoc instanceof phongmaytinh && (((phongmaytinh) phongHoc).getSoLuongMayTinh() == (int)60)) {
				dsTam.add(phongHoc);
			}
		}
		return dsTam;
	}
	

	@Override
	public boolean themMotPhongHoc(phonghoc phongHoc) {
		if(dsPhongHoc.contains(phongHoc)) {
			return false;
		}else {
			dsPhongHoc.add(phongHoc);
			return true;
		}	
	}
	

	@Override
	public boolean xoaPhongHoc(String maPhongHoc) {
		phonghoc phongTim = this.timPhongHoc(maPhongHoc);
		if(phongTim != null) {
			dsPhongHoc.remove(phongTim);
		}
		return false;
	}
	

	@Override
	public phonghoc timPhongHoc(String maPhongHoc) {
		for(phonghoc phongHoc : dsPhongHoc) {
			if(phongHoc.getMaPhong().equalsIgnoreCase(maPhongHoc)) {
				return phongHoc;
			}
		}
		return null;
	}
	@Override
	public void sapXepTangDanTheoDayNha() {
		Collections.sort(dsPhongHoc, new Comparator<phonghoc>() {

			@Override
			public int compare(phonghoc o1, phonghoc o2) {
				
				return o1.getDayNha().compareTo(o2.getDayNha());
			}
		});
		
	}
	@Override
	public void sapXepGiamDanTheoDienTich() {
		Collections.sort(dsPhongHoc, new Comparator<phonghoc>() {

			@Override
			public int compare(phonghoc o1, phonghoc o2) {
				Double obj1 =  o1.getDienTich();
				Double obj2 =  o2.getDienTich();
		
				return obj2.compareTo(obj1);
			}
		});
		
	}
	@Override
	public void sapXepTangDanTheoSoBongDen() {
		Collections.sort(dsPhongHoc, new Comparator<phonghoc>() {

			@Override
			public int compare(phonghoc o1, phonghoc o2) {
				Integer obj1 =  o1.getSoBongDen();
				Integer obj2 =  o2.getSoBongDen();
		
				return obj1.compareTo(obj2);
			}
		});
		
	}
	

	@Override
	public int tongSoPhongHoc() {
		return dsPhongHoc.size();
	}
	
	@Override
	public List<phonghoc> danhSachPhongDatChuan() {
		List<phonghoc> dsTam = new ArrayList<phonghoc>();
		for(phonghoc phongHoc : dsPhongHoc) {
			if(phongHoc.isDatChuan()) {
				dsTam.add(phongHoc);
			}
		}
		return dsTam;
	}
	@Override
	public List<phonghoc> layHetDanhSach() {
		return dsPhongHoc;
	}
	
	public void sapXepTheoID() {
		Collections.sort(dsPhongHoc, new Comparator<phonghoc>() {

			@Override
			public int compare(phonghoc o1, phonghoc o2) {
				
				return o1.getMaPhong().compareTo(o2.getMaPhong());
			}
		});
		
	}
	
}
