package com.bookStore.bookStore.resposity;

import com.bookStore.bookStore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReponsity extends JpaRepository<Book,Integer> {
 // nativeQuery

}
