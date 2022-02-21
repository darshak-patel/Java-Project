import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Blog {
	List<Person> personList = new ArrayList<Person>();
	List<BlogPosts> blogPostsList = new ArrayList<BlogPosts>();
	
	public ArrayList<String> getPostsByAuthorAge(int age) {
		ArrayList<String> personIdList = new ArrayList<String>();
		for (Person person : personList) {
			if (age == person.getAge()) {
				personIdList.add(person.getId());
			}
		}
		
		ArrayList<String> blogPostsIdList = new ArrayList<String>();
		for (String personID : personIdList) {
			for (BlogPosts blogPostsAuthorId : blogPostsList) {
				if (personID.equals(blogPostsAuthorId.getAuthorId())) {
					blogPostsIdList.add(blogPostsAuthorId.getId());
				}
			}
		}
		return blogPostsIdList;
	}
}