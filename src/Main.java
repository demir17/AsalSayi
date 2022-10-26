import java.util.Scanner;

public class Main {

    static int isAsal(int a, int i, int control, int top){
        if(i<a-1){
            if(a%i == 0) control++;
        }
        else return 0;
        i++;
        if(control == 1) top ++;
        if(top == a -3) return 1;

        return isAsal(a, i, control, top);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("sayı giriniz: ");
        a = input.nextInt();
        int i=2, control = 1, top = 0;
        int sonuc = isAsal(a, i, control, top);
        if(sonuc == 1) System.out.println("ASAL");
        else System.out.println("ASAL DEĞİL");


    }
}
