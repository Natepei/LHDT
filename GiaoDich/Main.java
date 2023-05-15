package GiaoDich;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean cont = true;
		Array arr = new Array();
		do {
			arr.menu();
			n = sc.nextInt();
			switch(n) {
			case 1:
				arr.nhapdat();
				break;
			case 2:
				arr.xuatdat();
				break;
			case 3:
				arr.nhapnha();
				break;
			case 4:
				arr.xuatnha();
				break;
			case 5:
				arr.tinhtongdat();
				break;
			case 6:
				arr.trungbinhthanhtiendat();
				break;
			case 7:
				arr.cachoadonthang9nam2013();
				break;
			default:
				System.out.println("Tam biet");
				cont = false;
				break;
			}
		}while(cont);
	}
}
