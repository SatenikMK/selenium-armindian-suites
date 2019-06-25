import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upwork extends BasePage {
    @FindBy(xpath = "//input[@type=\"search\"][1]")
    private WebElement search;

    public Upwork() {
        super();
        PageFactory.initElements(driver, this);
        driver.get(getUrl());
    }

    public String getUrl() {
        return "https://www.upwork.com/";
    }

    public void searchFreelancer(){
        click(search);
        type(search,"QA Engineer");
    }


}
