package io.spring.bookstore;

import io.spring.bookstore.domain.Book;
import io.spring.bookstore.domain.User;
import io.spring.bookstore.repo.UserRepo;
import io.spring.bookstore.service.BookService;
import io.spring.bookstore.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService, BookService bookService) {
		return args-> {
			User user1 = new User("Kachi",
					"Malaka",
					"Kachi",
					"1234",
					new Date(80, 1, 11));

			Book book1 = new Book("When Never Comes", "Barbara Davis", 179.0, false);
			Book book2 = new Book("Giraffes Can't Dance", "Giles Andreae, Guy Parker-Rees", 200.5, false);

			user1.getBooks().add(book1);
			user1.getBooks().add(book2);

			userService.saveUser(user1);

			book1.getUsers().add(user1);
			book2.getUsers().add(user1);

			bookService.saveBook(book1);
			bookService.saveBook(book2);

			bookService.saveBook(new Book("Before We Were Yours: A Novel", "Lisa Wingate", 340.0, false));
			bookService.saveBook(new Book("The Great Alone: A Novel Kristin Hannah", "Kristin Hannah", 495.0, true));
			bookService.saveBook(new Book("An American Princess: The Many Lives of Allene Tew", "Annejet van der Zijl, Michele Hutchison", 149.0, true));
			bookService.saveBook(new Book("Medical Medium Life-Changing Foods", "Anthony William", 929.7, false));
			bookService.saveBook(new Book("Vegan 100", "Gaz Oakley", 897.96, false));
			bookService.saveBook(new Book("Have You Filled A Bucket Today?", "Carol McCloud", 290.06, false));
			bookService.saveBook(new Book("The Very Hungry Caterpillar", "Eric Carle", 208.51, false));
			bookService.saveBook(new Book("The Hate U Give", "Angie Thomas", 319.16, false));
			bookService.saveBook(new Book("The Very Hungry Caterpillar", "Kate Quinn", 208.51, false));
			bookService.saveBook(new Book("Harry Potter - A History of Magic", "British Library", 1379.78, false));




//			User user1 = new User();
//			user1.setName("Kachi");
//			user1.setSurname("Malaka");
//			user1.setUsername("Kachi");
//			user1.setPassword("1234");
//			user1.setDate_of_birth(new Date(80, 1,11));
//			userService.saveUser(user1);
//			userService.saveUser(new User(null, "Kachi", "Malaka", "Kachi", "1234", new Date(80,1,11)));

//
//			Book book1 = new Book(null, "When Never Comes", "Barbara Davis", 179.0, false);
//			Book book2 = new Book(null, "Giraffes Can't Dance", "Giles Andreae, Guy Parker-Rees", 200.5, false);
//			bookService.saveBook(new Book(null, "Before We Were Yours: A Novel", "Lisa Wingate", 340.0, false));
//			bookService.saveBook(book1);
//			bookService.saveBook(book2);
////			bookService.saveBook(new Book(null, "When Never Comes", "Barbara Davis", 179.0, false));
////			bookService.saveBook(new Book(null, "Giraffes Can't Dance", "Giles Andreae, Guy Parker-Rees", 200.5, false));
//			bookService.saveBook(new Book(null, "The Great Alone: A Novel Kristin Hannah", "Kristin Hannah", 495.0, true));
//			bookService.saveBook(new Book(null, "An American Princess: The Many Lives of Allene Tew", "Annejet van der Zijl, Michele Hutchison", 149.0, true));
//			bookService.saveBook(new Book(null, "Medical Medium Life-Changing Foods", "Anthony William", 929.7, false));
//			bookService.saveBook(new Book(null, "Vegan 100", "Gaz Oakley", 897.96, false));
//			bookService.saveBook(new Book(null, "Have You Filled A Bucket Today?", "Carol McCloud", 290.06, false));
//			bookService.saveBook(new Book(null, "The Very Hungry Caterpillar", "Eric Carle", 208.51, false));
//			bookService.saveBook(new Book(null, "The Hate U Give", "Angie Thomas", 319.16, false));
//			bookService.saveBook(new Book(null, "The Very Hungry Caterpillar", "Kate Quinn", 208.51, false));
//			bookService.saveBook(new Book(null, "Harry Potter - A History of Magic", "British Library", 1379.78, false));




		};
	}
}
