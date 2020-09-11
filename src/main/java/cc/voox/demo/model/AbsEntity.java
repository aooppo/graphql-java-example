package cc.voox.demo.model;

import cc.voox.graphql.IGraphQL;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class AbsEntity implements IGraphQL {
    @EqualsAndHashCode.Include
    private Long id;
}
