package net.engineeringdigest.journalApp.api.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
	private Current current;
	
	@Getter
	@Setter
	public class Current{
		
		private int temperature;
		
		@JsonProperty("weather_code")
		private int weatherCode;
		
		private ArrayList<String> weather_descriptions;
		
		private int feelslike;
	}	
}
//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */



