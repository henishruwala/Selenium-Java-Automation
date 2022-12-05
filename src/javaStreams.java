import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.handler.codec.spdy.SpdyHttpHeaders.Names;

public class javaStreams 
{
	//@Test
	public void regular() 
	{
		//Count the number of names which starting with the alphabet A
	ArrayList<String> names= new ArrayList<String>();
	names.add("Henish");
	names.add("Ruwala");
	names.add("Rakeshbhai");
	names.add("Regression");
	int count=0;
	
	for(int i=0; i<names.size(); i++) 
	{
		String actual= names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}
	System.out.println(count++);
	}
	
	//@Test
	public void streamFilters()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alex");
		names.add("Parker");
		names.add("Adam");
		//there is no life for intermediate operation without terminal operation.
		//Terminal operation will execute only if the intermediate operation (filter) return true.
		Long c= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d= Stream.of("Abhjeet","Don","Alex","Parker","Aadam").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		//Print all the name of the Array lists.
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
	}
	
	@Test
	public void StreamMap()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Henish");
		names.add("Ruwala");
		names.add("Rakeshbhai");
		names.add("Regression");
		
		//print name which have last letter as A and Upper case
		Stream.of("Abhjeet","Don","Alekhya","Rama","Aadam").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print name which have last letter as A and Upper case and also do a sorted
		List<String> names1= Arrays.asList("Azbhjeet","Don","Alekhya","Rama","Aadam");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//merging 2 different list
		Stream<String>newStream =Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Aadam"));
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect() 
	{
		List<String> ls= Stream.of("Abhjeet","Don","Alekhya","Rama","Aadam").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		//Assignment
		List<Integer> values= Arrays.asList(2,8,2,7,9,0,9,1,5);
		//Print the unique Numbers 
		//Print by the sorted- 0,1,2,5,7,8,9
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
