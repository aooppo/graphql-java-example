package cc.voox.demo.dto;

import cc.voox.graphql.annotation.ObjectField;
import cc.voox.graphql.annotation.ObjectType;
import lombok.Data;
import lombok.ToString;

@ObjectType(inputType = true)
@ToString
@Data
public class UserInput {
    @ObjectField
    private Integer age;
    @ObjectField
    private String name;
    @ObjectField
    private String description;
}
