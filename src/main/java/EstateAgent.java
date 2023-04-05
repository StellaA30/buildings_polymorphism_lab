import java.util.ArrayList;

public class EstateAgent {
    private ArrayList<Building> buildings;

    public EstateAgent(){
        this.buildings = new ArrayList<>();
    }

    public int countListings() {
        return this.buildings.size();
    }

    public void addBuilding(Building listing) {
        this.buildings.add(listing);

    }

//    commissions is fixed - 5% for each building
//    calculate commissions for current listings

    public double calculateCommission(){
        double profit = 0;
        for(Building building: this.buildings){
            profit += building.getRentPrice()*0.05;
        }
        return profit;
    }

}
