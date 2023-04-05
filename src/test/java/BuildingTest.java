import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingTest {
    Building building;

    @BeforeEach
    public void setUp(){
        building = new Bungalow("Bungalow", "30.05.1997", 4, true, true);
    }


//    testing getters and setters
    @Test
    public void hasRentPrice(){
        assertThat(building.getRentPrice()).isEqualTo(0);
    }

    @Test
    public void canSetRentPrice(){
        building.setRentPrice(900);
        assertThat(building.getRentPrice()).isEqualTo(900);
    }

    @Test
    public void hasBuildingType(){
        assertThat(building.getType()).isEqualTo("Bungalow");
    }

    @Test
    public void canSetBuildingType(){
        building.setType("Office");
        assertThat(building.getType()).isEqualTo("Office");
    }

    @Test
    public void hasRooms(){
        assertThat(building.getNumberOfRooms()).isEqualTo(4);
    }

    @Test
    public void hasDateOfConstruction(){
        assertThat(building.getDateOfConstruction()).isEqualTo("30.05.1997");
    }

    @Test
    public void calculateFiveWeeksDeposit(){
        building.setRentPrice(900);
        double actual = building.calculateDeposit();
        assertThat(actual).isEqualTo(1125);
    }

    @Test
    public void calculateCouncilTaxForBuildingType(){
        double actual = building.calculateCouncilTax();
        assertThat(actual).isEqualTo(150);

    }






}
