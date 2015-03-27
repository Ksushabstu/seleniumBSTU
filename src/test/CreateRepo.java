package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRepo {
	
	private WebDriver driver;
		
		@FindBy (id="repository_name")
		private WebElement repository_name;
		
		
		public CreateRepo( WebDriver d)
		{	 		  
			  PageFactory.initElements(d,this);
			  this.driver=d;
		}		
		
		public void create(String rep_name)	
		{	
			repository_name.sendKeys(rep_name);
			repository_name.submit();		
		}

	}

