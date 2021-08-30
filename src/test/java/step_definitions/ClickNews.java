package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ClickNews {

    @Before
    public void openUrl() {
        open("http://192.168.0.110:81");
    }

    @Then("find_news_head")
    public void FindNews() {
        $(By.xpath("//a[text()='Новости']")).click();
    }
    @Then("click_news")
    public void ClickNews() {
        $(By.xpath("//a[text()='На главную']")).isDisplayed();
    }
    @Then("find_news_example")
    public void ClickNewsExample() {
        $(By.xpath("//a[text()='У нас в команде новый Мастер!']")).isDisplayed();
    }
    @Then("get_back")
    public void GetBack() {
        $(By.xpath("//a[text()='На главную']")).click();
    }
}