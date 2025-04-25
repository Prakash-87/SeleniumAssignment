package W2D4;

public class textclass extends webelements
{
public void gettext()
{
System.out.println("Get input text from webelement");	
}
	public static void main(String[] args) 
	{
	textclass tc=new textclass();
	tc.click();
	tc.gettext();
    tc.settext("Enter the text inside webelements");
	}

}
