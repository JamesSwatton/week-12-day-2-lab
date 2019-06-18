public class Mp3 extends Component implements IConnect {

    public Mp3(String make, String model){
        super(make,model);
    }
    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
