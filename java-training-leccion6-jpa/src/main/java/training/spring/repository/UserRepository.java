package training.spring.repository;

import org.springframework.data.repository.CrudRepository;

import training.spring.entity.User;

//Este repositorio provee un conjunto de clases para poder hacer operaciones CRUD
public interface UserRepository extends CrudRepository<User, Long>{
	
	//Busca usuario por id
	User findById(long id);
	
	//Borra usuario por id
	void deleteById(long id);
	
	

}
