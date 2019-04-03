package com.isofh.his.service.employee;

import com.isofh.his.dto.employee.PrivilegeDto;
import com.isofh.his.model.employee.Privilege;
import com.isofh.his.repository.employee.PrivilegeRepository;
import com.isofh.his.storage.StorageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    @Autowired
    private PrivilegeRepository repository;

    private final StorageService storageService;

    @Autowired
    public PrivilegeServiceImpl(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public StorageService getStorageService() {
        return storageService;
    }

    @Override
    public Privilege save(Privilege model) {
        return repository.save(model);
    }

    @Override
    public Privilege get(Long id) {
        return repository.findById(id).orElse(null);
    }

    ModelMapper modelMapper = null;
    @Override
    public ModelMapper getModelMapper() {
        if (modelMapper == null) {
            modelMapper = new ModelMapper();
        }

        return modelMapper;
    }
}
