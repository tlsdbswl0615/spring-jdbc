package com.yoonji.book.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", com.yoonji.book.example.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", com.yoonji.book.example.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}