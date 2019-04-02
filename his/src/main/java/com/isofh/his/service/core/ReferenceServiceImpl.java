package com.isofh.his.service.core;

import com.isofh.his.dto.core.ReferenceDto;
import com.isofh.his.model.base.Reference;
import com.isofh.his.repository.core.ReferenceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferenceServiceImpl implements ReferenceService {

    @Autowired
    private ReferenceRepository repository;

    @Override
    public Reference save(Reference model) {
        return repository.save(model);
    }

    @Override
    public Reference get(Long id) {
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

    @Override
    public Reference getModel(ReferenceDto dto) {
        if (dto == null) {
            return null;
        }
        return getModelMapper().map(dto, Reference.class);
    }

    @Override
    public ReferenceDto getDto(Reference model) {
        if (model == null) {
            return null;
        }
        return getModelMapper().map(model, ReferenceDto.class);
    }
}