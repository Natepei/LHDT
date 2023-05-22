package labbtuan5;

public class phongmaytinh extends phonghoc{
	private int soLuongMayTinh;
	public int getSoLuongMayTinh() {
		return soLuongMayTinh;
	}
	public void setSoLuongMayTinh(int soLuongMayTinh) {
		this.soLuongMayTinh = soLuongMayTinh;
	}
	/**
	 * 
	 */
	public phongmaytinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public phongmaytinh(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}

	public phongmaytinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soLuongMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soLuongMayTinh = soLuongMayTinh;
	}
	private float soChuanMayTinh() {
		double soChuan = this.getDienTich() / 1.5;
		return (float) soChuan;
	}
	
	@Override
	public boolean isDatChuan() {
		float soMayTinhChuan = this.soChuanMayTinh();
		if(super.phongDuAnhSang() == true && (soMayTinhChuan <= (float) this.getSoLuongMayTinh()) ) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		
		return super.toString()+String.format(" | %15s | %15d | %-25s | %15s | %-15s | %-20s", "--",this.getSoLuongMayTinh(),"--","--","--","Phong May Tinh");
	}
}
