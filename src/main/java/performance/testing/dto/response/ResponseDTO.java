package performance.testing.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @author deepak.jayaprakash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ResponseDTO implements Serializable {
    private Object data;
}
