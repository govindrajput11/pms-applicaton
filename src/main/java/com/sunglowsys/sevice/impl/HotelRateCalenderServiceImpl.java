package com.sunglowsys.sevice.impl;

import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.repository.HotelRateCalenderRepository;
import com.sunglowsys.sevice.HotelRateCalendraService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelRateCalenderServiceImpl implements HotelRateCalendraService {

    private final HotelRateCalenderRepository hotelRateCalenderRepository;

    public HotelRateCalenderServiceImpl(HotelRateCalenderRepository hotelRateCalenderRepository) {
        this.hotelRateCalenderRepository = hotelRateCalenderRepository;
    }

    @Override
    public HotelRateCalendar save(HotelRateCalendar hotelRateCalendar) {

        return hotelRateCalenderRepository.save(hotelRateCalendar);
    }

    @Override
    public HotelRateCalendar update(HotelRateCalendar hotelRateCalendar) {

        return hotelRateCalenderRepository.save(hotelRateCalendar);
    }

    @Override
    public Page<HotelRateCalendar> findAll(Pageable pageable) {

        return hotelRateCalenderRepository.findAll(PageRequest.of(0,5));
    }

    @Override
    public Optional<HotelRateCalendar> findById(Long id) {

        return hotelRateCalenderRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        hotelRateCalenderRepository.deleteById(id);

    }
}
