package pages;

import org.openqa.selenium.WebElement;

import core.Driver;

public class ScoreHomePage extends Driver {
	String url = "https://www.clearscore.com/";
	protected String title = "Free Credit Scores | Credit Reports | Free Credit Check UK";
	String slink = "span.nav-item--signup-underline";
	String llink = "span.nav-item--login-underline";
	public ScoreHomePage getScoreHomePage(){
		driver.get(url);
		return new  ScoreHomePage();
	}
	public String getTitle(){
		return driver.getTitle();
	}
	public ScoresignUpPage goToScoresignUpPage(){
		WebElement singlink = driver.findElementByCssSelector(slink);
		singlink.click();
		return new  ScoresignUpPage();
	}
	public ScoreLoginPage goToScoreLoginPage(){
		WebElement loglink = driver.findElementByCssSelector(llink);
		loglink.click();
		return new ScoreLoginPage();
	}
	
	public boolean singUplinkDisplayed(){
		WebElement singlink = driver.findElementByCssSelector(slink);
		return singlink.isDisplayed();
		
	}
	public boolean LoginlinkDisplayed(){
		WebElement loglink = driver.findElementByCssSelector(llink);
		return loglink.isDisplayed();
	}
}

