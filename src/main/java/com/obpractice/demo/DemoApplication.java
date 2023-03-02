package com.obpractice.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		BookRepository bookRepository = context.getBean(BookRepository.class);
//		bookRepository.save(new Book(1000,"Autor1",true));
//		bookRepository.save(new Book(500,"Autor2",false));
//		bookRepository.save(new Book(950,"Autor3",true));
//
//		OtherUser otherUser = new OtherUser();
//		System.out.println(otherUser.getPassword());
//
//		MyUserRespository myUserRespository = context.getBean(MyUserRespository.class);
//		PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);
//		myUserRespository.save(new MyUser(null, "user", passwordEncoder.encode("password")));


	}

}
