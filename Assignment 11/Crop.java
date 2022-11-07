public class Crop implements Item, Comparable<Crop>{
    private String name;
    private boolean isHealthy;
    private int age;
    private int bushels;

    public Crop(String name, boolean isHealthy, int age, int bushels){
        this.name = name;
        this.isHealthy = isHealthy;
        this.age = age;
        this.bushels = bushels;
    }

    //from Comparable interface
    public int compareTo(Crop crop) {
      return bushels - crop.getBushels();
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

    //from Item interface
    public int getPrice(){
        return bushels*5;
    }

    public int getBushels(){
        return bushels;
    }
    
    public void setBushels(int bushels){
        this.bushels = bushels;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Bushels: "+bushels+" Healthy: "+isHealthy;
    }

}
