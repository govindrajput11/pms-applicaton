package com.sunglowsys.sevice;

import com.sunglowsys.domain.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface HotelService {

    Hotel save(Hotel hotel);

    Hotel update(Hotel hotel);


    Page<Hotel> findAll(Pageable pageable);

    Optional<Hotel> findOne(Long id);


    void delete(Long id);
}
