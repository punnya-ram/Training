package com.training;
import java.util.*;
import java.util.stream.*;
import com.training.model.*;
import static java.util.stream.Collectors.*;

public class UsingStreams {

	public static void useDistinct(List<Book> bookList){
		bookList.stream().distinct().forEach(System.out::println);
	}
	
	public static void collectToSet(List<Book>bookList) {
		Set<Book> bookSet=bookList.stream().filter(e->e.getPrice()>500).distinct().collect(toSet());
		bookSet.forEach(System.out::println);
	}
	public static void collectToMap(List<Book>booklist) {
		Set<Book>bookSet=booklist.stream().collect(toSet());
		Map<String,Double> values=booklist.stream().filter(e->e.getPrice()>500).
				collect(toMap(Book::getBookName,Book::getPrice));
		values.forEach((key,value) -> System.out.println(key+","+value));
	}
	public static void findMaxPrice(List<Book>booklist) {
		Optional<Book> optional=booklist.stream().max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("mAXIMUM PRICE:="+optional.get().getPrice());
		}
	}
		public static void findMinPrice(List<Book>booklist) {
			Optional<Book> optional1=booklist.stream().min(Comparator.comparing(Book::getPrice));
			if(optional1.isPresent()) {
				System.out.println("min PRICE:="+optional1.get().getPrice());
			}
		}
		public static void countLetters(List<Book>booklist) {
			long countResult=booklist.stream().filter( e->e.getBookName().contains("v")).count();	
			System.out.println("count v:"+countResult);
		}
		public static void countLetters1(List<Book>booklist,String srString) {
			long countResult1=booklist.stream().filter(e->e.getBookName().equalsIgnoreCase(srString)).count();
			System.out.println("count v:"+countResult1);
		}
	
		
public static void main(String[] args) {
	Book java = new Book(101,"Java","suba",450);
	Book spring = new Book(102,"Spring","Mad",650);
	Book maven = new Book(103,"maven","HArish",450);
	Book html= new Book(104,"Html","Priya",450);
	Book python = new Book(105,"Python","Sathya",450);
	Book mavenNew = new Book(103,"maven","HArish",450);
	Book htmlnew = new Book(104,"Html","Priya",1450);
	List<Book> booklist=Arrays.asList(java,spring,maven,html,python,mavenNew,htmlnew);
	//useDistinct(booklist);
	int key=6;
	switch(key) {
	case 1:
		useDistinct(booklist);
		break;
	case 2:
		useDistinct(booklist);
		break;
	case 3:
		collectToMap(booklist);
		break;
	case 4:
		findMaxPrice(booklist);
		break;
	case 5:
		findMinPrice(booklist);
		break;
	case 6:
		countLetters(booklist);
		break;
	case 7:
		countLetters1(booklist, "p");
		break;
		
		default:
		break;
		
		
		
	}
	
	
	

	
}
}
