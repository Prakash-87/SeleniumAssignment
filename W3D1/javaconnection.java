package W3D1;

public class javaconnection implements databaseconnection
{

	
	@Override
	public void connect() 
	{
	System.out.println("Start the broswer");	
	}

	@Override
	public void disconnect() 
	{
	System.out.println("Quit the browser");
	}

	@Override
	public void executeupdate() 
	{
	System.out.println("Execute and Update the script");
		
	}

	public static void main(String[] args) 
	{
	javaconnection jc=new javaconnection();
	System.out.println("***Interface***");
	jc.connect();
	jc.disconnect();
    jc.executeupdate();
	}

}
