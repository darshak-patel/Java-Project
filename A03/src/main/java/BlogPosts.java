import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BlogPosts {
	
	private String id;
	private String authorId;
	private String postContent;
	
	@Builder
	@JsonCreator
	private static BlogPosts of(
			@JsonProperty("id") String id,
			@JsonProperty("authorId") String authorId,
			@JsonProperty("postContent") String postContent) {
		
		return new BlogPosts(id, authorId, postContent);
	};
}