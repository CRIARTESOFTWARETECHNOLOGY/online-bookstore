package in.bushansirgur.onlinebookstore.full.stack.developement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bushansirgur.onlinebookstore.full.stack.developement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
