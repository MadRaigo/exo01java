public class Main {
    public static void main (String[] args){
        /*Feline lion = new Feline ("Lion", "beaucoup", "Sur son territoire", "très peu","De la viande");
        Feline tiger = new Feline("Tiger", "un peu", "Par ici","Silencieux","Viande rouge");*/
        Cat minou = new Cat("Minou", "tout le temps", "Chez lui", "Très bruyant","ce qu'il veut");
        Dog apollo = new Dog("Apollo", "quand il le souhaite","pas du tout","pour avoir des papouilles","normalement");
        Robodog beep = new Robodog("Michel","Never","When turned on","Mechanical noises","Electricity");
        /*System.out.println(lion.getNom()+" "+lion.getSleep()+" "+lion.getRoam()+" "+lion.getMakeNoise()+" "+lion.getEat());
        System.out.println(tiger);*/
        System.out.println(beep.getNom()
                +beep.getSleep()
                +beep.getEat()
                +beep.getRoam()
                );
        beep.beFriendly();
    }
}
