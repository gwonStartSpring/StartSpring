package test.crud.domain.board.exception;

import ch.qos.logback.core.spi.ErrorCodes;

public class BoardNotFoundException extends BusinessException{
    public static final BusinessException EXCEPTION = new BoardNotFoundException();

    private BoardNotFoundException() { super (ErrorCode.BOARD_NOT_FOUND);}
}
