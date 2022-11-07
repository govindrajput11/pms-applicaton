package com.sunglowsys.controller;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.sevice.RatePlanService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class RatePlanResource {

    private final RatePlanService ratePlanService;

    public RatePlanResource(RatePlanService ratePlanService) {
        this.ratePlanService = ratePlanService;
    }

    @PostMapping("/rate-plans")
    public ResponseEntity<RatePlan> save(@RequestBody RatePlan ratePlan){
        RatePlan result = ratePlanService.save(ratePlan);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PutMapping("/rate-plans")
    public ResponseEntity<RatePlan> update(@RequestBody RatePlan ratePlan){
        RatePlan result = ratePlanService.save(ratePlan);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/rate-plans")
    public ResponseEntity<Page<RatePlan>> findAll(Pageable pageable){
        Page<RatePlan> result = ratePlanService.findAll(pageable);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/rate-plans/{id}")
    public ResponseEntity<Optional<RatePlan>> findById(@PathVariable Long id){
        Optional<RatePlan> result = ratePlanService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @DeleteMapping("/rate-plans/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        ratePlanService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
