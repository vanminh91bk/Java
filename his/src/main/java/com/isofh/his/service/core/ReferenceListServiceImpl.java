package com.isofh.his.service.core;

import com.isofh.his.dto.core.ReferenceListDto;
import com.isofh.his.model.core.ReferenceList;
import com.isofh.his.repository.core.ReferenceListRepository;
import com.isofh.his.storage.StorageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferenceListServiceImpl implements ReferenceListService {

    @Autowired
    private ReferenceListRepository repository;

    private final StorageService storageService;

    @Autowired
    public ReferenceListServiceImpl(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public StorageService getStorageService() {
        return storageService;
    }

    @Override
    public ReferenceList save(ReferenceList model) {
        return repository.save(model);
    }

    @Override
    public ReferenceList get(Long id) {
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
