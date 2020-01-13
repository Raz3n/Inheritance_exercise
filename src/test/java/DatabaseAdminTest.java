import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Sandy", "JX404A", 1000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Sandy", databaseAdmin.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber() {
        assertEquals("JX404A", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2.00);
        assertEquals(1002, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(10, databaseAdmin.payBonus(), 0.01);
    }
}
