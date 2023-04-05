public class Bungalow extends Building{
    private boolean hasCentralHeating;
    private  boolean hasGarden;

    public Bungalow(String type, String dateOfConstruction, int numberOfRooms, boolean hasCentralHeating, boolean hasGarden){
        super(type, dateOfConstruction, numberOfRooms);
        this.hasCentralHeating = hasCentralHeating;
        this.hasGarden = hasGarden;
    }

    public String addExtension(){
        if(this.hasGarden == true){
            return String.format("extension needed in this %s.", this.type);
        }
        return "Extension not needed";
    }

    //abstract method
    public String postcodeForBuilding(){
        return "This bungalows' postcode is SW15 4UB.";
    };

    public boolean getHasCentralHeating() {
        return hasCentralHeating;
    }

    public void setHasCentralHeating(boolean hasCentralHeating) {
        this.hasCentralHeating = hasCentralHeating;
    }

    public boolean getHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

}
