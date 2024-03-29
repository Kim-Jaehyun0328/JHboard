package JHboard.project.domain.like.service;

import JHboard.project.domain.board.entity.Board;
import JHboard.project.domain.like.entity.Like;
import JHboard.project.domain.member.entity.Member;
import java.util.List;
import java.util.Optional;

public interface LikeService {
  Optional<Like> findById(Long likeId);

  List<Like> findAll();

  Like create(Like like);

  void delete(Long likeId);

  boolean saveLike(Long boardId, Long memberId);

  boolean findLike(Long boardId, Long memberId);

}
