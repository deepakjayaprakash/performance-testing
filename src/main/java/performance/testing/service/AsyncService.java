package performance.testing.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author deepak.jayaprakash
 */
@Component
@Slf4j
public class AsyncService {

    @Async
    public void executeInAsync() {
        log.info("executing in async : {}", Thread.currentThread().getId());
        try {
            Thread.sleep(5);
        } catch (Exception e) {
            log.error("exception ", e);
        }
    }
}
