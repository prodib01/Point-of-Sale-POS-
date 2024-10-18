package org.example.pos_system.service;

import org.example.pos_system.model.SaleItem;
import org.example.pos_system.repository.SaleItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleItemService {

    @Autowired
    private SaleItemRepository saleItemRepository;

    public SaleItem saveSaleItem(SaleItem saleItem) {
        return saleItemRepository.save(saleItem);
    }

    public List<SaleItem> getAllSaleItems() {
        return saleItemRepository.findAll();
    }

    public Optional<SaleItem> getSaleItemById(Long id) {
        return saleItemRepository.findById(id); // Change from SaleItemRepository to saleItemRepository
    }

    public SaleItem updateSaleItem(Long id, SaleItem saleItemDetails) {
        SaleItem saleItem = saleItemRepository.findById(id) // Change from SaleItemRepository to saleItemRepository
                .orElseThrow(() -> new RuntimeException("Item not found"));

        saleItem.setQuantity(saleItemDetails.getQuantity());
        saleItem.setPrice(saleItemDetails.getPrice());

        return saleItemRepository.save(saleItem);
    }

    public void deleteSaleItem(Long id) {
        saleItemRepository.deleteById(id);
    }
}
