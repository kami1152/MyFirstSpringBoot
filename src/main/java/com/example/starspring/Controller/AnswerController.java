package com.example.starspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.starspring.Service.AnswerService;
import com.example.starspring.Service.QuestionService;
import com.example.starspring.answer.AnswerForm;
import com.example.starspring.question.Question;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id,@Valid AnswerForm answerForm, BindingResult bindingResult){
        Question question = this.questionService.getQuestion(id);

        if(bindingResult.hasErrors()){
            model.addAttribute("question", question);
            return "question_detail";
        }
        //save answer
        this.answerService.create(question, answerForm.getContent());
        return String.format("redirect:/question/detail/%s",id);
    }
}
