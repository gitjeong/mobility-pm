package mobility.pm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "mis")
@Getter
@Setter
public class ErrorCodesAndMessages {

    @Id
    private String code;

    private String message;

    public ErrorCodesAndMessages() {}

    public ErrorCodesAndMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
