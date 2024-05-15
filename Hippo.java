public class Hippo extends Animal{
    private String roam;
    private String makeNoise;
    private String eat;


    public Hippo(String nom, String sleep, String roam, String makeNoise, String eat) {
        super(nom,sleep);
        this.roam=roam;
        this.makeNoise=makeNoise;
        this.eat=eat;
    }

    public String getNom(){
        return super.getNom();
    }
    public String getSleep(){
        return super.getSleep();
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    public String getRoam() {
        return roam;
    }



    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
    }

    public String getMakeNoise() {
        return makeNoise;
    }
}
