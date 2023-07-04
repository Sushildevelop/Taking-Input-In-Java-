package Practice.Input;

import java.util.Scanner;

public class total_marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int phy=sc.nextInt();
        int maths=sc.nextInt();
        int chem=sc.nextInt();
        int totalmarks=phy+maths+chem;

        int percentage=totalmarks/3;
        System.out.println("TotalMarks is "+totalmarks);
        System.out.println("Percentage is "+percentage+"%");
    }
}
