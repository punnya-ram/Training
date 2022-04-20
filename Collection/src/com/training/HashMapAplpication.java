package com.training;
import java.util.*;

import com.training.model.Student;

public class HashMapAplpication {

	public static void main(String[] args){
//		HashMap<Integer,Student>map=new HashMap<>();
		HashMap<String,Student>map=new HashMap<>();


		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",68);
		Student mukesh=new Student(103,"mukesh",78);
		
		
		System.out.println(map.put("ENT",ram));
		System.out.println(map.put("ENT",shyam));//shyam
		//System.out.println(map.put(902,mukesh));
	//	System.out.println(map.get(902));
		//Student added =map.put(902,mukesh);// update shyam irukura edathula mukesh
		//if(added!=null) {
			//map.put(904,added);
		//}
		System.out.println(map.get("ENT"));
		//System.out.println(map.get(904));
	}

}

