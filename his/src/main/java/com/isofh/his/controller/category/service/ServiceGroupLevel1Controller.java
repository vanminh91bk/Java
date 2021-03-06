package com.isofh.his.controller.category.service;

import com.isofh.his.controller.base.BaseCategoryController;
import com.isofh.his.dto.category.service.ServiceGroupLevel1Dto;
import com.isofh.his.service.category.service.ServiceGroupLevel1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service-group-level1s")
public class ServiceGroupLevel1Controller extends BaseCategoryController<ServiceGroupLevel1Dto, ServiceGroupLevel1Service> {

    private final static Logger logger = LoggerFactory.getLogger(ServiceGroupLevel1Controller.class);

    @Autowired
    private ServiceGroupLevel1Service service;

    @Override
    protected ServiceGroupLevel1Service getService() {
        return this.service;
    }

    @Override
    protected Logger getLogger() {
        return this.logger;
    }
}
