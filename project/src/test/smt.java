

import controllers.CellPhone;
import controllers.Tune;
import controllers.ObnoxiousTune;

public class smt {
    public static void test() {
        CellPhone noiseMaker = new CellPhone();
        Tune t1 = new Tune();
        Tune t2 = new ObnoxiousTune();
        noiseMaker.ring((ObnoxiousTune) t1); // Tune
        noiseMaker.ring((ObnoxiousTune) t2); // Obnoxious Tune
    }

}