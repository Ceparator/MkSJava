package application.repos;

import application.Models.Discipline;
import application.Models.Speciality;
import org.springframework.data.repository.CrudRepository;


public interface DisciplineRepo extends CrudRepository<Discipline, Long>{
}
