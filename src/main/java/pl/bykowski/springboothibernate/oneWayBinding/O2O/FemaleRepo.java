package pl.bykowski.springboothibernate.oneWayBinding.O2O;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FemaleRepo extends CrudRepository<Female, Long> {
}
