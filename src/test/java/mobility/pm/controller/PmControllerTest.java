package mobility.pm.controller;

import com.google.gson.Gson;
import mobility.pm.config.ErrorCodesAndMessagesLoader;
import mobility.pm.dto.VehicleRequestDto;
import mobility.pm.repository.ErrorCodesAndMessagesRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PmControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Gson gson;

    @DisplayName("입력값 중 latitude가 null인 경우")
    @Test
    void searchVehicles_입력값_검증_null_case() throws Exception {
        // given
        final VehicleRequestDto vehicleRequestDto = new VehicleRequestDto();
        vehicleRequestDto.setLatitude(null);
        vehicleRequestDto.setLongitude(127.1111);

        //when
        final ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders.post("/api/pm")
                        .content(gson.toJson(vehicleRequestDto))
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest());

    }
}
