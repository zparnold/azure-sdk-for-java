// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The policy sku. This property is optional, obsolete, and will be ignored. */
@Fluent
public final class PolicySku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicySku.class);

    /*
     * The name of the policy sku. Possible values are A0 and A1.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The policy sku tier. Possible values are Free and Standard.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Get the name property: The name of the policy sku. Possible values are A0 and A1.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the policy sku. Possible values are A0 and A1.
     *
     * @param name the name value to set.
     * @return the PolicySku object itself.
     */
    public PolicySku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The policy sku tier. Possible values are Free and Standard.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The policy sku tier. Possible values are Free and Standard.
     *
     * @param tier the tier value to set.
     * @return the PolicySku object itself.
     */
    public PolicySku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model PolicySku"));
        }
    }
}
