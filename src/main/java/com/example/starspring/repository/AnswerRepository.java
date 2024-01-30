package com.example.starspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starspring.answer.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

    
}