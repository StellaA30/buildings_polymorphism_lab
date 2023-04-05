import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EstateAgentTest {

    EstateAgent estateAgent;

    @BeforeEach
    public void setUp(){
        estateAgent = new EstateAgent();
    }

    @Test
    public void estateAgencyStartsWithNoListing(){
        assertThat(estateAgent.countListings()).isEqualTo(0);
    }

    @Test
    public void canAddNewBuilding(){
        Building bungalow = new Bungalow("Bungalow", "20.04.2022", 2, true, true);
        Building studentFlat = new StudentFlat("StudentFlat", "15.09.2000", 3, true);
        Building office = new Office("Office", "15.01.1999", 5, "BNTA", true);

        estateAgent.addBuilding(bungalow);
        estateAgent.addBuilding(studentFlat);
        estateAgent.addBuilding(office);
        assertThat(estateAgent.countListings()).isEqualTo(3);
    }



}
