package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreenifyApplicationTests {

	@Test
	void contextLoads() {
	}
//
//
//
//	class StudentServiceTest {
//
//		StudentService studentService = new StudentService();
//
//		@BeforeAll
//		public static void initializeDB() {
//			CommandLine.addData();
//		}
//
//		@Test
//		public void validStudentTest() {
//			String email = "Ariadna@gmail.com";
//			String password = "password";
//			Assertions.assertTrue(studentService.validateStudent(email, password));
//		}
//
//		@Test
//		public void invalidStudentTest() {
//			String email = "DonavanTheBest@gmail.com";
//			String password = "password";
//			Assertions.assertFalse(studentService.validateStudent(email, password));
//		}
//	}
}
