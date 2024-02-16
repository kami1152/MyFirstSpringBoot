package com.example.starspring.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.example.starspring.answer.Answer;
import com.example.starspring.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {

    private LocalDateTime modifyDate;

    @ManyToOne
    private SiteUser author;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    // 추천 기능 작성
    @ManyToMany
    Set<SiteUser> voter;

}
// Quetion qust = new Qustion()
// qust.subject = 10