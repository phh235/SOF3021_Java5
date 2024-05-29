package org.example.java5jpa.entity;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;@Getter@Setter@NoArgsConstructor@AllArgsConstructor@Entity@Table(name = "Role")public class Role {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "role_id")    private int roleId;    @Column(name = "role_name")    private String roleName;    @Column(name = "role_desc")    private String roleDescription;}