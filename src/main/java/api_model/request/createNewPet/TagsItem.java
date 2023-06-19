package api_model.request.createNewPet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
public class TagsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private Integer id;
}