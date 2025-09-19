

import java.util.Scanner;

public class test {

    public static void testing() {
        stuff testhh = new stuff();

        
        System.out.println("Nhap ten::::");
        Scanner Scanner = new Scanner(System.in);

        Scanner input = null;
        String inputUser = input.nextLine();

        System.out.println("Hello: "+ inputUser);


        testhh.ten = inputUser;
        testhh.ma = "6";
        System.err.println("Ten voi  ma 06:"+  testhh.layten("6"));
        
    }

}

