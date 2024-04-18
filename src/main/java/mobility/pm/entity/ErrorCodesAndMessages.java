package mobility.pm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ErrorCodesAndMessages {

    @Id
    private String errorCode;

    private String errorMessage;

    public ErrorCodesAndMessages() {}

    public ErrorCodesAndMessages(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
