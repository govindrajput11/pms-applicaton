package com.sunglowsys.controller;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.sevice.HotelInventoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class HotelInventoryResource {

    private final HotelInventoryService hotelInventoryService;

    public HotelInventoryResource(HotelInventoryService hotelInventoryService) {
        this.hotelInventoryService = hotelInventoryService;
    }

    @PostMapping("/hotel_inventories")
    public ResponseEntity<HotelInventory> save(@RequestBody HotelInventory hotelInventory){
        HotelInventory result = hotelInventoryService.save(hotelInventory);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PutMapping("/hotel_inventories")
    public ResponseEntity<HotelInventory> update(@RequestBody HotelInventory hotelInventory){
        HotelInventory result = hotelInventoryService.update(hotelInventory);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/hotel_inventories")
    public ResponseEntity<Page<HotelInventory>> findAll(Pageable pageable){
        Page<HotelInventory> result = hotelInventoryService.findAll(pageable);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("hotel_inventories/{id}")
    public ResponseEntity<Optional<HotelInventory>> findById(@PathVariable Long id){
        Optional<HotelInventory> result = hotelInventoryService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @DeleteMapping("/hotel_inventories/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        hotelInventoryService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
