import test.test;
import model.User;
import test.TestTime;

public class App {
    public static void main(String[] args) throws Exception {
        test.testing();
        User.getUser();
        TestTime.main(args);
    }
}
