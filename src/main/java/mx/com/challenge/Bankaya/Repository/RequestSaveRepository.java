package mx.com.challenge.Bankaya.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.challenge.Bankaya.Entity.RequestSaveEntity;

@Repository
public interface RequestSaveRepository extends CrudRepository<RequestSaveEntity, Integer> {

}
