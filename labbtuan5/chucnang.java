package labbtuan5;

import java.util.List;

public interface chucnang {
	public boolean themMotPhongHoc(phonghoc phongHoc);
	public boolean xoaPhongHoc(String maPhongHoc);
	public phonghoc timPhongHoc(String maPhongHoc);
	public void sapXepTangDanTheoDayNha();
	public void sapXepGiamDanTheoDienTich();
	public void sapXepTangDanTheoSoBongDen();
	public int tongSoPhongHoc();
	public List<phonghoc> danhSachPhongDatChuan();
	public List<phonghoc> layHetDanhSach();
}
