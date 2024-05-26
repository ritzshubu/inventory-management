package com.dukaan.inventory.management.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "shopkeeperInfo")
public class ShopkeeperInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long shopkeeperId;

        @ManyToOne
        @JoinColumn(name = "login_id", nullable = false)
        private LoginDetails loginDetails;

        @Column(name = "shop_name", nullable = false)
        private String shopName;

        @Column(name = "shop_address", nullable = false)
        private String shopAddress;

        @Column(name = "contact_phone")
        private String contactPhone;

        @Column(name = "created_at", nullable = false, updatable = false)
        private LocalDateTime createdAt;

        @PrePersist
        protected void onCreate() {
                createdAt = LocalDateTime.now();
        }
}
