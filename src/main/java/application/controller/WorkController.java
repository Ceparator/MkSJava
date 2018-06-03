package application.controller;

import application.Models.Work;
import application.repos.WorkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class WorkController {

    @Autowired
    private WorkRepo workRepo;

    private static final String template = "Hello, %s!";

    @RequestMapping(
            value = {"/work"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Work> addWork(@Valid @RequestBody Work body) {
        Work work = new Work();
        work.setWorkType(body.getWorkType());
        work.setHours(body.getHours());
        work.setWeek(body.getWeek());
        work.setYmkId(body.getYmkId());
        workRepo.save(work);
        work.setId(work.getId());
        return ResponseEntity.accepted().body(work);
    }

    @RequestMapping(
            value = {"/work/delete"},
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<Void> deleteWork(@RequestParam("workId") Long workId) {
        workRepo.deleteById(workId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(
            value = {"/work/{workId}"},
            produces = {"application/json"},
            method = {RequestMethod.GET}
    )
    public ResponseEntity<Work> getWorkById(@PathVariable("workId") Long workId) {
        Optional<Work> work1 = workRepo.findById(workId);
        Work work = work1.orElse(null);
        return ResponseEntity.accepted().body(work);
    }
}