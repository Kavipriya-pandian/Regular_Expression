package dxc;

public class Regex_Ass1_Password_Validation
{
	public static boolean checkPasswordValidity(String password)
		{
		 //Implement your code here and change the return value accordingly
			String regex= "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%_]).{8,20}$";
					//"([\\w!@#$%]{1})(.*[A-Z].*[a-z].*[0-9].*[!@#$%_]){7,12}";
					//"([\\w!@#$%]{1})+(.*[A-Z].*[a-z].*[0-9].*[!@#$%_]){7,12}";
					//"(([A-Za-z0-9!@#$%_]){1})+(?=.*([A-Za-z0-9!@#$%_]){7,12})";
			if(password.matches(regex))
			{
				return true;
			}
			return false;
		 }
		 public static void main(String[] args)
		 {
		 
		 //Change the value of password for testing your code with different passwords
		 String password = "P@$sW0rd";
		 System.out.println("The password is "+ (checkPasswordValidity(password) ?
				 "valid!" : "invalid!"));
		 String password1 = "Password";
		 System.out.println("The password is "+ (checkPasswordValidity(password1) ?
			 "valid!" : "invalid!"));
		 }

}
