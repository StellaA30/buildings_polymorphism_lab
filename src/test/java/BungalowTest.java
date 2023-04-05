import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow bungalow;

    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow("Bungalow", "20.04.2022", 2, true, true);
    }


    @Test
    public void calculateFiveWeeksDeposit(){
        bungalow.setRentPrice(900);
        double actual = bungalow.calculateDeposit();
        assertThat(actual).isEqualTo(1125);
    }

    @Test
    public void calculateCouncilTaxForBuildingType(){
        double actual = bungalow.calculateCouncilTax();
        assertThat(actual).isEqualTo(150);
    }

    @Test
    public void canAddExtensionToBungalow_true(){
        String expected = "extension needed in this Bungalow.";
        assertThat(bungalow.addExtension()).isEqualTo(expected);
    }

    @Test
    public void canAddExtensionToBungalow_false(){
        bungalow.setHasGarden(false);
        String expected = "Extension not needed";
        assertThat(bungalow.addExtension()).isEqualTo(expected);
    }

    @Test
    public void hasCentralHeating_true(){
        assertThat(bungalow.getHasCentralHeating()).isEqualTo(true);
    }

    @Test
    public void hasCentralHeating_false(){
        bungalow.setHasCentralHeating(false);
        assertThat(bungalow.getHasCentralHeating()).isEqualTo(false);
    }

    @Test
    public void checkPostCodeForBungalow(){
        assertThat(bungalow.postcodeForBuilding()).isEqualTo("This bungalows' postcode is SW15 4UB.");
    }






}
