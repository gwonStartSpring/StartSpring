package test.crud.domain.user.domain.repository;

import org.springframework.data.repository.CrudRepository;
import test.crud.domain.user.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
