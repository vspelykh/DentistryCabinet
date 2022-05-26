package ua.vspelykh.dentistrycabinet.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
@Entity
public class Doctor extends AbstractBaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @OneToMany
    @JoinColumn(name = "appointment_id")
    private List<Appointment> appointments;
}
