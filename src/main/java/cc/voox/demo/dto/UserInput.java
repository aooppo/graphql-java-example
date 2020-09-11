package cc.voox.demo.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class UserInput {
    private Integer age;
    private String name;
    private String desc;
}
