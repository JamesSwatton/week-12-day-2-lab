import java.util.ArrayList;
import java.util.Arrays;

public class Radio extends Component {

    private ArrayList<String> stations;

    public Radio(String make, String model){
        super(make, model);
        this.stations = new ArrayList<String>(
                Arrays.asList("Radio 1", "ClassicFM", "Radio 4")
        );
    }

    public int getNumOfStations(){
        return this.stations.size();
    }

    public String tune(int index){
       return this.stations.get(index);
    }
}
