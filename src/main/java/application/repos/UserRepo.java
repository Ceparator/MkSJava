package application.repos;

import application.Models.Speciality;
import application.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.management.Query;
import java.util.List;


public interface UserRepo extends CrudRepository<User, Long>{

    @org.springframework.data.jpa.repository.Query("select user from User user where user.username = :name")
    public User findUserByName(@Param("name") String name);

    @org.springframework.data.jpa.repository.Query("select user from User user where user.role = :role")
    public List<User> findUserByRole(@Param("role") String role);

    @org.springframework.data.jpa.repository.Query("select user from User user where user.username = :username and user.password = :password")
    public User findUserByCredentials(@Param("username") String username,@Param("password") String password);
}
