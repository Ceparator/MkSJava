package application.controller;

import application.Models.*;
import application.repos.SpecialityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class SpecialityController {

    @Autowired
    private SpecialityRepo specRepo;


    private static final String template = "Hello, %s!";


    @RequestMapping(value = "/speciality",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<Speciality> addSpeciality(@Valid @RequestBody Speciality body) {
        Speciality spec = new Speciality();
        spec.setCode(body.getCode());
        spec.setName(body.getName());
        specRepo.save(spec);
        spec.setId(spec.getId());
        return ResponseEntity.accepted().body(spec);
    }

    @RequestMapping(value = "/speciality/delete",
            produces = { "application/json" },
            consumes = { "application/x-www-form-urlencoded" },
            method = RequestMethod.POST)
    public ResponseEntity<Void> deleteSpeciality(@RequestParam(value = "specialityId",required = true) Long specialityId) {
        specRepo.deleteById(specialityId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(
            value = {"/speciality/{specialityId}"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> updateSpeciality(@PathVariable("specialityId") Long specialityId, @RequestParam(value = "name",required = false) String name, @RequestParam(value = "code",required = false) Long code) {
        Optional<Speciality> spec1 = specRepo.findById(specialityId);
        Speciality spec = spec1.orElse(null);
        if (name != null)spec.setName(name);
        if (code != null) spec.setCode(code);
        specRepo.save(spec);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(
            value = {"/speciality/{specialityId}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<Speciality> getSpecialityById(@PathVariable("specialityId") Long specialityId) {
        Optional<Speciality> spec1 = specRepo.findById(specialityId);
        Speciality spec = spec1.orElse(null);
        return ResponseEntity.accepted().body(spec);
    }
}