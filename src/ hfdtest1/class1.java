package hfdtest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class class1 {
public static void main(String[] args) {
	int [] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
	Map< Integer, Integer> map = new HashMap<>();
	
	/**
	测试提交远程
	*/
	for (int i : arr) {
		Integer num = map.get(i);
		//System.out.println(num);
		map.put(i, num == null? 1:num+1);
	}
	Set<Entry<Integer,Integer>> entrySet = map.entrySet();
	Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
	while(iterator.hasNext()) {
		Entry<Integer, Integer> next = iterator.next();
		Integer key = next.getKey();
		Integer value = next.getValue();
		System.out.println(key+"出现了"+value+"次");
	}
	
	/*for (int i = 0; i < arr.length; i++) {
		int x = arr[i];
		if(arr[i]==arr[i+1]) {
			
		}
		System.out.println(x);
		
	}*/
	/*System.out.println(Arrays.toString(arr));*/
	
}
}
