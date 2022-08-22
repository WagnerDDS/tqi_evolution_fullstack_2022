package tqi.bookstore.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 100, nullable = false)
    private String author;

    @Column(length = 50)
    private String publisher;

    @Column(length = 50)
    private String image;

    @Column(name = "year_of_pub", length = 4)
    private int yearOfPub;

    @Column(name = "qtd_in_stock")
    private Integer qtdInStock;

    @Column(nullable = false)
    private float unitPrice;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getYearOfPub() {
        return this.yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public Integer getQtdInStock() {
        return qtdInStock;
    }

    public void setQtdInStock(Integer qtdInStock) {
        this.qtdInStock = qtdInStock;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", image=" + image + ", publisher=" + publisher
                + ", qtdInStock=" + qtdInStock + ", title=" + title + ", unitPrice=" + unitPrice + ", yearOfPub="
                + yearOfPub + "]";
    }

}
