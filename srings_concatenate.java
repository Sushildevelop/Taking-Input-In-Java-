package Practice.Input;

import java.util.Scanner;

public class srings_concatenate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int i=1;
//        while(sc.hasNextLine()){
        while (i<=t){
            String a= sc.next();
            String b= sc.next();
            System.out.println(a+b);
            i++;
        }
    }
}
