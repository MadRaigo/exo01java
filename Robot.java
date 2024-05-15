abstract class Robot{
    private String roam;
    private String nom;
    private String sleep;
    public Robot (String nom, String sleep, String roam){
        this.nom=nom;
        this.sleep=sleep;
        this.roam=roam;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getSleep() {
        return sleep;
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    public String getRoam() {
        return roam;
    }
}