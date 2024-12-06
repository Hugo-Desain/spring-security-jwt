package com.aplose.digihello.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // Exemple : "ROLE_USER", "ROLE_ADMIN"

    /**
     * Getter
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter
     *
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * Setter
     *
     * @param role role
     */
    public void setRole(String role) {
        this.role = role;
    }

    protected UserRole[] getRoles() {
        return new UserRole[0];
    }
}
