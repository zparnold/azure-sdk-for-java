// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A MySQL Server key. */
@JsonFlatten
@Fluent
public class ServerKeyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerKeyInner.class);

    /*
     * Kind of encryption protector used to protect the key.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * The key type like 'AzureKeyVault'.
     */
    @JsonProperty(value = "properties.serverKeyType")
    private ServerKeyType serverKeyType;

    /*
     * The URI of the key.
     */
    @JsonProperty(value = "properties.uri")
    private String uri;

    /*
     * The key creation date.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /**
     * Get the kind property: Kind of encryption protector used to protect the key.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the serverKeyType property: The key type like 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * Set the serverKeyType property: The key type like 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the ServerKeyInner object itself.
     */
    public ServerKeyInner withServerKeyType(ServerKeyType serverKeyType) {
        this.serverKeyType = serverKeyType;
        return this;
    }

    /**
     * Get the uri property: The URI of the key.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the key.
     *
     * @param uri the uri value to set.
     * @return the ServerKeyInner object itself.
     */
    public ServerKeyInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the creationDate property: The key creation date.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
