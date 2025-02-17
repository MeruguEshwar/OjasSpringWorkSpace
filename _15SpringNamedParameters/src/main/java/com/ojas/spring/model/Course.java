package com.ojas.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

	private int courseId;
	private String courseName;
	private String coursePrice;
	private String courseDuration;
}
