/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the disk image encryption base class.
 */
public class DiskImageEncryption {
    /**
     * A relative URI containing the resource ID of the disk encryption set.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /**
     * Get a relative URI containing the resource ID of the disk encryption set.
     *
     * @return the diskEncryptionSetId value
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set a relative URI containing the resource ID of the disk encryption set.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set
     * @return the DiskImageEncryption object itself.
     */
    public DiskImageEncryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

}