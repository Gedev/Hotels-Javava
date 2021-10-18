package technobel.gedev.HotelsJavava.models.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDTO {
    private long id;
    private String username;

    private List<String> roles;

}
