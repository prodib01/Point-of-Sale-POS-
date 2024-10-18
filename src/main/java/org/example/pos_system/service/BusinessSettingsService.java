package org.example.pos_system.service;

import org.example.pos_system.model.BusinessSettings;
import org.example.pos_system.repository.BusinessSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Add @Service annotation
public class BusinessSettingsService {

    @Autowired
    private BusinessSettingsRepository businessSettingsRepository;

    public BusinessSettings saveBusinessSettings(BusinessSettings businessSettings) {
        return businessSettingsRepository.save(businessSettings);
    }

    public List<BusinessSettings> getAllBusinessSettings() {
        return businessSettingsRepository.findAll();
    }

    public Optional<BusinessSettings> getBusinessSettingsById(Long id) {
        return businessSettingsRepository.findById(id);
    }

    public BusinessSettings updateBusinessSettings(Long id, BusinessSettings businessSettingsDetails) { // Change method signature
        BusinessSettings businessSettings = businessSettingsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business settings not found"));

        businessSettings.setCurrency(businessSettingsDetails.getCurrency());
        businessSettings.setDefaultTaxRate(businessSettingsDetails.getDefaultTaxRate()); // Fix method name (case-sensitive)

        return businessSettingsRepository.save(businessSettings); // Return BusinessSettings
    }

    public void deleteBusinessSettings(Long id) { // Fix the type from "Lond" to "Long"
        businessSettingsRepository.deleteById(id); // Change to correct repository
    }
}
