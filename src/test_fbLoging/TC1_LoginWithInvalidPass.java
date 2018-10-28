package test_fbLoging;

import org.testng.annotations.Test;

import base.Configeration;
import locators.FB_login_loc;
import values.FB_login_values;

public class TC1_LoginWithInvalidPass extends Configeration{
	
	FB_login_loc logIn = new FB_login_loc();
	FB_login_values logInInfo = new FB_login_values();
	
	@Test
	public void fbLoginWithInvalidPassword(){
		
		typeByXpath (logIn.emailOrPhone, logInInfo.mobileEmail_value);
		typeByXpath (logIn.password, logInInfo.invalidPassword_value);
		clickByXpath (logIn.loginButton);
		
	

}
}