package com.study.study.domain.nativequery.service;

import com.study.study.domain.nativequery.repository.TbFreeboardRepository;
import org.springframework.stereotype.Service;

@Service
public class NativeQueryService {

    private final TbFreeboardRepository freeboardRepository;

    public NativeQueryService(TbFreeboardRepository freeboardRepository) {
        this.freeboardRepository = freeboardRepository;
    }

    public Integer deleteFreeboard() {
        return freeboardRepository.deleteFreeboard();
    }
}
