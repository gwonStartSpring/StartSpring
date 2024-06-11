package test.crud.domain.board.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.crud.domain.board.domain.Board;
import test.crud.domain.board.domain.repository.BoardRepository;
import test.crud.domain.board.exception.BoardNotFoundException;

@Service
@RequiredArgsConstructor
@Transactional
public class DeleteBoardService {

    private final BoardRepository boardRepository;

    public void execute(Long boardId) {

        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        boardRepository.delete(board);
    }
}
