// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.util.Context;

/** Samples for Configurations Get. */
public final class ConfigurationsGetSamples {
    /**
     * Sample code: Get Core site settings.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void getCoreSiteSettings(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.configurations().getWithResponse("rg1", "cluster1", "core-site", Context.NONE);
    }
}
