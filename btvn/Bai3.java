package btvn;
import java.util.Scanner;
public class Bai3 {
    public static void docso(){
        int so, donvi, chuc, tram;
Scanner sc = new Scanner(System.in);
System.out.println("Nhap so nguyen ba chu so: ");
so = sc.nextInt();
if (so < 100 || so > 999) {
	System.out.println("khong hop le!");
}
donvi = so % 10;
so/=10;
chuc = so % 10;
tram = so / 10;
        if (tram==1){
 System.out.printf("Mot");
}if (tram==2){
 System.out.printf("Hai");
}if (tram==3){
 System.out.printf("Ba");
}if (tram==4){
System.out.printf("Bon");
}if (tram==5){
System.out.printf("Nam");
}if (tram==6){
System.out.printf("Sau");
}if (tram==7){
System.out.printf("Bay");
}if (tram==8){
System.out.printf("Tam");
}if (tram==9)
{System.out.printf("Chin");
}System.out.printf(" Tram ");
if (chuc==2){
System.out.printf("Hai");
}if (chuc==3){
System.out.printf("Ba");
}if (chuc==4){
System.out.printf("Bon");
}if (chuc==5){
System.out.printf("Nam");
}if (chuc==6){
System.out.printf("Sau");
}if (chuc==7){
System.out.printf("Bay");
}if (chuc==8){
System.out.printf("Tam");
}if (chuc==9){
System.out.printf("Chin");
}System.out.printf(" Muoi ");
if (donvi==1){
System.out.printf("Mot");
}if (donvi==2){
System.out.printf("Hai");
}if (donvi==3){
System.out.printf("Ba");
}if (donvi == 4){
System.out.printf("Bon");
}if (donvi==5){
System.out.printf("Lam");
}if (donvi==6){
System.out.printf("Sau");
}if (donvi==7){
System.out.printf("Bay");
}if (donvi==8){
System.out.printf("Tam");
}if (donvi==9){
System.out.printf("Chin");
}
    }public static void main(String[] args){
        docso();
    }
}  

