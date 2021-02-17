// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PhoneNumbersReleasePhoneNumberHeaders model. */
@Fluent
public final class PhoneNumbersReleasePhoneNumberHeaders {
    /*
     * The release-id property.
     */
    @JsonProperty(value = "release-id")
    private String releaseId;

    /*
     * The operation-id property.
     */
    @JsonProperty(value = "operation-id")
    private String operationId;

    /*
     * The Operation-Location property.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /**
     * Get the releaseId property: The release-id property.
     *
     * @return the releaseId value.
     */
    public String getReleaseId() {
        return this.releaseId;
    }

    /**
     * Set the releaseId property: The release-id property.
     *
     * @param releaseId the releaseId value to set.
     * @return the PhoneNumbersReleasePhoneNumberHeaders object itself.
     */
    public PhoneNumbersReleasePhoneNumberHeaders setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * Get the operationId property: The operation-id property.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operation-id property.
     *
     * @param operationId the operationId value to set.
     * @return the PhoneNumbersReleasePhoneNumberHeaders object itself.
     */
    public PhoneNumbersReleasePhoneNumberHeaders setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the PhoneNumbersReleasePhoneNumberHeaders object itself.
     */
    public PhoneNumbersReleasePhoneNumberHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }
}