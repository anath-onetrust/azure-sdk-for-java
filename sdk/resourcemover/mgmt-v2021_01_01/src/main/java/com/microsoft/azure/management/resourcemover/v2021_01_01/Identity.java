/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the MSI properties of the Move Collection.
 */
public class Identity {
    /**
     * Possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Gets or sets the principal id.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Gets or sets the tenant id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set possible values include: 'None', 'SystemAssigned', 'UserAssigned'.
     *
     * @param type the type value to set
     * @return the Identity object itself.
     */
    public Identity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets or sets the principal id.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set gets or sets the principal id.
     *
     * @param principalId the principalId value to set
     * @return the Identity object itself.
     */
    public Identity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get gets or sets the tenant id.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set gets or sets the tenant id.
     *
     * @param tenantId the tenantId value to set
     * @return the Identity object itself.
     */
    public Identity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}