package ca.lambton.c0774071_Project;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Column(nullable = false, unique = true, length = 45)
	private String email;

	@NotNull
	@Column(nullable = false, length = 64)
	private String password;

	@Column(name = "first_name",nullable = false, length = 20)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
}
