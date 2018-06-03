package application.repos;

import application.Models.Speciality;
import application.Models.Work;
import org.springframework.data.repository.CrudRepository;


public interface WorkRepo extends CrudRepository<Work, Long>{
}
