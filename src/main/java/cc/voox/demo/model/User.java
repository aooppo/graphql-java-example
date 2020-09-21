package cc.voox.demo.model;

import cc.voox.graphql.annotation.ObjectField;
import cc.voox.graphql.annotation.ObjectType;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "users")
@Data
@ToString
@ObjectType
public class User extends AbsEntity {
    @ObjectField
    private Integer age;
    @ObjectField
    private String name;
    @ObjectField
    @Column(columnDefinition = "text")
    private String description;

}
