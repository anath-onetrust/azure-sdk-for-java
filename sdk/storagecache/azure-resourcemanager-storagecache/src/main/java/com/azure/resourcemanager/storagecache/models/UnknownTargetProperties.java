// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Storage container for use as an Unknown Storage Target. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "targetType")
@JsonTypeName("unknown")
@Immutable
public final class UnknownTargetProperties extends StorageTargetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UnknownTargetProperties.class);

    /** {@inheritDoc} */
    @Override
    public UnknownTargetProperties withJunctions(List<NamespaceJunction> junctions) {
        super.withJunctions(junctions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UnknownTargetProperties withProvisioningState(ProvisioningStateType provisioningState) {
        super.withProvisioningState(provisioningState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UnknownTargetProperties withNfs3(Nfs3Target nfs3) {
        super.withNfs3(nfs3);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UnknownTargetProperties withClfs(ClfsTarget clfs) {
        super.withClfs(clfs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UnknownTargetProperties withUnknown(UnknownTarget unknown) {
        super.withUnknown(unknown);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}