package W2D4;

public class apiclient 
{
public void sendrequest(String endpoint)
{
System.out.println("Endpoint:"+endpoint);	
}
public void sendrequest(String endpoint,String requestbody,String requeststatus)
{
	System.out.println("Endpoint:"+endpoint+"RequestBody:"+requestbody+"is:"+requeststatus);	
}
	public static void main(String[] args) 
	{
	apiclient ap=new apiclient();
	ap.sendrequest("response");
	ap.sendrequest("endpoint is response"," body ","true or false");
	}

}
