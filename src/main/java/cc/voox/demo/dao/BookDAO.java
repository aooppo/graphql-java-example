package cc.voox.demo.dao;

import cc.voox.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDAO extends JpaRepository<Book, Long> {
}
