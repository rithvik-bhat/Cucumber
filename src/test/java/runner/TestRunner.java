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
@CucumberOptions(features= {"src//test//resources//Login//Login.feature"}, glue={"definition"})
public class TestRunner {

}
