package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//From here I want to execute the cucumber file
//I want to run the login.feature file

//Run with is used when you want to run a file specifically
//Run a class, directing the project or the class to execute
@RunWith(Cucumber.class)
//Where is cucumber class: give me the path
//glue is telling us where the implementations are
@CucumberOptions(features= {"src/test/resources/Login/Skillrary.feature"}, glue={"definition"},
dryRun = false, //I want to check all the methods implemented
//strict = true,//It will check whether all the methods are working or not
//tags = "@PositiveTesting",
//To get the reports we use plugin
plugin= {"html:testoutput/rithvik.html","json:testoutput/rithvik.json","junit:testoutput/rithvik.xml"}
)

public class TestRunnerSkillrary {

}
