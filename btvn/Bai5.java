package btvn;
import java.util.Scanner;
public class Bai5 {
    public static void xoaphantu(){
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        n=scanner.nextInt();
        int A[]=new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for(i=0;i<n;i++){
        System.out.println("Nhap phan tu thu "+i+":");
        A[i]=scanner.nextInt();
        }System.out.println("Nhap so nguyen k: ");
        int k = scanner.nextInt();
        for(c=i=0;i<n;i++){
            if(A[i]!=k){
                A[c]=A[i];
                c++;
            }
        }n=c;
        System.out.println("Mang con lai sau khi xoa "+k+" la");
        for(i=0;i<n;i++){
            System.out.print(A[i]+"\t");
        }
    }public static void main(String[] args){
        xoaphantu();
    }   
}
