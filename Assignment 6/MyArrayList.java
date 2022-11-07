public class MyArrayList {
	private int size = 4;
    private int[] data;
    
    /* MyArrayList constructor */
    public MyArrayList(){
    	data = new int[4];
    	size = 0;
    }
    
    /* MyArrayList constructor*/
    public MyArrayList(int[] arr){
    	data = arr;
    	size = arr.length;
    }
    
    /* Add integer to MyArrayList */
    public void add(int n){
    	int[] temp = new int[size + 1];
    	for(int i = 0; i < data.length; i++) {
    		temp[i] = data[i];
    	}
    	temp[data.length] = n;
    	data = temp;
    	size = temp.length;
    }
    
    /* Remove integer from MyArrayList */
    public boolean remove(int n){
    	if(size == 0) return false;
    	int[] temp = new int[size - 1];
    	int index = -1;
    	for(int i = 0; i < data.length; i++) {
    		if(data[i] == n) {
    			index = i;
    		}
    	}
    	if(index == -1) return false;
    	else {
    		int pos = 0;
    		for(int i = 0; i < data.length; i++) {
    			if(i == index) continue;
    			else {
    				temp[pos++] = data[i];
    			}
    		}
    	}
    	data = temp;
    	size = temp.length;
    	return true;
    }
    
    /* Display all the elements in MyArrayList */
    public String toString(){
    	String str = "";
    	for(int i = 0; i < data.length; i++) {
    		str += String.valueOf(data[i]);
    		str += " ";
    	}
    	return str;
    }
    
    /* Get the size of MyArrayList*/
    public int getSize(){
    	return size;
    }
    
    /* Check if MyArrayList is empty */
    public boolean isEmpty(){
    	return size == 0;
    }
    
    /* Get the index of an element in MyArrayList. If not exist, return -1 */
    public int indexOf(int n){
    	for(int i = 0; i < data.length; i++) {
    		if(n == data[i])
    			return i;
    	}
    	return -1;
    }
    
    /* Get the current array of MyArrayList */
    public int[] getMyArrayList() {
    	return data;
    }
}