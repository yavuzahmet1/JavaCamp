package kodlama.io.northwind.core.dataAccess;

import kodlama.io.northwind.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
