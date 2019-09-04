package mybdcrunner;


@RunWith(Cucumber.class)
//@CucumberOptions(features="features01",glue="bdcstepdefinitions",tags= {"@Sanity,@Regression"})
//@CucumberOptions(features="features01",glue="bdcstepdefinitions",tags= {"@Smoke"})
@CucumberOptions(features="C:\\Users\\j.bysani.shekar\\java1\\MyDemo_01_Cucumber\\features01\\f1demo.feature",glue="bdcstepdefinitions",plugin= {"pretty","html:target/cucumber-html-report","json:target/JanDemo-JSON-report"})
public class BDCRunner {

}
