package application.controller;

import application.Models.Discipline;
import application.repos.DisciplineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class DisciplineController {

    @Autowired
    private DisciplineRepo disciplineRepo;

    private static final String template = "Hello, %s!";

    @RequestMapping(
            value = {"/discipline"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Discipline> addDiscipline(@Valid @RequestBody Discipline body) {
        Discipline disc = new Discipline();
        disc.setName(body.getName());
        disciplineRepo.save(disc);
        disc.setId(disc.getId());
        return ResponseEntity.accepted().body(disc);
    }


    @RequestMapping(
            value = {"/discipline/delete"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> deleteDiscipline(@RequestParam("disciplineId") Long disciplineId) {
        disciplineRepo.deleteById(disciplineId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(
            value = {"/discipline/{disciplineId}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<Discipline> getDisciplineById(@PathVariable("disciplineId") Long disciplineId) {
        Optional<Discipline> disc1 = disciplineRepo.findById(disciplineId);
        Discipline disc = disc1.orElse(null);
        return ResponseEntity.accepted().body(disc);
    }

    @RequestMapping(
            value = {"/discipline/{disciplineId}"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> updateDiscipline(@PathVariable("disciplineId") Long disciplineId, @RequestParam(value = "name",required = true) String name) {
        Optional<Discipline> disc1 = disciplineRepo.findById(disciplineId);
        Discipline disc = disc1.orElse(null);
        if (name != null)disc.setName(name);
        disciplineRepo.save(disc);
        return new ResponseEntity(HttpStatus.OK);
    }

}