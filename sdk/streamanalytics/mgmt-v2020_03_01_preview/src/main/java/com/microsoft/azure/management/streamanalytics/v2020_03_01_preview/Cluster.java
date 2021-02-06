/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation.StreamAnalyticsManager;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation.ClusterInner;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Resource, GroupableResourceCore<StreamAnalyticsManager, ClusterInner>, HasResourceGroup, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<StreamAnalyticsManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the properties value.
     */
    ClusterProperties properties();

    /**
     * @return the sku value.
     */
    ClusterSku sku();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Cluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithIfMatch> {
        }

        /**
         * The stage of the cluster definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes
            * @return the next definition stage
*/
            WithIfNoneMatch withIfMatch(String ifMatch);
        }

        /**
         * The stage of the cluster definition allowing to specify IfNoneMatch.
         */
        interface WithIfNoneMatch {
           /**
            * Specifies ifNoneMatch.
            * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing record set. Other values will result in a 412 Pre-condition Failed response
            * @return the next definition stage
*/
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }

        /**
         * The stage of the cluster definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The properties associated with a Stream Analytics cluster
             * @return the next definition stage
             */
            WithCreate withProperties(ClusterProperties properties);
        }

        /**
         * The stage of the cluster definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(ClusterSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithProperties, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithIfMatch, UpdateStages.WithProperties, UpdateStages.WithSku {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the cluster update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The properties associated with a Stream Analytics cluster
             * @return the next update stage
             */
            Update withProperties(ClusterProperties properties);
        }

        /**
         * The stage of the cluster update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next update stage
             */
            Update withSku(ClusterSku sku);
        }

    }
}