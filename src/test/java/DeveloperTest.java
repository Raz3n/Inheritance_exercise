import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

    public class DeveloperTest {

        Developer developer;

        @Before
        public void before() {
            developer = new Developer("Sandy", "JX404A", 1000.00);
        }

        @Test
        public void canGetName() {
            assertEquals("Sandy", developer.getName());
        }

        @Test
        public void canGetNationalInsuranceNumber() {
            assertEquals("JX404A", developer.getNationalInsuranceNumber());
        }

        @Test
        public void canGetSalary() {
            assertEquals(1000.00, developer.getSalary(), 0.01);
        }

        @Test
        public void canRaiseSalary() {
            developer.raiseSalary(2.00);
            assertEquals(1002, developer.getSalary(), 0.01);
        }

        @Test
        public void canGetPayBonus() {
            developer.payBonus();
            assertEquals(10, developer.payBonus(), 0.01);
        }
}
