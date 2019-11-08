package com.example.jpa;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.model.Gender;
import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;

@SpringBootApplication
public class JpaOneToOneDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
    private UserProfileRepository userProfileRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToOneDemoApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// Clean up database tables
//		userProfileRepository.deleteAllInBatch();
//		userRepository.deleteAllInBatch();

		//=========================================

		// Create a User instance
	/*	User user = new User("Suresh_4", "Naidu", "suresh_4@gmail.com",
				"MY_SUPER_SECRET_PASSWORD");

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1992, 7, 21);

		// Create a UserProfile instance
		UserProfile userProfile = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(),
				"747", "2nd Cross", "Golf View Road, Kodihalli", "Bangalore",
				"Karnataka", "India", "560008");


		// Set child reference(userProfile) in parent entity(user)
		user.setUserProfile(userProfile);

		// Set parent reference(user) in child entity(userProfile)
		userProfile.setUser(user);

		// Save Parent Reference (which will save the child as well)
		userRepository.save(user);*/
		
		List<UserProfile> listUserProfile = userProfileRepository.findAll();
		System.out.println(listUserProfile);

	//	userRepository.deleteById((long) 12);
//		userRepository.deleteByFirstName("Suresh_3");
		//=========================================
	}


}
