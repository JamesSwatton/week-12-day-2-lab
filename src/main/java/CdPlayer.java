import java.util.ArrayList;

public class CdPlayer extends Component {

    private ArrayList<String> cds;

    public CdPlayer(String make, String model) {
        super(make, model);
        this.cds = new ArrayList<String>();
    }

    public void insertCd(String cdTitle){
        if(getNumOfCds() < 3){
            this.cds.add(cdTitle);
        }
    }

    public int getNumOfCds(){
        return this.cds.size();
    }

    public String selectCd(int index) {
        return this.cds.get(index);
    }

    public String play() {
        if(this.getNumOfCds()!=0){
            return "Under pressure!";
        }else{
            return "Insert disc";
        }
    }
}
