package Practice.Input;

import java.util.Scanner;

public class Input_user_details {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int rollno=sc.nextInt();
        String field=sc.next();
        System.out.println("Name of user "+name);
        System.out.println("rollno of user "+rollno);
        System.out.println("field of user "+field);

    }
}
