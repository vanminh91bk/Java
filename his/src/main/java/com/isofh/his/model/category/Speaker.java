package com.isofh.his.model.category;

import com.isofh.his.model.base.BaseCategoryModel;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "his_speaker", indexes = {@Index(name = "speaker_idx_value", columnList = "value")})
@Audited
public class Speaker extends BaseCategoryModel {
    @Id
    @GeneratedValue(generator = "speaker_generator")
    @SequenceGenerator(
            name = "speaker_generator",
            sequenceName = "speaker_sq",
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
