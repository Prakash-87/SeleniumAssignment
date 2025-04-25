package W2D4;

public class radioclass extends buttonclass{

	public void selectradiobutton()
	{
	System.out.println("Select Radio button from multiple Option");	
	}
	public static void main(String[] args) 
	{
	radioclass rc=new radioclass();
	rc.click();
	rc.settext("Radion Button");
	rc.submit();
	rc.selectradiobutton();
}

}
