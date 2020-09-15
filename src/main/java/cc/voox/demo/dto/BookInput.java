package cc.voox.demo.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class BookInput {
    private String name;
    private String description;
    private String user;
}
