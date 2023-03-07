import java.util.Scanner;

public class Main {

    static int usHesap(int taban,int tavan){
        if (tavan==0){
            return 1;
        }


        return usHesap(taban,tavan-1)*taban;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısını girin:");
        int taban= input.nextInt();
        System.out.println("Üs sayısını girin:");
        int tavan= input.nextInt();

        System.out.println(usHesap(taban,tavan));

    }
}