package Base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class TestBase {

    public static String url = "http://dummy.restapiexample.com/api/v1";
    public static RequestSpecification request;
    public String employeeID = "2";
    public Logger logger = Logger.getLogger("DummyAPI");

    @BeforeClass
    public void initialization(){
    	
    	RestAssured.baseURI = url;
        request = RestAssured.given();
        logger.info("Driver Initialized");
        
    }

}
