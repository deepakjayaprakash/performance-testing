package performance.testing.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import performance.testing.dto.response.ResponseDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deepak.jayaprakash
 */
@Service
@Slf4j
public class PerfService {

    @Autowired
    private AsyncService asyncService;

    public ResponseDTO getResponseForTest() {
        ResponseDTO responseDTO = new ResponseDTO();
        Map<String, String> response = new HashMap<>();
        response.put("key", "value");
        responseDTO.setData(response);
        log.info("sync : {}", Thread.currentThread().getId());
        asyncService.executeInAsync();
        return responseDTO;
    }

    public ResponseDTO getResponseInSyncForTest() {
        ResponseDTO responseDTO = new ResponseDTO();
        Map<String, String> response = new HashMap<>();
        response.put("key", "value");
        responseDTO.setData(response);
        log.info("sync : {}", Thread.currentThread().getId());
        try {
            Thread.sleep(5);
        } catch (Exception e) {
            log.error("exception ", e);
        }
        return responseDTO;
    }
}
