package com.example.starspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.starspring.Service.QuestionService;
import com.example.starspring.repository.QuestionRepository;

@SpringBootTest
class StarspringApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {

		/*
		 * Question q1 = new Question();
		 * q1.setSubject(" starssong은 누구인가요?");
		 * q1.setContent(" starsong에 대해서 알고싶습니다");
		 * q1.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q1);
		 * 
		 * Question q2 = new Question();
		 * q2.setSubject(" starssong은 누구인가요?");
		 * q2.setContent(" starsong에 대해서 알고싶습니다");
		 * q2.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q2);
		 */

		for (int i = 1; i <= 300; i++) {
			String subject = String.format("test data : [%03d]", i);
			String content = "content";
			this.questionService.create(subject, content);
		}
	}
}
