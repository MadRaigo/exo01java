abstract class Canine extends Animal {
    private String roam;

    public Canine (String nom, String sleep, String roam){
        super (nom,sleep);
        this.roam=roam;
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    public String getRoam() {
        return roam;
    }
}
