package dio.design.patterns.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.design.patterns.spring.entities.Endereco;

@Repository
public interface ClienteRepository extends CrudRepository <Endereco, String> {
    
}
