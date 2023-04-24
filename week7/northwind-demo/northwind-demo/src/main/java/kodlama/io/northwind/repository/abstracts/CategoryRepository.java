package kodlama.io.northwind.repository.abstracts;

import kodlama.io.northwind.entity.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
