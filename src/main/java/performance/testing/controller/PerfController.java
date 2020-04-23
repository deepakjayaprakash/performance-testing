package performance.testing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import performance.testing.dto.response.ResponseDTO;
import performance.testing.service.PerfService;

/**
 * @author deepak.jayaprakash
 */
@RestController
@RequestMapping(value = "/performance")
@Slf4j
public class PerfController {

    @Autowired
    private PerfService perfService;

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO testAPI() {
        ResponseDTO responseDTO = null;
        try {
            responseDTO = perfService.getResponseForTest();
        } catch (Exception e) {
            log.error("exception_in_test_api", e);
        }
        log.info("test_api_response: {}", responseDTO);
        return responseDTO;
    }
}
