package org.spring.practice.services;

import java.util.Optional;

import org.spring.practice.model.Sale;
import org.spring.practice.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;

    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public Optional<Sale> findSaleById(Long id) {
        return saleRepository.findById(id);
    }

    public Iterable<Sale> findAll(){
        return saleRepository.findAll();
    }

    public boolean deleteSale(Long id) {
        try {
            saleRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
