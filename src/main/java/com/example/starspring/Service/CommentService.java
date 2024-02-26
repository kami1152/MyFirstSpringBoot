package com.example.starspring.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.starspring.DataNotFoundException;
import com.example.starspring.comment.Comment;
import com.example.starspring.question.Question;
import com.example.starspring.repository.CommentRepository;
import com.example.starspring.user.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public Comment create(Question question, String content, SiteUser author) {
        Comment c = new Comment();
        c.setContent(content);
        c.setCreateDate(LocalDateTime.now());
        c.setQuestion(question);
        c.setAuthor(author);
        c = this.commentRepository.save(c);
        return c;
    }

    public Comment getComment(Integer id) {
        Optional<Comment> comment = this.commentRepository.findById(id);
        if (comment.isPresent()) {
            return comment.get();
        } else {
            throw new DataNotFoundException("not comments");
        }
    }

    public Comment modify(Comment comment, String content) {
        comment.setContent(content);
        comment.setModifyDate(LocalDateTime.now());
        comment = this.commentRepository.save(comment);
        return comment;
    }

    public void delete(Comment comment) {
        this.commentRepository.delete(comment);
    }

}
