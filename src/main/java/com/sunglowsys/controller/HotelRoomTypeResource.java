package com.sunglowsys.controller;

import com.sunglowsys.domain.HotelRoomType;
import com.sunglowsys.sevice.HotelRoomTypeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class HotelRoomTypeResource {

    private final HotelRoomTypeService hotelRoomTypeService;

    public HotelRoomTypeResource(HotelRoomTypeService hotelRoomTypeService) {
        this.hotelRoomTypeService = hotelRoomTypeService;
    }

    @PostMapping("/hotel_room_types")
    public ResponseEntity<HotelRoomType> save(@RequestBody HotelRoomType hotelRoomType){
        HotelRoomType result = hotelRoomTypeService.save(hotelRoomType);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PutMapping("/hotel_room_types")
    public ResponseEntity<HotelRoomType> update(@RequestBody HotelRoomType hotelRoomType){
        HotelRoomType result = hotelRoomTypeService.save(hotelRoomType);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);

    }

    @GetMapping("/hotel_room_types")
    public ResponseEntity<Page<HotelRoomType>> findAll(Pageable pageable){
        Page<HotelRoomType> result = hotelRoomTypeService.findAll(pageable);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("hotel_room_types/{id}")
    public ResponseEntity<Optional<HotelRoomType>> findById(@PathVariable Long id){
        Optional<HotelRoomType> result = hotelRoomTypeService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @DeleteMapping("/hotel_room_types/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        hotelRoomTypeService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
