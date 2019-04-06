package pl.bykowski.springboothibernate.twowaybinding;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatesRepo extends CrudRepository<Plates, Long> {
}
