import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {
    StudentFlat studentFlat;

    @BeforeEach
    public void setUp() {
        studentFlat = new StudentFlat("StudentFlat", "15.09.2000", 3, true);

    }

    @Test
    public void calculateFiveWeeksDeposit() {
        studentFlat.setRentPrice(600);
        double actual = studentFlat.calculateDeposit();
        assertThat(actual).isEqualTo(750);
    }

    @Test
    public void checkingIfStudentsHaveCouncilTaxExemption_true() {
        double actual = studentFlat.calculateCouncilTax();
        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void checkingIfStudentsHaveCouncilTaxExemption_false() {
        studentFlat.setType("Bungalow");
        double actual = studentFlat.calculateCouncilTax();
        assertThat(actual).isEqualTo(150);
    }

    @Test
    public void canCalculateInsuranceForEachStudent(){
        double actual = studentFlat.calculateInsurance(60);
        assertThat(actual).isEqualTo(20);
    }

    @Test
    public void checkPostCodeForStudentFlat(){
        assertThat(studentFlat.postcodeForBuilding()).isEqualTo("This building's postcode is SW16 3AP.");
    }






}





