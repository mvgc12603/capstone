package com.greenify.ecohub;

import com.greenify.ecohub.database.dao.ResourceDAO;
import com.greenify.ecohub.database.dao.SpeakerDAO;
import com.greenify.ecohub.database.entity.Resource;
import com.greenify.ecohub.database.entity.Speaker;
import com.greenify.ecohub.form.CreateSpeakerFormBean;
import com.greenify.ecohub.service.SpeakerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootTest
class GreenifyApplicationTests {
	@Autowired
	private SpeakerDAO speakerDAO;

	@Autowired
	private ResourceDAO resourceDAO;

	@Autowired
	private SpeakerService speakerService;
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



//	@Test
//	void contextLoads() {
//	}

	//DAO Test 1
	@ParameterizedTest
	@CsvSource({"1,Zucker", "2,Kammerer", "3,Gann","4,Ferrell"})
	public void findById(int id, String name){
		Speaker speaker = speakerDAO.findById(id);

		assert speaker.getLastName().equals(name);
	}

	//DAO Test 2
	@Test
	public void findResourcesByType(){
		List<Resource> resources = resourceDAO.findResourcesByType("Water");

		resources.stream().forEach(resource -> {
			assert "Water".equals(resource.getType()) : "Resource type is not Water";
		});

	}

	//DAO Test 3
	@Test
	public void getUserDetails(){

	}

	@Test
	public void createSpeaker() {
		Speaker speaker = new Speaker();
		CreateSpeakerFormBean form = new CreateSpeakerFormBean();
		form.setFirstName("John");
		form.setLastName("Test");
		form.setOrganization("ABC company");
		form.setTitle("N/A");
		form.setAbout("N/A");
		speaker = speakerService.createSpeaker(form, speaker);

		List<Speaker> speakers = speakerDAO.findByLastName("Test");

		assert !speakers.isEmpty();

		speakers.stream().forEach(s -> {
			assert "Test".equals(s.getLastName()) : "Test does not exist";
			speakerDAO.delete(s);
		});
		}
	}

