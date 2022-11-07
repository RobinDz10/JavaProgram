public class Chicken implements Item, Animal, Comparable<Chicken>{
    private String name;
    private boolean isHealthy;
    private int age;
    private int eggs;

    public Chicken(String name, boolean isHealthy, int age, int eggs){
        this.name = name;
        this.isHealthy = isHealthy;
        this.age = age;
        this.eggs = eggs;
    }
    //from Comparable interface
    public int compareTo(Chicken chicken){
        return eggs - chicken.getEggs();
    }

    //from Animal interface
    public String animalSound(){
        return "Cluck";
    }

    public String getName(){
        return name;
    }

    //from Item interface
    public boolean isHealthy(){
        return isHealthy;
    }

    public void setIsHealthy(boolean isHealthy){
        this.isHealthy = isHealthy;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getEggs() {return eggs; }

    public void setEggs(int eggs) {this.eggs = eggs;}

    //from Item interface
    public int getPrice(){
        return eggs*2;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Eggs: "+eggs+" Healthy: "+isHealthy;
    }

}
