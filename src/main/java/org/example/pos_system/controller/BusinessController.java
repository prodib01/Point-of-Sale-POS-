package org.example.pos_system.controller;

import org.example.pos_system.model.Business;
import org.example.pos_system.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @PostMapping
    public Business createBusiness(@RequestBody Business business) {
        return businessService.saveBusiness(business);
    }

    @GetMapping("/{id}")
    public Optional<Business> getBusinessById(@PathVariable Long id) {
        return businessService.getBusinessById(id);
    }

    @GetMapping
    public List<Business> getAllBusinesses() {
        return businessService.getAllBusinesses();
    }

    @PutMapping("/{id}")
    public Business updateBusiness(@PathVariable Long id, @RequestBody Business businessDetails) {
        return businessService.updateBusiness(id, businessDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBusiness(@PathVariable Long id) {
        businessService.deleteBusiness(id);
    }
}

