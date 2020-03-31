// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault.models;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/**
 * A builder for creating a new instance of the KeyVaultManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = {KeyVaultManagementClientImpl.class})
public final class KeyVaultManagementClientBuilder {
    /*
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     */
    private String subscriptionId;

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the KeyVaultManagementClientBuilder.
     */
    public KeyVaultManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     * 
     * @param host the host value.
     * @return the KeyVaultManagementClientBuilder.
     */
    public KeyVaultManagementClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     * 
     * @param apiVersion the apiVersion value.
     * @return the KeyVaultManagementClientBuilder.
     */
    public KeyVaultManagementClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the KeyVaultManagementClientBuilder.
     */
    public KeyVaultManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the KeyVaultManagementClientBuilder.
     */
    public KeyVaultManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of KeyVaultManagementClientImpl with the provided parameters.
     * 
     * @return an instance of KeyVaultManagementClientImpl.
     */
    public KeyVaultManagementClientImpl build() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (apiVersion == null) {
            this.apiVersion = "2018-02-14";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        KeyVaultManagementClientImpl client = new KeyVaultManagementClientImpl(pipeline, environment);
        client.setSubscriptionId(this.subscriptionId);
        client.setHost(this.host);
        client.setApiVersion(this.apiVersion);
        return client;
    }
}