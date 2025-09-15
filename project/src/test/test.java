package test;

import java.util.Scanner;

import model.stuff;

public class test {

    public static void testing() {
        stuff testhh = new stuff();

        
        System.out.println("Nhap ten::::");
        Scanner input = new Scanner(System.in);

        String inputUser = input.nextLine();

        System.out.println("Hello: "+ inputUser);


        testhh.ten = inputUser;
        testhh.ma = "6";
        System.err.println("Ten voi  ma 06:"+  testhh.layten("6"));
        
    }

}

