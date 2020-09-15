package cc.voox.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "users")
@Data
@ToString
public class User extends AbsEntity {

    private Integer age;
    private String name;
    @Column(columnDefinition = "text")
    private String description;

}
