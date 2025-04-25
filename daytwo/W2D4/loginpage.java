package W2D4;

public class loginpage extends basepage
{
	@Override public void performcommontasks()
	{
	System.out.println("Perform tasks and click on submit button in super class");	
	}
	public static void main(String[] args) 
	{
	loginpage lp=new loginpage();
	lp.performcommontasks();
    lp.clickelement();
    lp.findelement();
    lp.entertext();
	}

}
