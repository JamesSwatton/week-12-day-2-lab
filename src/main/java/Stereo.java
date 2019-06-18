public class Stereo {

    private String name;
    private Radio radio;
    private CdPlayer cdPlayer;

    public Stereo(String name, Radio radio, CdPlayer cdPlayer){
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
    }

    public String getName() {
        return this.name;
    }

//    RADIO METHODS
    public int getNumOfStations(){
        return this.radio.getNumOfStations();
    }

    public String tune(int index){
        return this.radio.tune(index);
    }

//    CD PLAYER METHODS
    public CdPlayer getCdPlayer(){
        return this.cdPlayer;
    }

}
