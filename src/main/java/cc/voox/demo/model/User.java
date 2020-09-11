package cc.voox.demo.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User extends AbsEntity {

    private Integer age;
    private String name;
    private String desc;

}
