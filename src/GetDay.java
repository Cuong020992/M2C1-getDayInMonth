import java.util.Scanner;

public class GetDay {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng: ");
        int month = sc.nextInt();

        switch (month){
            case 2:
                System.out.println("Tháng có 28 ngày (29 ngày năm nhuận)");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            default:
                System.out.println("tháng có 31 ngày");
                break;
        }
    }
}
