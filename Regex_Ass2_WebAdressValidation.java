package dxc;

public class Regex_Ass2_WebAdressValidation
{

	public static boolean checkWebAddressValidity(String webAddress) 
	{
		 //Implement your code here and change the return value accordingly
		String regex="[http|https].*(://www.).*[A-Za-z0-9].*.?[com|org|net]";
		if(webAddress.matches(regex))
		{
			return true;
		}
		  return false; 
	 }
		 
		 public static void main(String[] args) {
		 
		 //Change the value of webAddress for testing your code with different web addresses
		 String webAddress = "http://www.company.com";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress)
				 ? "valid!" : "invalid!"));
		 String webAddress1 = "https://company.in";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress1) 
				 ? "valid!" : "invalid!"));
		 String webAddress2 = "https://www.company1234.in";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress2) 
				 ? "valid!" : "invalid!"));

		 }
		}


