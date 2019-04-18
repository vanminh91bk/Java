package com.isofh.his.model.category;

import com.isofh.his.model.base.BaseCategoryModel;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "his_position", indexes = {@Index(name = "position_idx_value", columnList = "value")})
@Audited
public class Position extends BaseCategoryModel {
    @Id
    @GeneratedValue(generator = "position_generator")
    @SequenceGenerator(
            name = "position_generator",
            sequenceName = "position_sq",
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
