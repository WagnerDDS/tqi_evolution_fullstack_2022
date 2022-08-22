package tqi.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tqi.bookstore.model.BookModel;

@Repository
public interface BookRepository extends CrudRepository<BookModel, Integer> {

    // Optional<BookModel> findById(Integer id);

    // BookModel findAlBookModel();
}
