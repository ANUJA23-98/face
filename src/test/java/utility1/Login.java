package utility1;


public class Login
{
	@Given ("^User provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
	public void bLanuch(String name, String location)
	{
		Object[] input=new Object[2];
          input[0]=name;
          input[1]=location;
        SeleniumOperations.browserLaunch(input);
	}
	@Given ("^user enter url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
          input1[0]=url;
        SeleniumOperations.openApplication(input1);
	}
	
	@When ("^user enter \"(.*)\" as email address$")
	public void provideEmail(String ID)
	{
		Object[] input2=new Object[1];
          input2[0]=ID;
        SeleniumOperations.sendText(input2);
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public void providePass(String pass)
	{
		Object[] input3=new Object[1];
          input3[0]=pass;
        SeleniumOperations.sendText(input3);
	}
	@When ("^user click on Login button$")
	public void click(String pass)
	{
		Object[] input4=new Object[1];
          input4[0]=pass;
        SeleniumOperations.clickOnElement(input4);
	}
	
	
}
