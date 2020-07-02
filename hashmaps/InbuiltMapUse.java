package hashmaps;

import java.util.HashMap ;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>() ;
		
		// insert
		map.put("abc" , 1);
		map.put("def", 3);
		
		// size
		System.out.println(map.size());
		map.put("abc", 4) ; // this will not create another map because its already present
							//	it will just change value for that key
		// contain key
		if(map.containsKey("abc")) {
			System.out.println("map has abc");
		}
		
		// get value 
		int v = map.get("abc");
		System.out.println(v);
		
		if(map.containsKey("abcderf")) {
		int v1 = map.get("abcderf") ;
		System.out.println(v1);  // this will give null pointer exception so wi will check if its present in the hasmap or not
		}	
		// map.remove("def") ;  // for removal
	
		// iterate
		Set<String> keys = map.keySet() ;
		for(String s:keys) 
		{
			System.out.println(s);
		}
		
		map.containsValue(4) ; // search for values
 		
		
		
	}

}
