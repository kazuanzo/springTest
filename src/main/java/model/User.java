package model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	@Id
	private String userId;
	
	private String password;
	private String firstName;
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
	

}
