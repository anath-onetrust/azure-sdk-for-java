// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.AzureADOnlyAuthenticationInner;
import com.azure.resourcemanager.synapse.models.AzureADOnlyAuthenticationName;

/** An instance of this class provides access to all the operations defined in AzureADOnlyAuthenticationsClient. */
public interface AzureADOnlyAuthenticationsClient {
    /**
     * Gets a Azure Active Directory only authentication property.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Active Directory only authentication property.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureADOnlyAuthenticationInner get(
        String resourceGroupName, String workspaceName, AzureADOnlyAuthenticationName azureADOnlyAuthenticationName);

    /**
     * Gets a Azure Active Directory only authentication property.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Active Directory only authentication property.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureADOnlyAuthenticationInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        Context context);

    /**
     * Create or Update a Azure Active Directory only authentication property for the workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @param azureADOnlyAuthenticationInfo Azure Active Directory Property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Active Directory Only Authentication Info.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AzureADOnlyAuthenticationInner>, AzureADOnlyAuthenticationInner> beginCreate(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        AzureADOnlyAuthenticationInner azureADOnlyAuthenticationInfo);

    /**
     * Create or Update a Azure Active Directory only authentication property for the workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @param azureADOnlyAuthenticationInfo Azure Active Directory Property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Active Directory Only Authentication Info.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AzureADOnlyAuthenticationInner>, AzureADOnlyAuthenticationInner> beginCreate(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        AzureADOnlyAuthenticationInner azureADOnlyAuthenticationInfo,
        Context context);

    /**
     * Create or Update a Azure Active Directory only authentication property for the workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @param azureADOnlyAuthenticationInfo Azure Active Directory Property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Active Directory Only Authentication Info.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureADOnlyAuthenticationInner create(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        AzureADOnlyAuthenticationInner azureADOnlyAuthenticationInfo);

    /**
     * Create or Update a Azure Active Directory only authentication property for the workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @param azureADOnlyAuthenticationInfo Azure Active Directory Property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Active Directory Only Authentication Info.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureADOnlyAuthenticationInner create(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        AzureADOnlyAuthenticationInner azureADOnlyAuthenticationInfo,
        Context context);

    /**
     * Gets a list of Azure Active Directory only authentication property for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Active Directory only authentication property for a workspace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureADOnlyAuthenticationInner> list(String resourceGroupName, String workspaceName);

    /**
     * Gets a list of Azure Active Directory only authentication property for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Active Directory only authentication property for a workspace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureADOnlyAuthenticationInner> list(String resourceGroupName, String workspaceName, Context context);
}
