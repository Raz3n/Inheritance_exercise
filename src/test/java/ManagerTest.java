import org.junit.Before;
import org.junit.Test;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sandy", "JX404A", 1000.00, "IT");
    }

    @Test
    public void canGetName(){
        assertEquals("Sandy", manager.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals("JX404A", manager.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptNumber(){
        assertEquals("IT", manager.getDeptName());
    }




}
