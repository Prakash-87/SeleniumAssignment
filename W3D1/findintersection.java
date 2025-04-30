package W3D1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findintersection 
{

	public static void main(String[] args) 
	{
	List<String> firstarray=new ArrayList<String>();
	firstarray.add("3");
	firstarray.add("2");
	firstarray.add("11");
	firstarray.add("4");
	firstarray.add("6");
	firstarray.add("7");
	System.out.println("First array:"+firstarray);
	List<String> secondarray=new ArrayList<String>();
	secondarray.add("1");
	secondarray.add("2");
	secondarray.add("8");
	secondarray.add("4");
	secondarray.add("9");
	secondarray.add("7");
	System.out.println("Second array:"+secondarray);
	secondarray.retainAll(firstarray);
	System.out.println("Common Values:"+secondarray);
	/*Collections.sort(secondarray);
	if(firstarray.contains(secondarray))
	{
	System.out.println(firstarray);	
	}
	else
	{
	System.out.println("Array List are not equal");	
	}*/
	}

}
