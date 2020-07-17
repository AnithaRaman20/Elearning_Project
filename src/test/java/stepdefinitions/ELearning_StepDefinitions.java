package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Wrapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ELearning_StepDefinitions extends Wrapper{
	
static	WebDriver driver;

	@Given("^User should launch the application and enter the url \"([^\"]*)\"$")
	public void user_should_launch_the_application_and_enter_the_url(String url) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(url);
	}

	@Then("^Login as Teacher \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_as_Teacher(String username, String password) throws Throwable {
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("submitAuth")).click();
		
	    
	}

	@Then("^Go to the course$")
	public void go_to_the_course() throws Throwable {
		driver.findElement(By.partialLinkText("SDETCourse_IBMByAnitha")).click();
			    
	}

	@Given("^Click on Project icon$")
	public void click_on_Project_icon() throws Throwable {
		driver.findElement(By.partialLinkText("Projects")).click();
		
	}

	@Then("^Click on create a new project icon$")
	public void click_on_create_a_new_project_icon() throws Throwable {
		//driver.findElement(By.partialLinkText("Create a new project")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Project management')]//following::img")).click();
	}

	
	@Then("^Enter valid title in title text box \"([^\"]*)\"$")
	public void enter_valid_title_in_title_text_box(String title) throws Throwable {
		driver.findElement(By.id("add_blog_blog_name")).sendKeys(title);
		
	  
	}
	
	
	@Then("^Enter valid text in sub title text box \"([^\"]*)\"$")
	public void enter_valid_text_in_sub_title_text_box(String subtitle) throws Throwable {
		driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys(subtitle);
		
	}
	
	//Test Data from Excel
	@Then("^Enter valid title in title text box$")
	public void enter_valid_title_in_title_text_box() throws Throwable {
		driver.findElement(By.id("add_blog_blog_name")).sendKeys(Wrapper.getDataFromExcel(1, 0));
		
	}                      
	
	//Test Data from Excel
	@Then("^Enter valid text in sub title text box$")
	public void enter_valid_text_in_sub_title_text_box() throws Throwable {
		driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys(Wrapper.getDataFromExcel(1, 1));
	   
	}

	@Then("^click on save blog button$")
	public void click_on_save_blog_button() throws Throwable {
		driver.findElement(By.id("add_blog_submit")).click();
	}

	@Then("^click on project link$")
	public void click_on_project_link() throws Throwable {
		driver.findElement(By.partialLinkText("elearning")).click();
		   
	}

	@Then("^click on new task icon$")
	public void click_on_new_task_icon() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'elearning')]//following::img[2]")).click();
	}

	@Then("^enter valid task in title text box \"([^\"]*)\"$")
	public void enter_valid_task_in_title_text_box(String tasktitle) throws Throwable {
	    driver.findElement(By.id("add_post_title")).sendKeys(tasktitle);
	}

	//test data from excel
	@Then("^enter valid task in title text box$")
	public void enter_valid_task_in_title_text_box() throws Throwable {
		 driver.findElement(By.id("add_post_title")).sendKeys(Wrapper.getDataFromExcel(1, 2));
	}
	
	@Then("^click on save1 button$")
	public void click_on_save1_button() throws Throwable {
		driver.findElement(By.id("add_post_save")).click();
	}

	@Then("^click on Role management icon$")
	public void click_on_Role_management_icon() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'elearning')]//following::img[3]")).click();
		
	}

	@Then("^click on add a new role icon$")
	public void click_on_add_a_new_role_icon() throws Throwable {
		driver.findElement(By.partialLinkText("Add a new role")).click();
		
	}
	
	@Then("^enter valid role in title text box \"([^\"]*)\"$")
	public void enter_valid_role_in_title_text_box(String role) throws Throwable {
		 driver.findElement(By.cssSelector("input[name=task_name]")).sendKeys(role);
	    
	}
	
	//test data from excel
	@Then("^enter valid role in title text box$")
	public void enter_valid_role_in_title_text_box() throws Throwable {
		driver.findElement(By.cssSelector("input[name=task_name]")).sendKeys(Wrapper.getDataFromExcel(1, 3));
	    
	}


	@Then("^click on save role button$")
	public void click_on_save_role_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}
	

	@Then("^click on Assign role icon$")
	public void click_on_Assign_role_icon() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Assign roles')]")).click();
			    
	}

	@Then("^select student / teacher name in user list box$")
	public void select_student_teacher_name_in_user_list_box() throws Throwable {
	    
	}

	@Then("^click on validate button$")
	public void click_on_validate_button() throws Throwable {
		driver.findElement(By.id("assign_task_submit")).click();
		
	   
	}

	/*
	 * @Then("^click on user management icon$") public void
	 * click_on_user_management_icon() throws Throwable { driver.findElement(By.
	 * xpath("//a[contains(text(), 'elearning')]//following::img[4]")).click(); }
	 * 
	 * @Then("^click on checkbox beside the user$") public void
	 * click_on_checkbox_beside_the_user() throws Throwable {
	 * 
	 * 
	 * }
	 * 
	 * @When("^click on register button$") public void click_on_register_button()
	 * throws Throwable {
	 * 
	 * }
	 * 
	 * @Then("^Display the user has been registered message$") public void
	 * display_the_user_has_been_registered_message() throws Throwable {
	 * 
	 * }
	 */
}
