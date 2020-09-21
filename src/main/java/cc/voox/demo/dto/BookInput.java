package cc.voox.demo.dto;

import cc.voox.graphql.annotation.ObjectField;
import cc.voox.graphql.annotation.ObjectType;
import lombok.Data;
import lombok.ToString;

@ObjectType(inputType = true)
@ToString
@Data
public class BookInput {
    @ObjectField
    private String name;
    @ObjectField
    private String description;
//    @ObjectField
    private String user;
}
