package labb3;
import java.util.Scanner;
public class tinhnhanvien{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        System.out.println("Nhap luong tang: ");
        a = scanner.nextFloat();
        nhanvien nv = new nhanvien();
        nv.settennhanvien("Huynh Teo");
        nv.sethesoluong(10);
        nv.setluongcoban(5000000);
        nv.settangluong(nv.gethesoluong()*a);
        nv.setluong(nv.getluongcoban()*nv.gethesoluong());
        System.out.println("Ten Nhan Vien: "+nv.gettennhanvien());
        System.out.println("Luong: "+nv.getluong());
        if(nv.gettangluong()>nv.getluongmax()){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}