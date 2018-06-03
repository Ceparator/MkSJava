package application.controller;

import application.Models.Question;
import application.repos.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class QuestionController {

    @Autowired
    private QuestionRepo questionRepo;


    private static final String template = "Hello, %s!";

    @RequestMapping(
            value = {"/question"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Question> addQuestion(@Valid @RequestBody Question body) {
        Question quest = new Question();
        quest.setName(body.getName());
        quest.setYmkId(body.getYmkId());
        questionRepo.save(quest);
        quest.setId(quest.getId());
        return ResponseEntity.accepted().body(quest);
    }

    @RequestMapping(
            value = {"/question/delete"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> deleteQuestion(@RequestParam("questionId") Long questionId) {
        questionRepo.deleteById(questionId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(
            value = {"/question/{questionId}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<Question> getQuestionById(@PathVariable("questionId") Long questionId) {
        Optional<Question> quest1 = questionRepo.findById(questionId);
        Question quest = quest1.orElse(null);
        return ResponseEntity.accepted().body(quest);
    }

    @RequestMapping(
            value = {"/question/{questionId}"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> updateQuestion(@PathVariable("questionId") Long questionId, @RequestParam(value = "question",required = true) String question) {
        Optional<Question> quest1 = questionRepo.findById(questionId);
        Question quest = quest1.orElse(null);
        if (question != null)quest.setName(question);
        questionRepo.save(quest);
        return new ResponseEntity(HttpStatus.OK);
    }

}