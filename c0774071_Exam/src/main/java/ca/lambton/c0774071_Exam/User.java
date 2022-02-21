package ca.lambton.c0774071_Exam;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@NotNull
	@Size(min = 2, max = 40)
	private String name;
	
	@NotNull
	@Min(18)
	private int age;
	
	Occupation occupation;
	
}
