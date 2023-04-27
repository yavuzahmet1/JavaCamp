package kodlama.io.northwind.service.concretes;

import kodlama.io.northwind.core.dataAccess.UserRepository;
import kodlama.io.northwind.core.entities.User;
import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.core.utilities.result.SuccessDataResult;
import kodlama.io.northwind.core.utilities.result.SuccessResult;
import kodlama.io.northwind.service.abstracts.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Result add(User user) {
        this.userRepository.save(user);
        return new SuccessResult("User Added !");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userRepository.findByEmail(email), "Email find !");
    }
}
