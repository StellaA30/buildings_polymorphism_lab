public abstract class Building {

    protected double rentPrice;
    protected int numberOfRooms;
    protected String type;
    protected String dateOfConstruction;

    public Building(String type, String dateOfConstruction, int numberOfRooms){
        this.type = type;
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfRooms = numberOfRooms;
        this.rentPrice = 0;

    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOfConstruction() {
        return dateOfConstruction;
    }

//    method to calculate 5 weeks deposit, assumes rentPrice is equivalent to 4 weeks of rent
    public double calculateDeposit() {
        return this.rentPrice * 1.25;
    }
// assumes buildings are located in the same council and council tax is fixed and depends on building type
    public double calculateCouncilTax() {
        if(this.type == "Bungalow"){
            return 150;
//        } else if(this.type == "StudentFlat"){
//            // students are exempt from paying council tax
//            return 0;
        } else if(this.type == "Office"){
            return 100;
        }
        return 0;
    }

    // abstract method
    public abstract String postcodeForBuilding();
}
