package mobility.pm.controller;

import mobility.pm.dto.VehicleRequestDto;
import mobility.pm.service.PmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/pm")
@Validated
public class PmController {

    @Autowired
    private PmService pmService;

    @PostMapping("")
    public ResponseEntity<String> searchVehicles(@RequestBody @Valid VehicleRequestDto vehicleRequestDto) throws Exception {

        return new ResponseEntity<>(String.valueOf(vehicleRequestDto.getLatitude()), HttpStatus.OK);
    }
}
