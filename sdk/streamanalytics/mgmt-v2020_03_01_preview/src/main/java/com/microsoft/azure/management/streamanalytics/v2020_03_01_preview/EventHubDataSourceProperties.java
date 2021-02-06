/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The common properties that are associated with Event Hub data sources.
 */
public class EventHubDataSourceProperties extends ServiceBusDataSourceProperties {
    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "eventHubName")
    private String eventHubName;

    /**
     * Get the name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @return the eventHubName value
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @param eventHubName the eventHubName value to set
     * @return the EventHubDataSourceProperties object itself.
     */
    public EventHubDataSourceProperties withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

}