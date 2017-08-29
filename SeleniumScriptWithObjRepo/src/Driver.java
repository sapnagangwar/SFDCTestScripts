
public class Driver {
	
	public static void main(String[] args) throws Exception {
		
		AutomationScripts.SFDCLogin();
		
		AutomationScripts.validateErrorMessage();
		
		AutomationScripts.loginFailure();
		
		AutomationScripts.openMyprofilePage();
		
		AutomationScripts.logout();
		
		AutomationScripts.testSalesForceMyProfile();
		
		Thread.sleep(500);
		
	}

}
