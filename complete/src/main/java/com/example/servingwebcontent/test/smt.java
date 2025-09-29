package com.example.servingwebcontent.test;
import com.example.servingwebcontent.controllers.CellPhone;
import com.example.servingwebcontent.controllers.Tune;
import com.example.servingwebcontent.controllers.ObnoxiousTune;

public class smt {
    public static void test() {
        CellPhone noiseMaker = new CellPhone();
        Tune t1 = new Tune();
        Tune t2 = new ObnoxiousTune();
        noiseMaker.ring((ObnoxiousTune) t1); // Tune
        noiseMaker.ring((ObnoxiousTune) t2); // Obnoxious Tune
    }

}