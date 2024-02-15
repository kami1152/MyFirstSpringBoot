package com.example.starspring.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자 ID는 필수 항목 입니다")
    private String username;

    @NotEmpty(message = "패스워드는 필수 항목 입니다")
    private String password1;

    @NotEmpty(message = "패스워드 항목은 필수 항목 입니다")
    private String password2;

    @NotEmpty(message = "이메일은 필수 항목 입니다.")
    @Email
    private String email;
}
