package com.example.starspring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starspring.answer.Answer;
import com.example.starspring.question.Question;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

    Page<Answer> findAllByQuestion(Question question, Pageable pageable);

}