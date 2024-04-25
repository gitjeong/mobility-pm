package mobility.pm.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class VehicleRequestDto implements Serializable {

    private String[] operatorIds;

    @NotBlank(message = "latitude")
    @NotNull(message = "latitude")
    private Double latitude;

    @NotBlank(message = "longitude")
    @NotNull(message = "longitude")
    private Double longitude;
}
