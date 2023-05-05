/**
 * 
 */
package in.project.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.project.bookish.entity.Book;

/**
 * @author lenovo1
 *
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
