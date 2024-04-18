package mobility.pm.mapper;

import mobility.pm.dto.ErrorCodesAndMessagesDto;
import mobility.pm.entity.ErrorCodesAndMessages;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ErrorCodesAndMessagesMapper {

    ErrorCodesAndMessagesDto entityToDto(ErrorCodesAndMessages errorCodesAndMessages);
}
