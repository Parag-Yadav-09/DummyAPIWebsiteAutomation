package Tests;

import Reusables.ReusableMethods;
import io.restassured.response.Response;
import Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_001 extends TestBase {

    ReusableMethods reusable = new ReusableMethods();

    @Test(priority = 0)
    public void employeeDetail(){
        Response response = reusable.employeeDetail(employeeID);
        Assert.assertEquals(reusable.getStatusCode(response),200,"Staus Code:"+reusable.getStatusCode(response));
        logger.info(response.getBody().asString());
    }

	
	@Test(priority = 1) 
	public void deleteEmployeeDetails(){ 
		  Response response = reusable.deleteEmployee(employeeID); 
		  Assert.assertEquals(reusable.getStatusCode(response),200,"Staus Code:"+reusable.getStatusCode(response));
	      logger.info(reusable.getData(response, "message"));
	}
}
