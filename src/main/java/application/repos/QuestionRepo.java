package application.repos;

import application.Models.Question;
import application.Models.Speciality;
import org.springframework.data.repository.CrudRepository;


public interface QuestionRepo extends CrudRepository<Question, Long>{
}
