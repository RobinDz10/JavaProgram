import java.util.ArrayList;

public class Farm {

    /*
    Method inventory takes in an ArrayList of generic type. Method returns a string representing a
    listing of the toString outputs of all objects in the ArrayList (exact String format up to you).
    */
    public static <E> String inventory(ArrayList<E> itemList){	
    	String str = "";
    	for(E item : itemList) {
    		str += item.toString();
    		str += "\t";
    	}
    	return str;
    }

    /*
    Method list takes in an ArrayList of generic objects that extend the Animal interface.
    Method returns a string of each object's animal sound compiled into a single String.
     */
    public static <E extends Animal> String listen(ArrayList<E> animalList){  	
    	String str = "";
    	for(E animal : animalList) {
    		str += (animal.animalSound());
    		str += "\t";
    	}
    	return str;
    }

    /*
    Method isSellable takes in an object that extends the Item interface.
    Return value is true if the object is sellable and false if not.
    In order for an object to be sellable, it must be healthy AND meet the following age requirements:

    Cow: must be older than age 2
    Chicken: must be older than age 1
    Crop: must be older than age 3

    If the object is not an instance of one of those three classes, the method will return false.
    Please note that this method will require you to cast the generic object into one of the
    three classes. In order to do so, you must first check if the object is an instance of the class
    you want to cast it to. You can do so using the instanceof operator.
     */
    public static <E extends Item> boolean isSellable(E item){
    	if(item instanceof Crop) {
    		if(((Crop)item).isHealthy() && ((Crop)item).getAge() > 3) {
    			return true;
    		}
    	}
    	else if(item instanceof Cow) {
    		if(((Cow)item).isHealthy() && ((Cow)item).getAge() > 2) {
    			return true;
    		}
    	}
    	else if(item instanceof Chicken) {
    		if(((Chicken)item).isHealthy() && ((Chicken)item).getAge() > 1) {
    			return true;
    		}
    	}
    	else
    		return false;
    	return false;
    }

    /*
    Method sell takes in an ArrayList of generic object type that extends the Item interface.
    For each item in the ArrayList, determine if the item is sellable.
    If so, get the price of the object and add it to a total sum.
    Return the total sum after iterating through each item.
     */
    public static <E extends Item> int sell(ArrayList<E> sellList){
    	int sum = 0;
    	for(E i : sellList) {
    		if(isSellable(i)) {
    			sum += i.getPrice();
    		}
    	}
    	return sum;
    }

    /*
    Method takes in an ArrayList of generic object type that extends the Comparable interface.
    Using the compareTo method, return the index of the most valuable object in the ArrayList.
     */
    public static <E extends Comparable<E>> int getMostValuable(ArrayList<E> comparableList){
    	int pos = 0;
    	if(comparableList.size() == 1)
    		return 0;
    	for(int i = 0; i < comparableList.size() - 1; i++) {
    		if(((E)comparableList.get(i)).compareTo((E)comparableList.get(i + 1)) < 0) {
    			pos = i + 1;
    		}
    	}
    	return pos;
    }
  
}
