package mobility.pm.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ErrorCodesAndMessagesDto implements Serializable {

    private String errorCode;
    private String errorMessage;
}
