package staticKeyword;

import org.junit.Test;

public class StaticTest {
    @Test
    public void metodaTest (){
        Elev elev = new Elev("Brebu", "Lucian");
        elev.prezentare();
        System.out.println();
        Elev elevA = new Elev("Popescu", "Ion");
        elevA.prezentare();
    }
}
