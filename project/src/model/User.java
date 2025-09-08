package model;
<<<<<<< HEAD
public class User {

        private static String userName;
        private static String userAddress;

        public static String getUser() {
                return userName;
        }

        public static String getAddress() {
                return userAddress;
        }

        public static void setUser(String name, String address) {
                userName = name;
                userAddress = address;
        }
}
=======

public class User{
    private static String userName;
    private static String userPassword;

    public static String getUser(){
        return userName;
    }

    public static String getPassword(){
        return userPassword;
    }

    public static void setUser(String name, String password){
        userName = name;
        userPassword = password;
    }
}
>>>>>>> 6f34bf8801a72132c67f285f1e3672df9fc5a175
