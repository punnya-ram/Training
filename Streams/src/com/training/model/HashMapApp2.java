package com.training.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp2 {

	public static void main(String[] args) {
		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",68);
		Student mukesh=new Student(103,"mukesh",78);
		HashMap<Integer,Student>map=new HashMap<>();
		
		map.put(900,ram);
		map.put(902,shyam);
		map.put(904, mukesh);
		
		System.out.println(map.get(900));
		System.out.println(map.get(902));
		System.out.println(map.get(904));
		
		System.out.println("only key value");
		Set<Integer>keys=map.keySet();
		System.out.println(keys);
		for(Integer key:keys) {
			System.out.println(map.get(key));
		}
		Collection<Student>list=map.values();
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
		}
		System.out.println("Both key and value");
		Set<Map.Entry<Integer, Student>> list2=map.entrySet();//map.entry is a interface
			for(Map.Entry<Integer,Student>eachEntry:list2) {
				System.out.println(eachEntry.getKey());
				System.out.println(eachEntry.getKey());
		}

		
	}

}
