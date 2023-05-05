package in.project.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.project.bookish.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
