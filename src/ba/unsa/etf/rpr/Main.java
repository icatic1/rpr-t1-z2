package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    static int sumaCifara(int a){
        int suma=0;
        for(;;){
            if(a==0) break;
            suma=suma+a%10;
            a=a/10;
        }
        return suma;
    }

    public static void main(String[] args) {


        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n=sc.nextInt();
        System.out.println("Brojevi koji zadovoljavaju kriterij su:");
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i) == 0){
                System.out.println(i);
            }
        }

    }
}
