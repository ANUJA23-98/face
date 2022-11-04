package utility1;

public class calling
{
	public static void main(String[] args) throws InterruptedException 
    {
//browserLaunch
  	  Object[] input=new Object[2];
  	           input[0]="Chrome" ;
  	           input[1]="E:\\Automation support\\chromedriver.exe";
  	         SeleniumOperations.browserLaunch(input);
  	  //openApplication
  	  Object[] input1=new Object[1];
          		   input1[0]="https://www.facebook.com/";
          		 SeleniumOperations.openApplication(input1);     
 
	  /*        //clickOnElement
           Object[] input2=new Object[1];
           		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
           		SeleniumOperations.clickOnElement(input2);     

    
  	
         //clickOnMyProfile
           Object[] input4=new Object[1];
                 input4[0]="(//*[@class='_2NOVgj'])[1]";
                 SeleniumOperations.clickOnElement(input4);     */
     
       //enterId
  	Thread.sleep(5000);
                 Object[] input5=new Object[2];
  	           input5[0]="//*[@type='text']";    //"//*[@class='_2IX_2- VJZDxU']";
  	           input5[1]="anuja12589@gmail.com";
  	         SeleniumOperations.sendText(input5);
  	  
  	  //enterPassword
	        Object[] input6=new Object[2];
	        	     input6[0]="//*[@type='password']";
	        	     input6[1]="52565854";
	        	     SeleniumOperations.sendText(input6);  
	        	           
	/*       //clickOnLoginButton
	         Object[] input7=new Object[1];
	               input7[0]="//*[text()='Forgotten password?']";
	               SeleniumOperations.clickOnElement(input7);         	       
	
	               Thread.sleep(10000);
	                 Object[] input2=new Object[2];
	  	           input5[0]="//*[@type='text']";    
	  	           input5[1]="anuja12589@gmail.com";
	  	         SeleniumOperations.sendText(input2);             */
	  	  
	  	     //clickOnLoginButton
		         Object[] input4=new Object[1];
		               input4[0]="//*[@name='login']";
		               SeleniumOperations.clickOnElement(input4);         	       
		  
    }

}
