public class Cow implements Item, Animal, Comparable<Cow>{

    private String name;
    private boolean isHealthy;
    private int age;
    private int weight;

    public Cow(String name, boolean isHealthy, int age, int weight){
        this.name = name;
        this.isHealthy = isHealthy;
        this.age = age;
        this.weight = weight;
    }
    //from Comparable interface
    public int compareTo(Cow cow){
        return weight - cow.getWeight();
    }

    //from Animal interface
    public String animalSound(){
        return "Mooooo";
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

    public void setWeight(int weight) {this.weight = weight;}

    public int getWeight() {return weight;}

    //from Item interface
    public int getPrice(){
        return weight*4;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Weight: "+weight+" Healthy: "+isHealthy;
    }


}
