package hashmaps;

import java.util.* ;
import java.util.Map.Entry;

public class MaxOccurence {

	public static int maxFrequencyNumber(int[] arr){
	
        HashMap<Integer, Integer> map = new HashMap<>() ;   // <element , no. of occurences>
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
            else {
                int prev = map.get(arr[i]) ;
                map.put(arr[i], prev + 1) ;
            }
        }
        
        int maxOccurence = Integer.MIN_VALUE ;
        Set<Entry<Integer, Integer>> entrySet = map.entrySet() ;
        for(Entry<Integer,Integer> entry : entrySet) 
        {
            if(entry.getValue() > maxOccurence) {
                maxOccurence = entry.getValue() ; ;
            }
        }
		
        return maxOccurence ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
