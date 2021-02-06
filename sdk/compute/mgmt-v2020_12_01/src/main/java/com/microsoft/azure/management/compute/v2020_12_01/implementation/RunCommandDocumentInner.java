/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.RunCommandParameterDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a Run Command.
 */
public class RunCommandDocumentInner extends RunCommandDocumentBaseInner {
    /**
     * The script to be executed.
     */
    @JsonProperty(value = "script", required = true)
    private List<String> script;

    /**
     * The parameters used by the script.
     */
    @JsonProperty(value = "parameters")
    private List<RunCommandParameterDefinition> parameters;

    /**
     * Get the script to be executed.
     *
     * @return the script value
     */
    public List<String> script() {
        return this.script;
    }

    /**
     * Set the script to be executed.
     *
     * @param script the script value to set
     * @return the RunCommandDocumentInner object itself.
     */
    public RunCommandDocumentInner withScript(List<String> script) {
        this.script = script;
        return this;
    }

    /**
     * Get the parameters used by the script.
     *
     * @return the parameters value
     */
    public List<RunCommandParameterDefinition> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters used by the script.
     *
     * @param parameters the parameters value to set
     * @return the RunCommandDocumentInner object itself.
     */
    public RunCommandDocumentInner withParameters(List<RunCommandParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

}