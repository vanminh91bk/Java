package com.isofh.his.dto.base;

public abstract class BaseDto {

    private Long id;

    public BaseDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
