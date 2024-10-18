package org.example.pos_system.service;

import org.example.pos_system.model.Business;
import org.example.pos_system.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    public Business saveBusiness(Business business) {
        return businessRepository.save(business);
    }

    public Optional<Business> getBusinessById(Long id) {
        return businessRepository.findById(id);
    }

    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    public Business updateBusiness(Long id, Business businessDetails) {
        Business business = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business not found"));

        business.setName(businessDetails.getName());
        business.setPhone(businessDetails.getPhone());

        return businessRepository.save(business);
    }

    public void deleteBusiness(Long id) {
        businessRepository.deleteById(id);
    }
}
