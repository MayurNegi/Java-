package hashmaps;

import java.util.ArrayList;

public class Map<K,V> {

	ArrayList<MapNode<K,V>> buckets ;
	int count ;
	int numBuckets;
	
	public Map() {
		
		buckets = new ArrayList<>() ;
		numBuckets = 20;
		for(int i=0; i<numBuckets; i++)
		{
			buckets.add(null);
		}
	}
	
	public int size() {
		return count;
	}
	
	private int getBucketIndex(K key) {
		int hc = key.hashCode();
		int index = hc % numBuckets ;
		return index ;
	}
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		
		while(head != null) {
			if(head.key.equals(key)) {  // == use would compare its address
				return head.value ;
			}
			head = head.next ;
		}
		return null ;
	}
	
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		MapNode<K,V> prev = null ;
		while(head != null) {
			if(head.key.equals(key)) {  // == use would compare its address
				if(prev != null) {
					prev.next = head.next ;
				}
				else {
					buckets.set(bucketIndex, head.next) ;
				}
				count-- ;
				return head.value ;
			}
			prev = head ;
			head = head.next ;
		}	
		return null ;
	}
	
	private void rehash() {
		
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets = new ArrayList<>() ;
		for(int i=0; i < 2*numBuckets; i++) {
			buckets.add(null) ;
		}
		count = 0;
		numBuckets = 2 * numBuckets ;
		for(int i=0; i<temp.size(); i++)
		{
			MapNode<K,V> head = temp.get(i) ;
			while(head != null) 
			{
				K key = head.key ;
				V value = head.value ;
				insert(key,value) ;
				head = head.next ;
			}
		}
	}
	
	public double loadFactor() {
		return 1.0 * count / numBuckets ;
	}
	
	public void insert(K key, V value) {
		
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		// element is already present. just update its value
		while(head != null) {
			if(head.key.equals(key)) {  // == use would compare its address
				head.value = value ;
				return ;
			}
			head = head.next ;
		}
		// element is not there.add and update the head of new list
		head = buckets.get(bucketIndex) ;
		MapNode<K,V> newNode = new MapNode<>(key,value) ;
		newNode.next = head ;
		buckets.set(bucketIndex, newNode) ;
		count++ ;
		double loadFactor = (double)(count / numBuckets) ;
		if(loadFactor > 0.7) {
			rehash() ;
		}
	}
	
	
}
