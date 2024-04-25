package mobility.pm.controller;

import mobility.pm.config.ErrorCodesAndMessagesLoader;
import mobility.pm.dto.CommonResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PmExceptionHandler {

    @ExceptionHandler({
        MethodArgumentNotValidException.class
    })
    public ResponseEntity<CommonResponseDto> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        String errorCode = "B001";

        CommonResponseDto responseDto = new CommonResponseDto();
        responseDto.setSuccess(false);
        responseDto.setErrorCode(errorCode);
        responseDto.setErrorMsg(ex.getMessage() + " " + ErrorCodesAndMessagesLoader.ERRORS.get(errorCode));

        return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
    }
}
