package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends Base {
	@Given("^I'm on the Amazon homepage$")
	public void i_m_on_the_Amazon_homepage() throws Throwable {
		driver=getdriver();
	    
	}

	@When("^I click on signin button$")
	public void i_click_on_signin_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
	    
	    
	}

	@When("^I put my email$")
	public void i_put_my_email() throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bulbul96@hotmail.com");
	    
	    
	}

	@When("^I click continue$")
	public void i_click_continue() throws Throwable {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	    
	    
	}

	@When("^I put my password$")
	public void i_put_my_password() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lana6249");
	    
	}

	@When("^I click sign-in button$")
	public void i_click_sign_in_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	    
	}

	@Then("^I successfully login to my account$")
	public void i_successfully_login_to_my_account() throws Throwable {
	    
	    
	}

}
