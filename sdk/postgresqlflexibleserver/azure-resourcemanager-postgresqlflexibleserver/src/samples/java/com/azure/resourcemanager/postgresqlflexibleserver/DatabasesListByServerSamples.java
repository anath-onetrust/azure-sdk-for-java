// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.util.Context;

/** Samples for Databases ListByServer. */
public final class DatabasesListByServerSamples {
    /*
     * operationId: Databases_ListByServer
     * api-version: 2021-06-01
     * x-ms-examples: List databases in a server
     */
    /**
     * Sample code: List databases in a server.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void listDatabasesInAServer(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.databases().listByServer("TestGroup", "testserver", Context.NONE);
    }
}
