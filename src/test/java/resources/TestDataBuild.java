package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Locations;

public class TestDataBuild {

	public static AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace addPlace = new AddPlace();
		addPlace.setAccuracy(50);
		addPlace.setAddress(address);
		addPlace.setLanguage(language);
		addPlace.setName(name);
		addPlace.setPhone_number("8605487744");
		addPlace.setWebsite("abcd.com");

		List<String> myList= new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		addPlace.setTypes(myList);

		Locations l=new Locations();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		addPlace.setLocation(l);
		
		return addPlace;
	}
	
	public String deletePlacePayload(String placeID)
	{
		return "{\r\n" + 
				"	\"place_id\":\""+placeID+"\"\r\n" + 
				"}";
	}
}
