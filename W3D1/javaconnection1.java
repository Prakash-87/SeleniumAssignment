package W3D1;

public class javaconnection1 extends mysqlconnection{
   
	@Override
	public void connect() 
	{
	System.out.println("Start the broswer");	
	}

	@Override
	public void disconnect() 
	{
	System.out.println("Disconnect the browser");	
	}

	@Override
	public void executeupdate() 
	{
	System.out.println("Execute and Update the script");
		
	}
	public static void main(String[] args) 
	{
		javaconnection1 jc1=new javaconnection1();
		System.out.println("***Abstract***");
		jc1.connect();
		jc1.disconnect();
		jc1.executeupdate();
        jc1.executequery();
	}

}
