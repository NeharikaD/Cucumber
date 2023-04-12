package steps;

import com.baseclass.baseuse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Login extends baseuse {
    @Given("user navigate to LoanInsight Home page")
    public void userNavigateToLoanInsightHomePage() throws InterruptedException {
        Thread.sleep(5000);
        String title= driver.getTitle();
        if(title.equals("Loan Insight Online | What Does Loan Calculator Do?")){
            System.out.println("User navigate to LoanInsight Home page");
        }
    }

    @Then("user click on Login")
    public void userClickOnLogin() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.className("collapsible-header")).click();
    }

    @When("user enter the username & password")
    public void userEnterTheUsernamePassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tester.tp@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Techpundits@123");
        Thread.sleep(5000);
    }

    @And("user click on submit")
    public void userClickOnSubmit() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@name='submit'])[1]")).click();
        Thread.sleep(5000);
    }
    
    @Given("user enter the username {string} & password {string}")
    public void userEnterTheUsernamePassword(String usernameValue, String passwordValue) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(usernameValue);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwordValue);
        Thread.sleep(5000);
    }

    @When("user enter the invalid username {string} & valid password {string}")
    public void userEnterTheInvalidUsernameValidPassword(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(5000);
    }


    @When("user enter the valid username {string} & invalid password {string}")
    public void userEnterTheValidUsernameInvalidPassword(String username1, String password1) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username1);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password1);
        Thread.sleep(5000);
    }
}
