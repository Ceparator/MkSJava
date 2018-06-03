package application.controller;

import application.Models.Question;
import application.Models.YMK;
import application.repos.YMKRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class YMKController {

    @Autowired
    private YMKRepo ymkRepo;

    private static final String template = "Hello, %s!";

    @RequestMapping(
            value = {"/ymk"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<YMK> addYMK(@Valid @RequestBody YMK body) {
        YMK ymk = new YMK();
        ymk.setSpeciality(body.getSpeciality());
        ymk.setDiscipline(body.getDiscipline());
        ymkRepo.save(ymk);
        ymk.setId(ymk.getId());
        return ResponseEntity.accepted().body(ymk);
    }

    @RequestMapping(
            value = {"/ymk/delete"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> deleteYMK(@RequestParam("ymkId") Long ymkId) {
        ymkRepo.deleteById(ymkId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(
            value = {"/ymk/{ymkId}/question"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<YMK> addQuestion(@PathVariable("ymkId") Long ymkId, @RequestParam("questionId") Integer questionId) {
        Optional<YMK> ymk1 = ymkRepo.findById(ymkId);
        YMK ymk = ymk1.orElse(null);
        List<Integer> integerList = ymk.getQuestions();
        integerList.add(questionId);
        ymk.setQuestions(integerList);
        ymkRepo.save(ymk);
        return ResponseEntity.accepted().body(ymk);
    }

    @RequestMapping(
            value = {"/ymk/{ymkId}/work"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<YMK> addWork(@PathVariable("ymkId") Long ymkId, @RequestParam("workId") Integer workId) {
        Optional<YMK> ymk1 = ymkRepo.findById(ymkId);
        YMK ymk = ymk1.orElse(null);
        List<Integer> integerList = ymk.getWorks();
        integerList.add(workId);
        ymk.setWorks(integerList);
        ymkRepo.save(ymk);
        return ResponseEntity.accepted().body(ymk);
    }

    @RequestMapping(
            value = {"/ymk/{ymkId}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<YMK> getYMKById(@PathVariable("ymkId") Long ymkId) {
        Optional<YMK> ymk1 = ymkRepo.findById(ymkId);
        YMK ymk = ymk1.orElse(null);
        return ResponseEntity.accepted().body(ymk);
    }
}