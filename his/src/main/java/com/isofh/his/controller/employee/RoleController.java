package com.isofh.his.controller.employee;

import com.isofh.his.controller.base.BaseCategoryController;
import com.isofh.his.dto.employee.RoleDto;
import com.isofh.his.service.employee.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/roles")
public class RoleController extends BaseCategoryController<RoleDto, RoleService> {

    private final static Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService service;

    @Override
    protected RoleService getService() {
        return this.service;
    }

    @Override
    protected Logger getLogger() {
        return this.logger;
    }
}
