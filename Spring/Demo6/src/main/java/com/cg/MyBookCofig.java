package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBookCofig {
	
	Author author;
	@Bean
	Author author(){
		
		System.out.println("This is author()");
		return  new Author("santhu", "kkd");
		
		
	}
	@Bean(initMethod="setUp",destroyMethod="cleanup")
	Book book(){
		System.out.println("This is book");
		Book book=new Book();
		book.setIsbn("AGTF");
		book.setYear("1222");
		book.setAuthor(author());
	
		return book;
	}

}
