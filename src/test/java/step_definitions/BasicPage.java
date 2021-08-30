package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    @Before
    public void openUrl() {
        open("http://192.168.0.110:81");
    }

    @Then("^find_contacts$")
    public void FindContacts() {

        $(By.xpath("//a[text()='Контакты']")).isDisplayed();
    }

    @Then("find_price")
    public void FindPrice() {

        $(By.xpath("//a[text()='Прайс-лист']")).isDisplayed();
    }

    @Then("find_promo")
    public void FindPromo() {

        $(By.xpath("//a[text()='Акции']")).isDisplayed();
    }

    @Then("find_gallery")
    public void FindGallery() {

        $(By.xpath("//a[text()='Галерея']")).isDisplayed();
    }

    @Then("find_news")
    public void find_news() {

        $(By.xpath("//a[text()='Новости']")).isDisplayed();
    }

    @Given("I go to mainpage")
    public void iGoToMainpage() {

    }
}
