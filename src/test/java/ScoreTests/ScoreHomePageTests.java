package ScoreTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ScoreHomePage;

public class ScoreHomePageTests extends ScoreHomePage {
	
	@Test
	public void verifyScoreHomePage(){
		getScoreHomePage();
		Assert.assertEquals(getTitle(), title);
		Assert.assertEquals(true, singUplinkDisplayed());
		Assert.assertEquals(true,  LoginlinkDisplayed());
	}

}
