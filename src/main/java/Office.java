public class Office extends Building{

    private String companyName;
    private int noOfEmployees;
    private boolean hasFireExit;

    public Office(String type, String dateOfConstruction, int numberOfRooms, String companyName, boolean hasFireExit){
        super(type, dateOfConstruction, numberOfRooms);
        this.companyName = companyName;
        this.hasFireExit = hasFireExit;
        this.noOfEmployees = 1;  //set as 1 for the owner
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public boolean getHasFireExit() {
        return hasFireExit;
    }


    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }


    public void setHasFireExit(boolean hasFireExit) {
        this.hasFireExit = hasFireExit;
    }

    //abstract method
    public String postcodeForBuilding(){
        return "This building's postcode is SW16 4DH.";
    };

    // method to add to new employees
    public void addNewEmployees(int newEmployee){
        this.noOfEmployees += newEmployee;
    }


    //test fire alarm method - fire alarms are tested on thursdays

    public boolean testFireAlarm(String dayOfWeek){
        if(dayOfWeek != "Thursday"){
            return false;
        }
        return true;
    }

    // method overload -- a method that returns true for testing fire alarm!
    public boolean testFireAlarm(){
        return true;
    }


}
