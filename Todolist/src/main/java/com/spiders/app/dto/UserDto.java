package com.spiders.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "table_user")
public class UserDto implements Serializable {

	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	private long id;
	
	
	@Column(name = "user", length = 200)
	@NotEmpty(message = "user Name cant be empty")
	private String user;

	@Column(name = "description", length = 200)
	@NotEmpty(message = "description cant be empty")
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", user=" + user + ", description=" + description + "]";
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(long id, @NotEmpty(message = "user Name cant be empty") String user,
			@NotEmpty(message = "description cant be empty") String description) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
	}

	public boolean isEmpty1() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
