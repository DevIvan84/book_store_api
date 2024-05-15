package com.todotic.bookstoreapi.repository;

import com.todotic.bookstoreapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    boolean existsBySlug(String slug);

    boolean existsBySlugAndIdNot(String slug, Integer id);
}
