package com.training.service;

public class Application {

	public static void main(String[] args) {
		
		StringService service=new StringService();
		String city ="CHENNAI";
		System.out.println(String.format("%s",city));
		String city ="CHENNAI";
		System.out.println(String.format("%s",city));
		System.out.println(String.format("%3$.4f %2$.3f %1$.2f" args));
		int key=14;
		
		switch(key) {
		case 1:
			service.stringEquals("ram","ram");
			break;
		case 2:
			service.stringObectEquals();
			break;
		case 3:
			service.usingTrim("  ramesh  ");
			break;
		case 4:
			service.lengthofString("   ramesh  ");
			break;
		case 5:
			service.usingSubString("ramesh");
			break;
		case 6:
			service.usingCharAtIndexOf("ram@abc.com");
			break;
		case 7:
			service.usingReplace("ram@abc.com","Welcometo chennai");
			break;
		case 8:
			service.usingConcat("hello","chennai");
			break;
		case 9:
			service.usingCompareTo("c","d");
			break;
		case 10:
			service.usingStringFormat("ram",45.292);
			break;
		case 11:
			service.usingStringFormat(16);
			break;
		case 12:
			service.usingStringFormat(16,16);
			break;
		case 13:
			service.usingStringFormat("ram","ram");
			break;
		case 14:
			service.usingStringFormat(-423L);
			break;
		default:
			break;
			
		}

	}

}
