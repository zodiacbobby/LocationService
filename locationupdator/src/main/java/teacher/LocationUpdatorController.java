package teacher;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teacher on 7/3/17.
 */
@RestController
public class LocationUpdatorController {

    @MessageMapping("/sendMessage")
    @SendTo("/queue/vehicles")
    public String sendMessage(String message) throws Exception {
        return message;
    }
}

