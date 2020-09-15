package cc.voox.demo.model;

import cc.voox.graphql.annotation.QueryMethod;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "book")
@Entity
@Data
@ToString
public class Book extends AbsEntity {

    private String name;
    @Column(columnDefinition = "text")
    private String description;
    @ManyToOne
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
