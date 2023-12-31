package com.ohgiraffers.section01.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = (BookService) context.getBean(BookService.class);

        /* 전체 도서 목록 조회 후 출력 확인 */
//        bookService.selectAllBooks().forEach(bookDTO -> System.out.println(bookDTO));
        bookService.selectAllBooks().forEach(System.out::println); // 위와 같다.

        System.out.println("-------------------------------------------------");

        /* 도서 번호로 검색 후 출력 확인 */
        System.out.println(bookService.selectOneBook(1));
        System.out.println(bookService.selectOneBook(2));
    }
}
