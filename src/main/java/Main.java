import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Main {
    public static void main(String[] args) {
        open("https://mvnrepository.com/");
        SelenideElement inputTextField = $(By.name("q"));
        inputTextField.click();
        inputTextField.setValue("logback-classic");
        inputTextField.pressEnter();

        SelenideElement firstResult = $(By.className("im-title"));
        SelenideElement firstA = firstResult.$("a");
        firstA.shouldBe(Condition.matchesText("Logback Classic Module"));

        sleep(5000);
    }
}
