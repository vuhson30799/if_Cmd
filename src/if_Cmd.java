import java.util.Random;
import java.util.Scanner;

public class if_Cmd {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        //ChiSoCanNang();
        //NamNhuan();
        //TinhLuong();
        //xoSo();
        readNumber();
    }

    public static void ChiSoCanNang() {

        System.out.println(" Nhap chieu cao: ");
        double height = scanner.nextDouble();
        System.out.println(" Nhap can nang: ");
        double weight = scanner.nextDouble();
        double BMI = weight / Math.pow(height, 2);
        if (BMI < 18.5) {
            System.out.println(" Underweight ");
        } else if (BMI < 25) {
            System.out.println(" Normal ");
        } else if (BMI < 30) {
            System.out.println(" Overweight ");
        } else {
            System.out.println(" Obese ");
        }
    }

    public static void NamNhuan() {
        System.out.println(" Nhap Nam can kiem tra ");
        int year = scanner.nextInt();
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0) {
                    System.out.printf(" %d la nam nhuan ", year);
                } else System.out.printf(" %d khong phai la nam nhuan ", year);
            else System.out.printf(" %d la nam nhuan ", year);
        else System.out.printf(" %d khong phai la nam nhuan ", year);
    }

    public static void TinhLuong() {
        System.out.println(" Nhap so nam lam viec: ");
        byte NamLamviec = scanner.nextByte();
        System.out.println(" Nhap he so luong: ");
        byte HeSoLuong = scanner.nextByte();
        int Luong = 0;
        switch (HeSoLuong) {
            case 1:
                Luong = 4000000 + NamLamviec * 500000;
                break;
            case 2:
                Luong = 8000000 + NamLamviec * 500000;
                break;
            case 3:
                Luong = 12000000 + NamLamviec * 500000;
                break;
            case 4:
                Luong = 16000000 + NamLamviec * 500000;
                break;
            case 5:
                Luong = 20000000 + NamLamviec * 500000;
                break;
            default:
                System.out.println(" Loi! ");
        }
        System.out.println(" Tien luong la: " + Luong);
    }

    public static void xoSo() {
        int soTrung = random.nextInt(100);
        int soTrungNguoc = soTrung % 10 * 10 + soTrung / 10;
        System.out.println(" Nhap mot so co 2 chu so ");
        int soNhap = scanner.nextInt();
        if (soNhap == soTrung)
            System.out.println("Price is 10.000$");
        else if (soNhap == soTrungNguoc)
            System.out.println("Price is 3000$");
        else if (soNhap % 10 == soTrung % 10 || soNhap / 10 == soTrung % 10 || soNhap / 10 == soTrung % 10 || soNhap / 10 == soTrung / 10)
            System.out.println("Price is 1000$");
        else System.out.println(" Good luck next time");
    }

    public static void readNumber() {
        System.out.println(" Nhap chu so can doc");
        int input = scanner.nextInt();
        int chuSoHangTram = input / 100;
        int chuSoHangChuc = input % 100 / 10;
        int chuSoHangDonVi = input % 10;
        switch (chuSoHangTram) {
            case 1:
                System.out.print("One Hundred and ");
                break;
            case 2:
                System.out.print("Two Hundred and ");
                break;
            case 3:
                System.out.print("Three Hundred and ");
                break;
            case 4:
                System.out.print("Four Hundred and ");
                break;
            case 5:
                System.out.print("five Hundred and ");
                break;
            case 6:
                System.out.print("Six Hundred and ");
                break;
            case 7:
                System.out.print("Seven Hundred and ");
                break;
            case 8:
                System.out.print("Eight Hundred and ");
                break;
            case 9:
                System.out.print("Nine Hundred and ");
                break;
        }
        switch (chuSoHangChuc) {
            case 1: {
                switch (input % 100) {
                    case 10:
                        System.out.print("Ten");
                        break;
                    case 11:
                        System.out.print("Eleven");
                        break;
                    case 12:
                        System.out.print("Twelve");
                        break;
                    case 13:
                        System.out.print("Thirdteen");
                        break;
                    case 14:
                        System.out.print("Fourteen");
                        break;
                    case 15:
                        System.out.print("Fifteen");
                        break;
                    case 16:
                        System.out.print("Sixteen");
                        break;
                    case 17:
                        System.out.print("Seventeen");
                        break;
                    case 18:
                        System.out.print("Eighteen");
                        break;
                    case 19:
                        System.out.print("Nineteen");
                        break;
                }
                break;
            }
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Fourty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
        }
        if (chuSoHangChuc != 1) {
            switch (chuSoHangDonVi) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
            }
        }

    }


}

