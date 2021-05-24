package Reusables;

import Base.TestBase;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods extends TestBase {

    public Response employeeDetail(String employeeID){
    Response response = null;
    try {
            response = getResponse(employeeID);
            return response;
        }catch(Exception e) {
        	e.printStackTrace();
        }
	return response; 
    }

    public String getData(Response response, String property){
        JsonPath jsonPathEvaluatorName = response.jsonPath();
        String responseName = jsonPathEvaluatorName.get(property);
        return responseName;
    }

    public int getStatusCode(Response response){
        return response.getStatusCode();
    }

    public Response deleteEmployee(String employeeID){
    	Response response = null;
        try{
            request.header("Content-Type", "application/json");
            response = request.delete("/delete/"+employeeID);
            return response;
        }catch (Exception e){
            e.printStackTrace();
        }
		return response;
    }

    public Response getResponse(String id){
        Response response = request.get("/employee/"+id);
        return response;
    }
}
