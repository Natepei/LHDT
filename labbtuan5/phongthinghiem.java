package labbtuan5;

public class phongthinghiem extends phonghoc{
	private String thongTinChuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	
	/**
	 * 
	 */
	public phongthinghiem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public phongthinghiem(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}


	public phongthinghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String thongTinChuyenNganh,
			int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.thongTinChuyenNganh = thongTinChuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}

	public String getThongTinChuyenNganh() {
		return thongTinChuyenNganh;
	}

	public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
		this.thongTinChuyenNganh = thongTinChuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	private String getBonRua() {
		String chuoi = (this.isCoBonRua() == true)?"Co":"Khong";
		return chuoi;
	}
	@Override
	public boolean isDatChuan() {
		if(super.phongDuAnhSang() && this.coBonRua == true) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+String.format(" | %15s | %15s | %-25s | %15d | %-15s | %-20s", "--","--",this.getThongTinChuyenNganh(),this.getSucChua(),this.getBonRua(),"Phong thi nghiem");
	}
}
