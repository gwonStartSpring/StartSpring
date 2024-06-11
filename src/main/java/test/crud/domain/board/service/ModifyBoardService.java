package test.crud.domain.board.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.crud.domain.board.domain.Board;
import test.crud.domain.board.domain.repository.BoardRepository;
import test.crud.domain.board.exception.BoardNotFoundException;
import test.crud.domain.board.presentation.dto.request.ModifyBoardRequest;
import test.crud.domain.user.facede.UserFacade;

@Service
@RequiredArgsConstructor
@Transactional
public class ModifyBoardService {

    private final BoardRepository boardRepository;

    public void execute(Long boardId, ModifyBoardRequest request) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        board.modifyBoard(request.getTitle(), request.getContent());

    }
}
