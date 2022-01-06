package com.dio.savio.firstapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("HOME"),
    MOBILE("MOBILE"),
    COMMERCIAL("Commercial");

    private final String description;
}
