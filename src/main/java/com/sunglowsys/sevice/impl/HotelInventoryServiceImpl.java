package com.sunglowsys.sevice.impl;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.repository.HotelInventoryRepository;
import com.sunglowsys.sevice.HotelInventoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelInventoryServiceImpl implements HotelInventoryService {

    private final HotelInventoryRepository hotelInventoryRepository;

    public HotelInventoryServiceImpl(HotelInventoryRepository hotelInventoryRepository) {
        this.hotelInventoryRepository = hotelInventoryRepository;
    }

    @Override
    public HotelInventory save(HotelInventory hotelInventory) {
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public HotelInventory update(HotelInventory hotelInventory ) {
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public Page<HotelInventory> findAll(Pageable pageable) {
        return hotelInventoryRepository.findAll(PageRequest.of(0,5));
    }

    @Override
    public Optional<HotelInventory> findById(Long id) {
        return hotelInventoryRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        hotelInventoryRepository.deleteById(id);

    }
}
