package api_model.request.createNewPet;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
public class ReqCreateNewPet{

	@JsonProperty("photoUrls")
	private List<String> photoUrls;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("category")
	private Category category;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	@JsonProperty("status")
	private String status;
}