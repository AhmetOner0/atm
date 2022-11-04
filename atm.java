package patikadev;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500, price, select;

        while (right > 0) {
            System.out.print("kullanıcı adınız: ");
            userName = inp.nextLine();
            System.out.print("şifreniz: ");
            password = inp.nextLine();
            if (userName.equals("abc") && password.equals("123")) {
                System.out.println("x bankasına hoşgeldiniz!");
                System.out.println("lütfen seçiminizi yapın");
                System.out.println("1-para yatırma\n" +
                        "2-para çekme\n" +
                        "3-bakiye sorgulama\n" +
                        "4-çıkış yap");
                select = inp.nextInt();
                switch (select){
                    case 1:
                        System.out.println("yatırmak istediğiniz para miktarını giriniz:");
                        price = inp.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.println("çekmek istediğiniz para miktarını giriniz:");
                        price = inp.nextInt();
                        if (price > balance) {
                            System.out.println("yetersiz bakiye");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("bakiyeniz:"+balance);
                        break;
                    case 4:
                        System.out.println("tekrar görüşmek üzere");
                        break;
                }
            }else {
                right--;
                System.out.println("hatalı giriş!");
                if (right == 0){
                    System.out.println("hesabınız bloke edilmiştir!");
                }else {
                    System.out.println("kalan hakkınız:"+right);

                }
            }
        }
    }
}
