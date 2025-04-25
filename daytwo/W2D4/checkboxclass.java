package W2D4;

public class checkboxclass extends buttonclass
{
public void clickCheckButton()
{
System.out.println("Click on Check Button");
}
	public static void main(String[] args) 
	{
	checkboxclass cb=new checkboxclass();
	cb.click();
    cb.settext("Enter the text in Webelement");
	cb.clickCheckButton();
	cb.submit();
	}

}
