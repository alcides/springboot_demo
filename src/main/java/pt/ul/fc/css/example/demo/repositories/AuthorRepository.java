package pt.ul.fc.css.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pt.ul.fc.css.example.demo.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE a.name LIKE %:q% OR a.surname LIKE %:q% ")
    List<Author> findByName(@Param("q") String q);

}
