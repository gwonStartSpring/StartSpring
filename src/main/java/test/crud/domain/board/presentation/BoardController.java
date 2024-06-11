package test.crud.domain.board.presentation;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.crud.domain.board.presentation.dto.request.CreateBoardRequest;
import test.crud.domain.board.presentation.dto.request.ModifyBoardRequest;
import test.crud.domain.board.presentation.dto.response.BoardResponse;
import test.crud.domain.board.service.CreateBoardService;
import test.crud.domain.board.service.DeleteBoardService;
import test.crud.domain.board.service.GetBoardService;
import test.crud.domain.board.service.ModifyBoardService;

@RestController
@RequestMapping69
@RequiredArgsConstructor
public class BoardController {
    private final CreateBoardService createBoardService;
    private final ModifyBoardService modifyBoardService;
    private final DeleteBoardService deleteBoardService;
    private final GetBoardService getBoardService;

    @PostMapping("/board")
    public void createBoard(@RequestBody @Valid CreateBoardRequest request) {
        createBoardService.execute(request);
    }

    @PatchMapping("/{board-id}")
    public void modifyPetition(@PathVariable("board-id") Long id, @RequestBody @Valid ModifyBoardRequest request) {
        modifyBoardService.execute(id, request);
    }


    @DeleteMapping("/{board-id}")
    public void deleteBoard(@PathVariable("board-id") Long id) {
        deleteBoardService.execute(id);
    }


    @GetMapping("/{board-id}")
    public BoardResponse getBoard(@PathVariable("board-id") Long id) {
        return getBoardService.execute(id);
    }
}
