package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    public List<Passenger> passengerList = new ArrayList<>();
    public boolean addPassanger(Passenger obj){
        if (obj.isX()) {
            passengerList.add(obj);
        }
        return false;
    }

    public void showList(){
        for(Passenger ob : passengerList){
            System.out.println(ob.toString());
        }
    }

}
