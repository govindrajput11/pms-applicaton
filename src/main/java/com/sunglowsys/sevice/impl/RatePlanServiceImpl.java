package com.sunglowsys.sevice.impl;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.repository.RatePlanRepository;
import com.sunglowsys.sevice.RatePlanService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RatePlanServiceImpl implements RatePlanService {

    private final RatePlanRepository ratePlanRepository;

    public RatePlanServiceImpl(RatePlanRepository ratePlanRepository) {
        this.ratePlanRepository = ratePlanRepository;
    }


    @Override
    public RatePlan save(RatePlan ratePlan) {
        return ratePlanRepository.save(ratePlan);
    }

    @Override
    public RatePlan update(RatePlan ratePlan) {
        return ratePlanRepository.save(ratePlan);
    }

    @Override
    public Page<RatePlan> findAll(Pageable pageable) {
        return ratePlanRepository.findAll(PageRequest.of(0,5));
    }

    @Override
    public Optional<RatePlan> findById(Long id) {
        return ratePlanRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        ratePlanRepository.deleteById(id);

    }
}
