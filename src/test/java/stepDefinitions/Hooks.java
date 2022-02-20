package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//Write a code to get the place id
		//Execute this method when place id is null
		StepDefinition m=new StepDefinition();

		if(m.place_id==null)
		{
			m.add_place_payload_with("abcde", "English", "MG Road");
			m.user_calls_with_http_request("AddPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("abcde", "getPlaceAPI");
		}
	}

}
