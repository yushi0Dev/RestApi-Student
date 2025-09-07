package com.api.crud.studentdto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDtoIU {
	
	private String firstname;
	private String lastname;
	private Date birthday;

}
