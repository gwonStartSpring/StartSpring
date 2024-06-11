package test.crud.domain.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.crud.domain.board.domain.Board;
import test.crud.domain.board.domain.repository.BoardRepository;
import test.crud.domain.board.exception.BoardNotFoundException;
import test.crud.domain.board.presentation.dto.response.BoardResponse;

@Service
@RequiredArgsConstructor
@Transactional
public class GetBoardService {
    private final BoardRepository boardRepository;

    public BoardResponse execute(Long boardId) {

        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        return new BoardResponse(board);

    }
}
