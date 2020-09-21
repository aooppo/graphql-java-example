package cc.voox.demo.model;

import cc.voox.graphql.IGraphQL;
import cc.voox.graphql.annotation.ObjectField;
import cc.voox.graphql.annotation.ObjectType;
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
@ObjectType
public abstract class AbsEntity implements IGraphQL, Serializable {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ObjectField
    private Long id;
}
