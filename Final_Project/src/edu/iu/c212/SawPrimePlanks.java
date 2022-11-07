package edu.iu.c212;

import java.util.ArrayList;
import java.util.List;

public class SawPrimePlanks {

    public List<Integer> getPlankLengths(int longPlankLength){
        List<Integer> result = new ArrayList<>();
        if(longPlankLength <= 2){
            result.add(longPlankLength);
            return result;
        }
        else{ 
        	sawPlank(longPlankLength, 2, result);
        }
        return result;
    }

    public void sawPlank(int plankLength,int count,List<Integer> result){
        while(count < plankLength && plankLength % count != 0){
            count++;
        }
        if(count < plankLength){
            result.add(count);
            sawPlank(plankLength / count, 2, result);
        }
        else{
            result.add(count);
        }
    }

}
