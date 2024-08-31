package com.example.SchoolManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "secretaria") 
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Secretaria {

    @Id
    @Column(name = "id")
    private Long id;
    
}
