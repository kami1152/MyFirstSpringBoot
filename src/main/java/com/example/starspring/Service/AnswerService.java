package com.example.starspring.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.starspring.answer.Answer;
import com.example.starspring.question.Question;
import com.example.starspring.repository.AnswerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {
    
    private final AnswerRepository answerRepository;
    
    public void create(Question question, String content){
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);

        this.answerRepository.save(answer);
    }
}
