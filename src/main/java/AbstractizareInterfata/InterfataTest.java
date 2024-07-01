package AbstractizareInterfata;

import java.lang.annotation.Target;
import org.junit.Test;

public class InterfataTest {
    @Test

    public void testMethod(){

        PersoanaStudent Luci = new PersoanaStudent("Lucian","Brebu", 37);
        PersoanaAngajat Luci2 = new PersoanaAngajat("Lucian","Brebu", 37);
        StudentAngajat Luci3 = new StudentAngajat("Lucian","Brebu", 37);


    }
}
