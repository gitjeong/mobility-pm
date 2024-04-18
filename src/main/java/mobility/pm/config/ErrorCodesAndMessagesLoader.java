package mobility.pm.config;

import jakarta.annotation.PostConstruct;
import mobility.pm.dto.ErrorCodesAndMessagesDto;
import mobility.pm.mapper.ErrorCodesAndMessagesMapper;
import mobility.pm.repository.ErrorCodesAndMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ErrorCodesAndMessagesLoader {

    @Autowired
    private ErrorCodesAndMessagesRepository repository;

    public static Map<String, String> ERRORS = new HashMap<>();

    @PostConstruct
    public void init() {
        repository.findAll().stream().map(ecam -> ERRORS.put(ecam.getErrorCode(), ecam.getErrorMessage()));
    }
}