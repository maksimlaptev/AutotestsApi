package api_model.response.createNewPet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class Category{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private Integer id;
}