package cc.voox.demo.model;

import cc.voox.graphql.IGraphQL;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@MappedSuperclass
public abstract class AbsEntity implements IGraphQL, Serializable {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
}
