package mobility.pm.controller;

import mobility.pm.dto.VehicleRequestDto;
import mobility.pm.service.PmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/pm")
public class PmController {

    @Autowired
    PmService pmService;

    @PostMapping("")
    public ResponseEntity<String> searchVehicles(@RequestBody VehicleRequestDto vehicleRequestDto) {

        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
