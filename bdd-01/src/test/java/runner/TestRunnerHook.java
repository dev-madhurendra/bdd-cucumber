package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/java/resources/hooksDemo", 
    glue = { "hookDemoSteps" },
    tags = "@hooks",
    // plugin = {"pretty", "json:target/reports/report.json", 
                            // "xml:target/reports/report.xml",
                            // "html:target/reports/report.html"  },
    plugin = {"pretty", "json:target/cucumber.json"},
    strict = true
            
)
public class TestRunnerHook {}