package mobility.pm.dto;

import lombok.Data;
import mobility.pm.config.ErrorCodesAndMessagesLoader;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class VehicleRequestDto implements Serializable {

    private String[] operatorIds;

    @NotBlank(message = "")
    private Double latitude;

    @NotBlank(message = "")
    private Double longitude;
}
