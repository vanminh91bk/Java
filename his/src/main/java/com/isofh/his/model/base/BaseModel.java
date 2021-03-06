package com.isofh.his.model.base;

import com.isofh.his.model.base.audit.AuditModel;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel extends AuditModel {
    public abstract Long getId();

    public abstract void setId(Long id);

    @Column(name = "active", nullable = false)
    @Audited
    private boolean active = true;

    @Column(name = "deleted", nullable = false)
    @Audited
    private Long deleted = 0L;

    @Column(name = "dev", updatable = false)
    private String dev;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }
}