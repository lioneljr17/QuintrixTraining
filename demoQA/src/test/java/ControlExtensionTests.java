

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import Framework.SeleniumTestBase;


public class ControlExtensionTests extends SeleniumTestBase {
  @Test
  public void CanSelectYesRadioVutton() {  
	  String yes ="Yes";
	  String Impressive ="Impressive";
	  String no ="No";
	  
	 ButonPages ButonPages =  new ButonPages(this.getDriver())
	       .navigate()
	       .Selectyesbutton()
	       .SelectImpresivebutton()
	       .SelectNobutton();
	        ButonPages.getyesButton();
	        ButonPages.getImpressiveButton();
	        ButonPages.getnoButton();
	 
	 assertEquals(ButonPages.getyesButton(),yes);
	 assertEquals(ButonPages.getImpressiveButton(),Impressive);
	 assertEquals(ButonPages.getnoButton(),no);
  }
  @Test
  public void CanclickHyperLink() {
	  String Link = "Link has responded with staus 201 and status text Created";
	  
	  HyperLinkPages  HyperLinkPages =new  HyperLinkPages(this.getDriver())
			  .navigate()
			  .ClickCreatedLink();
			  HyperLinkPages.getLinkResponse();
			 
	 assertEquals( HyperLinkPages.getLinkResponse(),Link);
	  
  }
  
  
}
