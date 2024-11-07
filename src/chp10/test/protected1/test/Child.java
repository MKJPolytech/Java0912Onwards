package chp10.test.protected1.test;

import chp10.test.protected1.Parent;

public class Child extends Parent {

    public void testPro(){
        id = "ProtectedId";
        printProtected();
    }
}
