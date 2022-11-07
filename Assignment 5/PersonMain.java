import java.util.Random;
import java.util.Scanner;

class PersonMain {

    /**
     * This method should generate and return an array (of size sizeOfArray) of people in which each person's name is
     *  generated randomly.
     *
     * There are 5 names that a person could have: "Gloria", "Alberto", "Clint", "Marie",
     *  or "Dr. Phil" (The fifth name can be anything that you want it to be, but Dr. Phil is a good fifth name).
     *
     * After generating the name of each person, the method will then give them an age (from 1 to 90) based on another
     *  randomly-generated integer.
     */
    public static Person[] makeListOfPeople(int sizeOfArray){
        Person[] myPeople = new Person[sizeOfArray];

        Random r = new Random();

        // Change i<=sizeOfArray to i<sizeOfArray
        for(int i=0; i<sizeOfArray;i++){
            Person newPerson = new Person();
            int rand = r.nextInt(5);	

            if(rand == 0){
                newPerson.setName("Gloria");
            } 
            else if(rand == 1){
                newPerson.setName("Alberto");
            } 
            else if(rand == 2){
                newPerson.setName("Clint");
            } 
            else if(rand == 3){
                newPerson.setName("Marie");
            } 
            // Add extra condition: newPerson.setName("Dr. Phil");
            else{
                newPerson.setName("Dr. Phil");
            }

            int age = r.nextInt(90) + 1;	

            newPerson.setAge(age);

            myPeople[i] = newPerson;	// Change "rand" to "i"
        }
        return myPeople;
    }




    /*
     TODO IMPORTANT NOTE: THERE ARE NO BUGS IN THE MAIN METHOD.
    */


    /**
     * This is the method that you will actually run to test if your code is working correctly.
     * As long as you can reach the end of this method without producing any exceptions, your code works correctly.
     *
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What size of array do you want to generate?");
        int size = s.nextInt();

        Person[] myList = makeListOfPeople(size);

        System.out.println("Printing list of people:");

        for (int i = 0; i < myList.length; i++) {
            System.out.println("Person #" + (i + 1) + ": " + myList[i].toString());
        }

        System.out.println();

        System.out.println("Now we must select a CHOSEN ONE. Who shall it be? (Enter the person's number)");
        System.out.println("Don't ask what happens to the CHOSEN ONE.");

        int whoToRemove = s.nextInt() - 1;

        Person chosenOne = new Person();

        if(whoToRemove >= 0 && whoToRemove < size){
            chosenOne = myList[whoToRemove];
        } else {
            boolean fourthWallBroken = false;
            int counter = 0;
            while (whoToRemove < 0 || whoToRemove >= size) {
                if (counter == 3) {
                    fourthWallBroken = true;
                    System.out.println("Now you are the CHOSEN ONE. What is your name?");
                    String name = s.next();
                    System.out.println("Very good. And your age?");
                    int age = s.nextInt();
                    chosenOne = new Person(name, age);
                } else if (counter == 2) {
                    System.out.println("You are JUnit testing my patience. This is your last chance. Who shall it be?");
                } else {
                    System.out.println("Invalid choice. There must be a CHOSEN ONE. Try again.");
                    whoToRemove = s.nextInt() - 1;
                }
                counter++;
            }
            if(!fourthWallBroken){chosenOne = myList[whoToRemove];}
        }

        System.out.println("Behold, THE CHOSEN ONE!!");
        System.out.println(chosenOne.toString());

        Person inputPerson = new Person();
        System.out.println("Now, for your final test: What is the CHOSEN ONE's name?");
        inputPerson.setName(s.next());

        if(chosenOne.hasSameName(inputPerson)){
            System.out.println("Correct...");
        } else {
            System.out.println("You have failed the test. You are certainly not the CHOSEN ONE.");
            return;
        }

        System.out.println("And their age?");
        inputPerson.setAge(s.nextInt());
        if(chosenOne.hasSameAge(inputPerson)){
            System.out.println("You have passed the test...");
        } else {
            System.out.println("You have failed the test. You are certainly not the CHOSEN ONE.");
        }
    }
}