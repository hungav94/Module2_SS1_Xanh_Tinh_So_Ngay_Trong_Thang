import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thang muon xem ngay");
        int month = sc.nextInt();

        String dayIsMonth;
        switch (month) {
            case 2:
                dayIsMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
        }

        if (dayIsMonth != "") {
            System.out.printf("Thang '%d' co %s ngay", month, dayIsMonth);
        } else {
            System.out.println("chua nhap thang");
        }
    }
}
