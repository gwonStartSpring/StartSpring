package test.crud.domain.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.crud.domain.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
