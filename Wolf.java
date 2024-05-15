public class Wolf extends Canine {
    private String makeNoise;
    private String eat;

    public Wolf(String nom, String sleep, String roam, String makeNoise, String eat) {
        super(nom,sleep,roam);
        this.makeNoise=makeNoise;
        this.eat=eat;
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