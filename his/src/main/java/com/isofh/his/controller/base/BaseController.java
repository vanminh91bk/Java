package com.isofh.his.controller.base;

import com.isofh.his.dto.base.BaseDto;
import com.isofh.his.dto.base.ResponseMsg;
import com.isofh.his.service.base.BaseService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

public abstract class BaseController<Y extends BaseDto, S extends BaseService> extends BaseResponseController {

    protected abstract S getService();

    @GetMapping("/{id}")
    public ResponseEntity<ResponseMsg> getById(@PathVariable Long id) {
        return response(getService().findDtoById(id));
    }

    @PostMapping
    public ResponseEntity<ResponseMsg> create(@Valid @RequestBody Y dto) {
        return response(getService().createDto(dto));
    }

    @PutMapping
    public ResponseEntity<ResponseMsg> update(@Valid @RequestBody Y dto) {
        return response(getService().updateDto(dto));
    }

    @PostMapping("/excel")
    public ResponseEntity<InputStreamResource> importExcel(@RequestParam("file") MultipartFile file) {
        return response(getService().importExcel(file, 1, 1));
    }
}
