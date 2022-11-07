/**
 * In this part of the lab you will use your newfound debugging skills to fix this program that won't seem to run.
 * The class below, Person, is a class that contains a few common methods such as getters and setters and a couple of
 * others.
 *
 * At the bottom of this file, you will see another class called PersonMain. This class only has two methods: a main
 * method and a helper function (see the method itself for details). The main method does not contain any errors,
 * and its sole purpose is to be able to see if the program can run without issues.
 *
 * The only place that is exempt from bugs is the main method at the bottom of this file.
 * You might find bugs anywhere else in the code.
 */

// Change of the file format:
// I put PersonMain in another java file in order to test the class Person


public class Person {
    /**
     * Instance variables for objects of type "Person." Each Person will have a name and an age.
     */
    private String name;
    private int age;


    /**
     * Empty constructor. Creates a new Person object, but does not set the name or age of this person.
     */
    public Person() {}

    /**
     * Public constructor for the Person class. Called when creating a new Person object.
     * Takes in the person's name and age as a String and an integer, respectively, and
     * then creates an instance of that Person object.
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of this person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of this person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of this person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns true if the two people have the same name, false if they have different names.
     */
    public boolean hasSameName(Person person){
    	// In here, I change the code by using .equals() method
        if(person.getName().equals(this.getName())){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasSameAge(Person person){
        if(this.getAge() == person.getAge()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "[Name: " + this.name + ", Age: " + this.age + "]";
    }

}