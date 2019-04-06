package pl.bykowski.springboothibernate.oneWayBinding.O2M;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends CrudRepository<Teacher, Long>{
}
