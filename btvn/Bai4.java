package btvn;
import java.util.Scanner;
public class Bai4 {
    public static void giaithua(){
        Scanner scanner = new Scanner(System.in);
        int n, ketqua, i;
        System.out.println("Nhap so nguyen n: ");
        n=scanner.nextInt();
        ketqua = 1;
        i = 1;
        while(i<=n){
            ketqua=ketqua*i;
            i++;
        }
        System.out.println("Giai thua= "+ketqua);
    }public static void main(String[] args){
        giaithua();
    }   
}