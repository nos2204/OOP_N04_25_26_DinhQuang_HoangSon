package model;
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