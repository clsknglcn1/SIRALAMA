import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        int a, b, c;
        Scanner number = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        a = number.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b = number.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        c = number.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }

        } else if ((b<a)&&(b<c)) {
            if(a<c){
                System.out.println("b<a<c");

            }else{
                System.out.println("b<c<a");
            }

        } else if ((c<a)&&(c<b)) {
            if (a<b){
                System.out.println("c<a<b");

            }else {
                System.out.println("c<b<a");
            }

        }

    }

}




