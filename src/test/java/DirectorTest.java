import org.junit.Before;
import org.junit.Test;
import staff.managment.Director;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Sandy", "JX404A", 1000.00, 2000.00, "Management" );
    }

    @Test
    public void canGetName(){
        assertEquals("Sandy", director.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals("JX404A", director.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptNumber(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2.00);
        assertEquals(1002, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(2000, director.getBudget(), 0.01);
    }

    @Test
    public void canHaveLoadsOfMoney(){
        director.payBonus();
        assertEquals(20, director.payBonus(), 0.01);
    }


}
