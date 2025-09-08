package test;

public class User{
    private static String userName;
    private static String userAdress;

    public static String getUser(){
        return userName;
    }

    public static String getAddress(){
        return userAdress;
    }

    public static void setUser(String name, String address){
        userName = name;
        userAdress = address;
    }
    
}
