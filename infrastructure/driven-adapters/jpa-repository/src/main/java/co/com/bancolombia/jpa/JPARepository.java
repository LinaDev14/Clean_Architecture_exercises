package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.data.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<UserData/* change for adapter model */, Long>, QueryByExampleExecutor<UserData/* change for adapter model */> {
}
