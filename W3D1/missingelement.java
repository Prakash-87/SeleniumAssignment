package W3D1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingelement {

	public static void main(String[] args) 
	{
		List<Integer> missingele=new ArrayList<Integer>();
		missingele.add(1);
		missingele.add(2);
		missingele.add(3);
		missingele.add(4);
		missingele.add(10);
		missingele.add(6);
		missingele.add(8);
		Collections.sort(missingele);
		int largest=missingele.get(0);
		int Second=missingele.get(0);
		for(int i=1;i<missingele.size();i++)
		{
		if(missingele.get(i)>largest)
		{
		Second=largest;
		largest=missingele.get(i);
		}
		}
		System.out.println(largest);
	
		for(int i=0;i<largest;i++)
		{
		if(!missingele.contains(i+1))
		{
		missingele.add(i+1);
		}
		/*else
		{
		missingele.add(i);	
		}*/
		}
		Collections.sort(missingele);
		System.out.println(missingele);
	}

}
