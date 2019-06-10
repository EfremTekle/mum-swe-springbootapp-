package edu.mum.cs.cs425.eLibrary.Bookrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.eLibrary.model.Book;
@Repository
public interface Bookrepository extends JpaRepository<Book, Long>{

}
