package mobility.pm.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class VehicleRequestDto implements Serializable {

    private String serviceId;
    private String[] operatorIds;
    private Double latitude;
    private Double longitude;
}
