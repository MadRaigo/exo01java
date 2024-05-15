abstract class Animal {
    private String picture;
    private String food;
    private String hunger;
    private String boundaries;
    private String location;
    private String nom;
    private String sleep;
    public Animal(){}

    public Animal (String nom, String sleep){
        this.nom = nom;
        this.sleep = sleep;
    }
    public Animal setNom(String nom){
        this.nom = nom;
        return this;
    }
    public String getNom(){
        return this.nom;
    }
    public Animal setSleep (String sleep){
        this.sleep=sleep;
        return this;
    }

    public String getSleep() {
        return this.sleep;
    }
    /*public Animal (String nom, String picture, String food, String hunger, String boundaries, String location){
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }*/

    /*public Animal setPicture(String picture){
        this.picture = picture;
        return this;
    }
    public Animal setFood(String food){
        this.food = food;
        return this;
    }
    public Animal setHunger(String hunger){
        this.hunger = hunger;
        return this;
    }
    public Animal setBoundaries(String boundaries){
        this.boundaries = boundaries;
        return this;
    }
    public Animal setLocation(String location){
        this.location = location;
        return this;
    }*/
}
