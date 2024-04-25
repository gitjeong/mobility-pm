package mobility.pm.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class CommonResponseDto implements Serializable {

    private Boolean success;

    private String errorCode;

    private String errorMsg;

    private OperatorResponse[] operatorResponses;

}
