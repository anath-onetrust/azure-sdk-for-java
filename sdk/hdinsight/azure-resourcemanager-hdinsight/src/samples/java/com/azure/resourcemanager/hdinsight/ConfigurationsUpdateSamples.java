// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.util.Context;
import java.util.HashMap;
import java.util.Map;

/** Samples for Configurations Update. */
public final class ConfigurationsUpdateSamples {
    /**
     * Sample code: Enable HTTP connectivity.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void enableHTTPConnectivity(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager
            .configurations()
            .update(
                "rg1",
                "cluster1",
                "gateway",
                mapOf(
                    "restAuthCredential.isEnabled",
                    "true",
                    "restAuthCredential.password",
                    "**********",
                    "restAuthCredential.username",
                    "hadoop"),
                Context.NONE);
    }

    /**
     * Sample code: Disable HTTP connectivity.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void disableHTTPConnectivity(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager
            .configurations()
            .update("rg1", "cluster1", "gateway", mapOf("restAuthCredential.isEnabled", "false"), Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
