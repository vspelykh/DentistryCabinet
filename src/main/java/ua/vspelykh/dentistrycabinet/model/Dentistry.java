package ua.vspelykh.dentistrycabinet.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dentistry")
@Entity
public class Dentistry extends AbstractBaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String owner;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String address;
}
