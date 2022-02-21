import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class A03Tester {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Blog blog = new Blog();
		
		blog.setPersonList(mapper.readValue(new URL("file:persons.json"), new TypeReference<List<Person>>() {}));
		blog.setBlogPostsList(mapper.readValue(new URL("file:blogPosts.json"), new TypeReference<List<BlogPosts>>() {}));
		
		System.out.println(blog.toString());
		
		List<String> blogPostsIdList = blog.getPostsByAuthorAge(22);
		
		System.out.println(blogPostsIdList.toString()); // returns all the BlogPost id's that have an author whose age is equal to "22"
	}

}