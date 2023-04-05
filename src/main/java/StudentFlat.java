public class StudentFlat extends Building{

    private boolean hasLift;
    private long numberOfPartiesHosted;

    public StudentFlat(String type, String dateOfConstruction, int numberOfRooms, boolean hasLift){
        super(type, dateOfConstruction, numberOfRooms);
        this.hasLift = hasLift;
        this.numberOfRooms = numberOfRooms;
    }

    public long getNumberOfPartiesHosted() {
        return numberOfPartiesHosted;
    }

    public void setNumberOfPartiesHosted(long numberOfPartiesHosted) {
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    public boolean getHasLift() {
        return hasLift;
    }

    //  calculate insurance for each student that rents a room
    // insurance amount is for each flat
    //  number of students is equivalent to number of rooms, so 2 students living in 2 bedrooms flat will divide the insurance cost
    public double calculateInsurance(double amount) {
        return (amount / this.numberOfRooms);

    }

    //abstract method
    public String postcodeForBuilding(){
        return "This building's postcode is SW16 3AP.";
    };
}
