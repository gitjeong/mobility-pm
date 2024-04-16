package mobility.pm.controller;

import mobility.pm.service.PmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PmController {

    @Autowired
    PmService pmService;


}
