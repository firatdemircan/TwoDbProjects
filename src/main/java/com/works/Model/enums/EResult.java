package com.works.Model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EResult {

    success("Succesful"),error("Error");
    private final String durum;

}
