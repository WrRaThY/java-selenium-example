import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainTest {
    @Test
    public void example() {
        //given
        open("https://mvnrepository.com/");

        //when
        SelenideElement inputTextField = $(By.name("q"));
        inputTextField.click();
        inputTextField.setValue("logback-classic");
        inputTextField.pressEnter();

        //then
        SelenideElement firstResult = $(By.className("im-title"));
        SelenideElement firstA = firstResult.$("a");
        firstA.shouldBe(Condition.matchesText("Logback Classic Module"));
    }
}