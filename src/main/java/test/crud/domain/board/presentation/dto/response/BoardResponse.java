package test.crud.domain.board.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import test.crud.domain.board.domain.Board;

@AllArgsConstructor
@Getter
public class BoardResponse {
    private Long id;
    private String title;
    private String content;

    public BoardResponse(Board board) {
        id = board.getId();
        title = board.getTitle();
        content = board.getContent();
    }
}
