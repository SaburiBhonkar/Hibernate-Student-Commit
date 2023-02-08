package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestDriver {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		studentService.getAll();
	}
}
