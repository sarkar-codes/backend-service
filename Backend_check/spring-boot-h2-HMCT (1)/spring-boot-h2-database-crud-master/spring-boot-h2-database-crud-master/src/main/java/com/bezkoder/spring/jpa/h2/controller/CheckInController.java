package com.bezkoder.spring.jpa.h2.controller;

import com.bezkoder.spring.jpa.h2.model.CheckInDB;
import com.bezkoder.spring.jpa.h2.model.Country;
import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.bezkoder.spring.jpa.h2.repository.CheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CheckInController {
    @Autowired
    CheckInRepository checkInRepository;

    @GetMapping("/checkIn")
    public ResponseEntity<List<CheckInDB>> checkIn(@RequestParam(required = false) String checkInId,
                                                   @RequestParam(required = false) Integer filtereddays) {
        try {
            List<CheckInDB> tutorials = new ArrayList<CheckInDB>();

            if (checkInId == null)
                checkInRepository.findAll().forEach(tutorials::add);
            else
                checkInRepository.findByCheckInId(checkInId).forEach(tutorials::add);

            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            List<CheckInDB> filteredResults = new ArrayList<CheckInDB>();
            for(CheckInDB eachcheckin:tutorials){
                Calendar cal = Calendar.getInstance();
                Date date = new Date();
                cal.setTime(date);// w ww.  j ava  2  s  .co m
                cal.add(Calendar.DATE, -Math.abs(filtereddays)); //minus number would decrement the days
                Timestamp before_90_days = new Timestamp(cal.getTime().getTime());
                int b3 = before_90_days.compareTo(eachcheckin.getTimestamp());
                if (b3==0 || b3<0)
                {
                    filteredResults.add(eachcheckin);
                }
            }



            return new ResponseEntity<>(filteredResults, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/checkIn/{id}")
    public ResponseEntity<CheckInDB> checkInById(@PathVariable("id") long id) {
        Optional<CheckInDB> checkInDB = checkInRepository.findById(id);

        if (checkInDB.isPresent()) {
            return new ResponseEntity<CheckInDB>(checkInDB.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<CheckInDB>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/checkIn")
    public ResponseEntity<CheckInDB> checkIn(@RequestBody CheckInDB checkInDB) {
        try {

            CheckInDB _checkInDb = checkInRepository
                    .save(checkInDB);
            return new ResponseEntity<>(_checkInDb, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
