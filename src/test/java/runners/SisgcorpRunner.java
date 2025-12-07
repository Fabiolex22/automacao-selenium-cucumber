package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"steps", "utils"},
        plugin = {
                "pretty",
                // JSON necessário para o Jenkins gerar o relatório
                "json:target/cucumber.json",
                // Relatório HTML normal do Cucumber
                "html:target/cucumber-html-report"
        },
        monochrome = true
)
public class SisgcorpRunner {

}
