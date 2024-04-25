package mobility.pm.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OperatorResponse implements Serializable {

    private String operatorId;

    private String errorCode;

    private String errorMsg;
}
