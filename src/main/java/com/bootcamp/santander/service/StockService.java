package com.bootcamp.santander.service;

import com.bootcamp.santander.mapper.StockMapper;
import com.bootcamp.santander.model.Stock;
import com.bootcamp.santander.model.dto.StockDTO;
import com.bootcamp.santander.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    @Autowired
    private StockMapper mapper;

    @Transactional
    public StockDTO save(StockDTO dto) {
        Stock stock = mapper.toEntity(dto);
        repository.save(stock);
        return mapper.toDto(stock);


    }
}
