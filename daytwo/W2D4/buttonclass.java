package W2D4;

public class buttonclass extends webelements{

	public void submit()
	{
	System.out.println("Click on submit button to complete regsitration");	
	}
	public static void main(String[] args) 
	{
	buttonclass bc=new buttonclass();
	bc.click();
	bc.settext("Enter text inside webelement");
    bc.submit();
	}

}
