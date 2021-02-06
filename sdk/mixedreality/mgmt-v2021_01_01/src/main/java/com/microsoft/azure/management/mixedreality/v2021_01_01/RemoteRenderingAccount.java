/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2021_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mixedreality.v2021_01_01.implementation.MixedRealityManager;
import com.microsoft.azure.management.mixedreality.v2021_01_01.implementation.RemoteRenderingAccountInner;

/**
 * Type representing RemoteRenderingAccount.
 */
public interface RemoteRenderingAccount extends HasInner<RemoteRenderingAccountInner>, Resource, GroupableResourceCore<MixedRealityManager, RemoteRenderingAccountInner>, HasResourceGroup, Refreshable<RemoteRenderingAccount>, Updatable<RemoteRenderingAccount.Update>, HasManager<MixedRealityManager> {
    /**
     * @return the accountDomain value.
     */
    String accountDomain();

    /**
     * @return the accountId value.
     */
    String accountId();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the kind value.
     */
    Sku kind();

    /**
     * @return the plan value.
     */
    Identity plan();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the storageAccountName value.
     */
    String storageAccountName();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * The entirety of the RemoteRenderingAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RemoteRenderingAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RemoteRenderingAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the RemoteRenderingAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity associated with this account
             * @return the next definition stage
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind The kind of account, if supported
             * @return the next definition stage
             */
            WithCreate withKind(Sku kind);
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             * @param plan The plan associated with this account
             * @return the next definition stage
             */
            WithCreate withPlan(Identity plan);
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku associated with this account
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify StorageAccountName.
         */
        interface WithStorageAccountName {
            /**
             * Specifies storageAccountName.
             * @param storageAccountName The name of the storage account associated with this accountId
             * @return the next definition stage
             */
            WithCreate withStorageAccountName(String storageAccountName);
        }

        /**
         * The stage of the remoterenderingaccount definition allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData System metadata for this account
             * @return the next definition stage
             */
            WithCreate withSystemData(SystemData systemData);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RemoteRenderingAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIdentity, DefinitionStages.WithKind, DefinitionStages.WithPlan, DefinitionStages.WithSku, DefinitionStages.WithStorageAccountName, DefinitionStages.WithSystemData {
        }
    }
    /**
     * The template for a RemoteRenderingAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RemoteRenderingAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithIdentity, UpdateStages.WithKind, UpdateStages.WithPlan, UpdateStages.WithSku, UpdateStages.WithStorageAccountName, UpdateStages.WithSystemData {
    }

    /**
     * Grouping of RemoteRenderingAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the remoterenderingaccount update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity associated with this account
             * @return the next update stage
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the remoterenderingaccount update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind The kind of account, if supported
             * @return the next update stage
             */
            Update withKind(Sku kind);
        }

        /**
         * The stage of the remoterenderingaccount update allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             * @param plan The plan associated with this account
             * @return the next update stage
             */
            Update withPlan(Identity plan);
        }

        /**
         * The stage of the remoterenderingaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku associated with this account
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the remoterenderingaccount update allowing to specify StorageAccountName.
         */
        interface WithStorageAccountName {
            /**
             * Specifies storageAccountName.
             * @param storageAccountName The name of the storage account associated with this accountId
             * @return the next update stage
             */
            Update withStorageAccountName(String storageAccountName);
        }

        /**
         * The stage of the remoterenderingaccount update allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData System metadata for this account
             * @return the next update stage
             */
            Update withSystemData(SystemData systemData);
        }

    }
}