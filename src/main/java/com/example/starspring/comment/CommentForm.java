package com.example.starspring.comment;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentForm {

    @NotEmpty(message = "내용을 입력하셔야 합니다.")
    private String content;
}
