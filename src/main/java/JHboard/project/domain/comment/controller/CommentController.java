package JHboard.project.domain.comment.controller;

import JHboard.project.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CommentController {

  private final CommentService commentService;
}