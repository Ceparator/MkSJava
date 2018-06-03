package application.controller;

import application.Models.SimpleAnswer;
import application.Models.User;
import application.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    private static final String template = "Hello, %s!";

    @RequestMapping(
            value = {"/user/{username}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<User> getUserByName(@PathVariable("username") String username) {
        return ResponseEntity.accepted().body(userRepo.findUserByName(username));
    }

    @RequestMapping(
            value = {"/user/role/{rolename}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<List<User>> getUsersInRole(@PathVariable("rolename") String rolename) {
        List<User> userList = userRepo.findUserByRole(rolename);
        return ResponseEntity.accepted().body(userList);
    }

    @RequestMapping(
            value = {"/user/login"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<SimpleAnswer> loginUser(@RequestParam(value = "username",required = true) String username, @RequestParam(value = "password",required = true) String password) {
        User user = userRepo.findUserByCredentials(username,password);
        if (user != null) {
            SimpleAnswer ans = new SimpleAnswer();
            ans.setText("Success login into the system");
            return ResponseEntity.accepted().body(ans);
        }
        else {
            SimpleAnswer ans = new SimpleAnswer();
            ans.setText("Incorrect login or password");
            return ResponseEntity.accepted().body(ans);
        }
    }

    @RequestMapping(
            value = {"/user/register"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<User> userRegisterPost(@RequestParam(value = "username",required = true) String username, @RequestParam(value = "password",required = true) String password, @RequestParam(value = "name",required = true) String name, @RequestParam(value = "surename",required = true) String surename, @RequestParam(value = "phone",required = true) String phone) {
        User myuser = new User();
        myuser.setUsername(username);
        myuser.setFirstName(name);
        myuser.setLastName(surename);
        myuser.setPassword(password);
        myuser.setPhone(phone);
        myuser.setRole("student");
        userRepo.save(myuser);
        return ResponseEntity.accepted().body(myuser);
    }


}