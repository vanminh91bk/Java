package com.isofh.his.model.category;

import com.isofh.his.model.base.BaseCategoryModel;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "his_specialist", uniqueConstraints={@UniqueConstraint(columnNames = {"value", "deleted"})})
@Audited
public class Specialist extends BaseCategoryModel {
    @Id
    @GeneratedValue(generator = "specialist_generator")
    @SequenceGenerator(
            name = "specialist_generator",
            sequenceName = "specialist_sq",
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
