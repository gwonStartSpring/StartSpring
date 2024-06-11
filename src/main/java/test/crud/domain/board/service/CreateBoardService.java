package test.crud.domain.board.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.crud.domain.board.domain.Board;
import test.crud.domain.board.domain.repository.BoardRepository;
import test.crud.domain.board.presentation.dto.request.CreateBoardRequest;

@Service
@RequiredArgsConstructor
@Transactional
public class CreateBoardService {

    private final BoardRepository boardRepository;

    public void execute(CreateBoardRequest request){

        boardRepository.save(
                Board.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .build()
        );

    }
}
