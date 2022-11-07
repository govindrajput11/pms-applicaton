package com.sunglowsys.sevice.impl;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.repository.HotelRepository;
import com.sunglowsys.sevice.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
    private final Logger logger = LoggerFactory.getLogger(HotelService.class);

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel save(Hotel hotel) {
        logger.debug("REST request to save the Hotel:{}",hotel);
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        logger.debug("Rest request to update Hotel:{}");
        return hotelRepository.save(hotel);
    }

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        logger.debug("Rest request to find all hotel:{}");
        return hotelRepository.findAll(PageRequest.of(0,5));
    }

    @Override
    public Optional<Hotel> findOne(Long id) {
        logger.debug("Rest request to find one Hotel:{}");
        return hotelRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("Rest request to delete Hotel:{}");
        hotelRepository.deleteById(id);

    }
}
