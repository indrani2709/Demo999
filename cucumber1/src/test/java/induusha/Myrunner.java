package induusha;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="Mydemoddc2",glue="ddC2mystepdefinition",tags= {"@smoke, @sanity"},
plugin={"html:target/cucumber-htmlreport.html"})
public class Myrunner {

}
