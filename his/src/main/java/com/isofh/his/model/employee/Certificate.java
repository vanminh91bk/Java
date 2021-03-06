package com.isofh.his.model.employee;

import com.isofh.his.model.base.BaseCategoryModel;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "his_certificate", uniqueConstraints={@UniqueConstraint(columnNames = {"value", "deleted"})})
@Where(clause = "deleted=0")
@Audited
public class Certificate extends BaseCategoryModel {
    @Id
    @GeneratedValue(generator = "certificate_generator")
    @SequenceGenerator(
            name = "certificate_generator",
            sequenceName = "certificate_sq",
            initialValue = 1000000
    )
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
