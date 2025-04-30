package W3D1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting 
{
public void str(List<String> sorting)
{

}
	public static void main(String[] args) 
	{   
		sorting s=new sorting();
		List<String> sorting=new ArrayList<String>();
		sorting.add("HCL");
        sorting.add("Wipro");
        sorting.add("Aspire Systems");
        sorting.add("CTS");
        Collections.sort(sorting);
        System.out.println("List Elements in Ascending Order:"+sorting);
        s.str(sorting);
        Collections.reverse(sorting);
        System.out.println("List Elements in Reverse Order"+sorting);
        }
        
	}
	
