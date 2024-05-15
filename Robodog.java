import src.Pet;

public class Robodog extends Robot implements Pet {
    private String makeNoise;
    private String eat;

    public Robodog(String nom, String sleep, String roam, String makeNoise, String eat) {
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

    @Override
    public void beFriendly() {
        System.out.println("Zap");
    }

    @Override
    public void play() {
        System.out.println("Bip boup");
    }
}
