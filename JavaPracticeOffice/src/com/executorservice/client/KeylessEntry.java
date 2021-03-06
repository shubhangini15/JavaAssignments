package com.executorservice.client;

import java.util.Map;
import java.util.HashMap;

public class KeylessEntry {
	static class Key { 
		Integer id; 
		Key(Integer id) { 
			this.id = id; 
		} 
		@Override 
		public int hashCode() { 
			return id.hashCode(); 
		} 
	} 
	public static void main(String[] args) { 
		Map m = new HashMap(); 
		while (true) 
			for (int i = 0; i < 10000; i++) 
				if (!m.containsKey(i)) 
					m.put(new Key(i), "Number:" + i); 
	} 

}
