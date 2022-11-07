package com.sunglowsys.sevice;

import com.sunglowsys.domain.HotelRateCalendar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HotelRateCalendraService {

    HotelRateCalendar save(HotelRateCalendar hotelRateCalendar);

    HotelRateCalendar update(HotelRateCalendar hotelRateCalendar);

    Page<HotelRateCalendar> findAll(Pageable pageable);

    Optional<HotelRateCalendar> findById(Long id);

    void delete(Long id);
}
