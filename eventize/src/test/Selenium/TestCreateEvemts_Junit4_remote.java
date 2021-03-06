package eventize;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class CreateEvemts_Junit4_remote extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://events-2016.appspot.com/", "*chrome");
	}
	public void testCreateEvemts_Junit4_remote() throws Exception {
		selenium.open("/");
		selenium.click("link=inputLogin using your gmail account");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=Email", "harshithachidanand");
		selenium.click("id=next");
		selenium.type("id=Passwd", "");
		selenium.click("id=next");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=eventName", "New events");
		selenium.type("id=eventTagline", "New is awesome");
		selenium.click("//table[@id='eventDate_table']/tbody/tr[3]/td[6]/div");
		selenium.click("css=button.btn-flat.picker__close");
		selenium.type("id=eventTime", "9:00AM");
		selenium.type("id=duration", "2 hours");
		selenium.click("css=input.select-dropdown.active");
		selenium.click("css=li.active > span");
		selenium.click("css=input.select-dropdown.active");
		selenium.click("css=#select-options-815bcc23-dabb-d8e7-0c54-cc604715e2d4 > li.active > span");
		selenium.click("css=input.select-dropdown.active");
		selenium.click("css=#select-options-091efa9b-6d5f-ef96-ae17-69722f5ba9b7 > li.active > span");
		selenium.click("css=input.select-dropdown.active");
		selenium.click("css=#select-options-7ed503fc-e8cb-c3b8-0752-c157b27088ea > li.active > span");
		selenium.type("id=capacity", "90");
		selenium.type("id=location", "HFH");
		selenium.type("id=description", "yep! come n see what new");
		selenium.type("id=createrName", "Harshitha");
		selenium.type("id=createrEmail", "har@gmail.com");
		selenium.click("name=action");
		selenium.waitForPageToLoad("30000");
		selenium.click("//ul[@id='nav-mobile']/li[3]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=call_madeSignout");
		selenium.waitForPageToLoad("30000");
	}
}
