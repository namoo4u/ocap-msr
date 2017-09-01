package ocap.msr.repository;

import org.springframework.data.repository.CrudRepository;

import ocap.msr.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
