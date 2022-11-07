package com.sunglowsys.controller;

import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.sevice.HotelRateCalendraService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class HotelRateCalenderResource {

    private final HotelRateCalendraService hotelRateCalendraService;

    public HotelRateCalenderResource(HotelRateCalendraService hotelRateCalendraService) {
        this.hotelRateCalendraService = hotelRateCalendraService;
    }

    @PostMapping("/hotel-rate-calenders")
    public ResponseEntity<HotelRateCalendar> save(@RequestBody HotelRateCalendar hotelRateCalendar){
        HotelRateCalendar result = hotelRateCalendraService.save(hotelRateCalendar);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PutMapping("hotel-rate-calenders")
    public ResponseEntity<HotelRateCalendar> update(@RequestBody HotelRateCalendar hotelRateCalendar){
        HotelRateCalendar result = hotelRateCalendraService.update(hotelRateCalendar);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/hotel-rate-calenders")
    public ResponseEntity<Page<HotelRateCalendar>> findAll(Pageable pageable){
        Page<HotelRateCalendar> result = hotelRateCalendraService.findAll(pageable);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/hotel-rate-calenders:{id}")
    public ResponseEntity<Optional<HotelRateCalendar>> findById(@PathVariable Long id){
        Optional<HotelRateCalendar> result = hotelRateCalendraService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @DeleteMapping("/hotel-rate-calenders:{id}")
    public ResponseEntity<HotelRateCalendar> delete(@PathVariable Long id){
        hotelRateCalendraService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
