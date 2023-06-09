package com.example.library.service.Interface;

import com.example.library.entity.Comment;
import com.example.library.repository.CommentRepository;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    void setCommentRepository(CommentRepository commentRepository);

    Optional<Comment> findById(long id);

    List<Comment> getAll();

    void save(Comment comment);

    void delete(long id);
}
