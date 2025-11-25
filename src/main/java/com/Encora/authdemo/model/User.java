package com.Encora.authdemo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Optional user-facing unique id (string); useful if you want non-sequential IDs exposed to clients
    @Column(name = "user_id", unique = true)
    private String userId;

    @Column(name = "full_name", nullable = false)
    private String fullName; // corresponds to "name" from your list

    @Column(name = "username", unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password; // NOTE: store only hashed passwords in production

    @Column(nullable = false)
    private String role = "USER";

    @Column(name = "risk_appetite")
    private String riskAppetite;

    @Column
    private String experience;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public User() { }

    // Constructor - includes new fields. Adjust as needed.
    public User(String userId, String fullName, String username, String email, String phone,
                String password, String role, String riskAppetite, String experience) {
        this.userId = userId;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.riskAppetite = riskAppetite;
        this.experience = experience;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getRiskAppetite() { return riskAppetite; }
    public void setRiskAppetite(String riskAppetite) { this.riskAppetite = riskAppetite; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
