package com.dukaan.inventory.management.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Login_Type {

    ADMIN("admin"),
    SHOP_OWNER("owner");

    private final String ownerType;

}
