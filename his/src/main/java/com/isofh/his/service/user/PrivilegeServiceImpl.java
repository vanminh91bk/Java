package com.isofh.his.service.user;

import com.isofh.his.dto.PrivilegeDto;
import com.isofh.his.dto.base.BaseDto;
import com.isofh.his.model.Privilege;
import com.isofh.his.model.base.BaseModel;
import com.isofh.his.repository.PrivilegeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    @Autowired
    private PrivilegeRepository repository;

    @Override
    public Privilege create(Privilege model) {
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

    @Override
    public Privilege getModel(PrivilegeDto dto) {
        return getModelMapper().map(dto, Privilege.class);
    }

    @Override
    public PrivilegeDto getDto(Privilege model) {
        return getModelMapper().map(model, PrivilegeDto.class);
    }
}
