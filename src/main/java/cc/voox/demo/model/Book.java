package cc.voox.demo.model;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book extends AbsEntity {

    private String name;
    private String desc;
    private User user;
}
