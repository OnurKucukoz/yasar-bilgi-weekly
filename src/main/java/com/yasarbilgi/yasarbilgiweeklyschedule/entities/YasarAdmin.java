package com.yasarbilgi.yasarbilgiweeklyschedule.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class YasarAdmin {
    @SequenceGenerator(name = "yasar_admin_sequence", sequenceName = "yasar_admin_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yasar_admin_sequence")
    private long id;
    @OneToOne
    @JoinColumn(
            nullable = false,
            name = "department_id"
    )
    private Department department;
    private String fullName;
    private boolean isGeneralAdmin;
}
