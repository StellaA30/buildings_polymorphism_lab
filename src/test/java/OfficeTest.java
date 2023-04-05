import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office officeBuilding;

    @BeforeEach
    public void setUp(){
        officeBuilding = new Office("Office", "15.01.1999", 5, "BNTA", true);
    }

    @Test
    public void calculateFiveWeeksDeposit() {
        officeBuilding.setRentPrice(600);
        double actual = officeBuilding.calculateDeposit();
        assertThat(actual).isEqualTo(750);
    }

    @Test
    public void calculateDepositForOffice() {
        double actual = officeBuilding.calculateCouncilTax();
        assertThat(actual).isEqualTo(100);
    }

    @Test
    public void hasCompanyName(){
        assertThat(officeBuilding.getCompanyName()).isEqualTo("BNTA");}

    @Test
    public void hasEmployees(){
       assertThat(officeBuilding.getNoOfEmployees()).isEqualTo(1);
    }

    @Test
    public void canAddNewEmployees(){
        officeBuilding.addNewEmployees(3);
        assertThat(officeBuilding.getNoOfEmployees()).isEqualTo(4);
    }

    @Test
    public void testFireAlarmOnThursday_true(){
        boolean testAlarm = officeBuilding.testFireAlarm("Thursday");
        assertThat(testAlarm).isEqualTo(true);
    }

    @Test
    public void teatFireAlarmOnThursday_false(){
        boolean testAlarm = officeBuilding.testFireAlarm("Wednesday");
        assertThat(testAlarm).isEqualTo(false);
    }

    @Test
    public void checkPostCodeForOfficeBuilding(){
        assertThat(officeBuilding.postcodeForBuilding()).isEqualTo("This building's postcode is SW16 4DH.");
    }


//    testing method overload
    @Test
    public void canTestFireAlarm(){
        assertThat(officeBuilding.testFireAlarm()).isEqualTo(true);
    }


}
