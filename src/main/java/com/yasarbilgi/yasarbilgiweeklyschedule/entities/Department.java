package com.yasarbilgi.yasarbilgiweeklyschedule.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Department {
    @SequenceGenerator(name = "department_sequence", sequenceName = "department_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_sequence")
    private long id;
    private String departmentName;
    @OneToMany
    @JoinColumn(
            nullable = false,
            name = "yasar_user_id"
    )
    private List<YasarUser> users;
}
