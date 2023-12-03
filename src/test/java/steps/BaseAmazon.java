package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class BaseAmazon {

	// Global hooks
	// Global hooks will run once before any scenario is run or after all scenario
	// have been run.

	@BeforeAll
	public static void featureStarts() {

		System.out.println("The feature has started execution");
	}

	@AfterAll
	public static void featureEnds() {

		System.out.println("The feature has completed execution");
	}

	public static WebDriver driver;

	@Before(order = 0, value = " @functional")
	public void ConditionalHooks() {

		System.out.println("Task 1: Open the browser");
	}

	@Before(order = 0, value = "@functional")
	public void openBrowser() {

		System.out.println("Task 2: Initialize the browser and open it");
		System.out.println("Opening Browser");
		driver = new ChromeDriver();

	}

	@Before(order = 1, value = "@functional")
	public void managebrowserWindow() {

		System.out.println("Task 3: maximize window");

		driver.manage().window().maximize();
	}

	@Before(order = 2, value = "@functional")
	public void openUrl() {

		System.out.println("Task 4: Open the URL in browser");

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@BeforeStep
	public void stepStart() {

		System.out.println("The steps has started excution");
	}

	@AfterStep
	public void stepEnd() {

		System.out.println("The steps has completed execution");
	}

	// these method I want to run after every secnario in my feature

	@After(order = 2, value = "@functional")
	public void captureTitle() {

		System.out.println(driver.getTitle());

	}

	@After(order = 1, value = "@functional")
	public void closeBrowser() {

		driver.quit();
	}

	@After(order = 0, value = "@functional")
	public void TestCompleteMessage() {

		System.out.println("Test scenario is now completed");
	}

}