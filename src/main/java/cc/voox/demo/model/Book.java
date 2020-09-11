package cc.voox.demo.model;

import cc.voox.graphql.annotation.QueryMethod;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book extends AbsEntity {

    private String name;
    private String desc;
    private User user;
    /**
     * can code in resolver(service) if there is some effect
     * otherwise we can use model on easy way
     */
    @QueryMethod
    private User owner() {
        return user;
    }
}
