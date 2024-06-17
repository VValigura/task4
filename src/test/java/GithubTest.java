import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GithubTest {

    @Test
    public void SoftAssertionsIsPresent(){
        Selenide.open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("JUnit5 extension - "));



    }

}
