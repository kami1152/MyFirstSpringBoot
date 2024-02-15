package com.example.starspring.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.starspring.answer.Answer;
import com.example.starspring.question.Question;
import com.example.starspring.repository.AnswerRepository;
import com.example.starspring.user.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public Answer create(Question question, String content, SiteUser author) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answer.setAuthor(author);

        this.answerRepository.save(answer);

        return answer;
    }
}
