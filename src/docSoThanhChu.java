import java.util.Scanner;

public class docSoThanhChu {
    public static String readNumbersIntoWords(int number) {
        String docSo = "";
        switch (number) {
            case 0: {
                docSo = "không";
                break;
            }
            case 1: {
                docSo = "một";
                break;
            }
            case 2: {
                docSo = "hai";
                break;
            }
            case 3: {
                docSo = "ba";
                break;
            }
            case 4: {
                docSo = "bốn";
                break;
            }
            case 5: {
                docSo = "năm";
                break;
            }
            case 6: {
                docSo = "sáu";
                break;
            }
            case 7: {
                docSo = "bảy";
                break;
            }
            case 8: {
                docSo = "tám";
                break;
            }
            case 9: {
                docSo = "chín";
                break;
            }
            case 10: {
                docSo = "mười";
                break;
            }
        }
        return docSo;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số :");
        number = sc.nextInt();
        if (number >= 0 && number <= 10) {
            System.out.println(readNumbersIntoWords(number));
        } else if (number > 10 && number < 20) {
            int hangDonVi = number % 10;
            System.out.println("mười " + readNumbersIntoWords(hangDonVi));
        } else if (number >= 20 && number < 100) {
            int hangChuc = number / 10;
            int hangDonVi = number % 10;
            System.out.println(readNumbersIntoWords(hangChuc) + " mươi " + readNumbersIntoWords(hangDonVi));
        } else if (number >= 100 && number < 1000) {
            int hangTram = number / 100;
            int hangChuc = (number % 100) / 10;
            int hangDonVi = (number % 100) % 10;
            System.out.println(readNumbersIntoWords(hangTram) + " trăm " + readNumbersIntoWords(hangChuc) + " mươi " + readNumbersIntoWords(hangDonVi));
        }

    }
}
