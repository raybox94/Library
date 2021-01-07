package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;


@RestController
public class BooksController {
@GetMapping("/books")
	
public List<Book> getAllBooks(){
	
	ArrayList<Book> a = new ArrayList<>();
	
	 a.add(new Book(1,"Sun","King"));
	 a.add(new Book(2,"Moon","Queen"));
	 return a;
}


	
}
