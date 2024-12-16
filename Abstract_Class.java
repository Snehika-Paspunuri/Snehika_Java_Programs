package basicknowledge;
abstract class Amazon_Auth
{
	abstract void un();//abstract method
	abstract void un_mob();//abstract method
	void login_button()//concrete 
	{
		System.out.println("Logic");
	}
}
abstract class Amazon_Login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()// concrete method
	{
		System.out.println("login1");
	}
	
}
public class Abstract_Class extends Amazon_Login 
{
static void loginwith_mob()
{
	System.out.println("Logic1");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract_Class a1=new Abstract_Class();
loginwith_mob();
a1.un_as_email();
a1.un_as_mobile();
a1.un_as_email();
a1.un();
a1.login_button();
a1.registration_button();
	} 

@Override
void un_mob() {
	// TODO Auto-generated method stub
	System.out.println("I am mobile login");
}

@Override
void un_as_email() {
	// TODO Auto-generated method stub
	System.out.println("I am email as login");
}

@Override
void un_as_mobile() {
	// TODO Auto-generated method stub
	System.out.println("I am login as mobile");
}

@Override
void un() {
	// TODO Auto-generated method stub
	System.out.println("I am just un ");
}
}