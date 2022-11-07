package com.sunglowsys.sevice.impl;


import com.sunglowsys.domain.HotelRoomType;
import com.sunglowsys.repository.HotelRoomTypeRepository;
import com.sunglowsys.sevice.HotelRoomTypeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelRoomTypeServiceImpl implements HotelRoomTypeService {

    private final HotelRoomTypeRepository hotelRoomTypeRepository;

    public HotelRoomTypeServiceImpl(HotelRoomTypeRepository hotelRoomTypeRepository) {
        this.hotelRoomTypeRepository = hotelRoomTypeRepository;
    }


    @Override
    public HotelRoomType save(HotelRoomType hotelRoomType) {
        return hotelRoomTypeRepository.save(hotelRoomType);
    }

    @Override
    public HotelRoomType update(HotelRoomType hotelRoomType) {
        return hotelRoomTypeRepository.save(hotelRoomType);
    }

    @Override
    public Page<HotelRoomType> findAll(Pageable pageable) {
        return hotelRoomTypeRepository.findAll(PageRequest.of(0,5));
    }

    @Override
    public Optional<HotelRoomType> findById(Long id) {
        return hotelRoomTypeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
       hotelRoomTypeRepository.deleteById(id);

    }
}

