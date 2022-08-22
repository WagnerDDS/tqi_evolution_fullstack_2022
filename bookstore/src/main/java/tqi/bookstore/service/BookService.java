package tqi.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tqi.bookstore.model.BookModel;
import tqi.bookstore.model.ResponseModel;
import tqi.bookstore.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository br;

    @Autowired
    private ResponseModel rm;

    // método para listar todos os livros
    public Iterable<BookModel> listBooks() {
        return br.findAll();
    }

    // método para castrar ou alterar livros
    // action r = register
    // action u = update
    public ResponseEntity<?> registerUpdateBook(BookModel bm, String action) {
        if (bm.getTitle().equals("")) {
            rm.setMessage("Título do livro não informado. Favor, preencha o campo 'Título'.");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        } else if (bm.getAuthor().equals("")) {
            rm.setMessage("Autor não informado. Favor preencher o campo 'Autor'.");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        } else if (bm.getPublisher().equals("")) {
            rm.setMessage("Editora não informada. Favor preencher o campo 'Editora'.");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);

        } else {
            return new ResponseEntity<BookModel>(br.save(bm), action == "r" ? HttpStatus.CREATED : HttpStatus.OK);
        }
    }

    // método para remover livros
    public ResponseEntity<ResponseModel> deleteBook(Integer bookId) {
        br.deleteById(bookId);
        rm.setMessage("Removido com sucesso!");
        return new ResponseEntity<ResponseModel>(rm, HttpStatus.OK);
    }

}
