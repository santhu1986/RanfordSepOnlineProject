package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\OnlinePrjAugust\\Ebanking\\src\\feature\\AdminLogin.feature",
	                      	"D:\\OnlinePrjAugust\\Ebanking\\src\\feature\\RoleCre.feature"},
                                 glue="stepdefination",monochrome=true,
                 plugin= {"pretty","json:Target/Role/ResRole.json"})
public class ALoginRunner 
{

}
