package cc.voox.demo;

import cc.voox.demo.constant.MockDB;
import cc.voox.graphql.EnableGraphQL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableGraphQL
@SpringBootApplication
public class GraphQLDemoApplication {

    public static void main(String[] args) {
        MockDB.init();
        SpringApplication.run(GraphQLDemoApplication.class, args);

    }

}
