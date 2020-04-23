package performance.testing.service;

import org.springframework.stereotype.Service;
import performance.testing.dto.response.ResponseDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deepak.jayaprakash
 */
@Service
public class PerfService {

    public ResponseDTO getResponseForTest() {
        ResponseDTO responseDTO = new ResponseDTO();
        Map<String, String> response = new HashMap<>();
        response.put("key", "value");
        responseDTO.setData(response);
        return responseDTO;
    }
}
