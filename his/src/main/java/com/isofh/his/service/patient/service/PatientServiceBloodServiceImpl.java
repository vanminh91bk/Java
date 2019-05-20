package com.isofh.his.service.patient.service;

import com.isofh.his.dto.patient.service.PatientServiceBloodDto;
import com.isofh.his.model.patient.service.PatientServiceBlood;
import com.isofh.his.repository.patient.service.PatientServiceBloodRepository;
import com.isofh.his.storage.StorageService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceBloodServiceImpl implements PatientServiceBloodService {

    private final static Logger logger = LoggerFactory.getLogger(PatientServiceBloodServiceImpl.class);

    @Autowired
    private PatientServiceBloodRepository repository;

    @Override
    public PatientServiceBloodRepository getRepository() {
        return repository;
    }

    @Autowired
    private StorageService storageService;

    @Override
    public StorageService getStorageService() {
        return storageService;
    }

    @Override
    public Class<PatientServiceBlood> getModelClass() {
        return PatientServiceBlood.class;
    }

    @Override
    public Class<PatientServiceBloodDto> getDtoClass() {
        return PatientServiceBloodDto.class;
    }

    ModelMapper modelMapper = null;

    @Override
    public ModelMapper getModelMapper() {
        if (modelMapper == null) {
            modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        }

        return modelMapper;
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }
}
