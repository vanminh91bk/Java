package com.isofh.his.service.patient.info;

import com.isofh.his.dto.patient.info.PatientOnlineDto;
import com.isofh.his.model.patient.info.PatientOnline;
import com.isofh.his.repository.patient.info.PatientOnlineRepository;
import com.isofh.his.storage.StorageService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientOnlineServiceImpl implements PatientOnlineService {

    private final static Logger logger = LoggerFactory.getLogger(PatientOnlineServiceImpl.class);

    @Autowired
    private PatientOnlineRepository repository;

    @Override
    public PatientOnlineRepository getRepository() {
        return repository;
    }

    @Autowired
    private StorageService storageService;

    @Override
    public StorageService getStorageService() {
        return storageService;
    }

    @Override
    public Class<PatientOnline> getModelClass() {
        return PatientOnline.class;
    }

    @Override
    public Class<PatientOnlineDto> getDtoClass() {
        return PatientOnlineDto.class;
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
