package api_model.response.createNewPet;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class RespNewPet{

	@JsonProperty("photoUrls")
	private List<String> photoUrls;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("category")
	private Category category;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	@JsonProperty("status")
	private String status;
}