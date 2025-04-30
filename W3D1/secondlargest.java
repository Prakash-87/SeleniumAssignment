package W3D1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.ArrayIterator;

public class secondlargest {

	public static void main(String[] args) 
	{
		List<Integer> array=new ArrayList<Integer>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		Collections.sort(array);
		System.out.println("Array Values:"+array);
		int largest=array.get(0);
		int Secondlargest=array.get(0);
		for(int i=1;i<array.size();i++)
		{
		if(array.get(i)>largest)
		{
		Secondlargest=largest;
		largest=array.get(i);
		}
		}
		System.out.println(Secondlargest);
	}

}
