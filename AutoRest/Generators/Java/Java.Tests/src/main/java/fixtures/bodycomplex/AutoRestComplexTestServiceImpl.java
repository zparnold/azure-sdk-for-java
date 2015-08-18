/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;


/**
 * Initializes a new instance of the AutoRestComplexTestService class.
 */
public class AutoRestComplexTestServiceImpl extends ServiceClient implements AutoRestComplexTestService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private BasicOperations basicOperations;

    /**
     * Gets the BasicOperations object to access its operations.
     * @return the basicOperations value.
     */
    public BasicOperations getBasicOperations() {
        return this.basicOperations;
    }

    private Primitive primitive;

    /**
     * Gets the Primitive object to access its operations.
     * @return the primitive value.
     */
    public Primitive getPrimitive() {
        return this.primitive;
    }

    private Array array;

    /**
     * Gets the Array object to access its operations.
     * @return the array value.
     */
    public Array getArray() {
        return this.array;
    }

    private Dictionary dictionary;

    /**
     * Gets the Dictionary object to access its operations.
     * @return the dictionary value.
     */
    public Dictionary getDictionary() {
        return this.dictionary;
    }

    private Inheritance inheritance;

    /**
     * Gets the Inheritance object to access its operations.
     * @return the inheritance value.
     */
    public Inheritance getInheritance() {
        return this.inheritance;
    }

    private Polymorphism polymorphism;

    /**
     * Gets the Polymorphism object to access its operations.
     * @return the polymorphism value.
     */
    public Polymorphism getPolymorphism() {
        return this.polymorphism;
    }

    private Polymorphicrecursive polymorphicrecursive;

    /**
     * Gets the Polymorphicrecursive object to access its operations.
     * @return the polymorphicrecursive value.
     */
    public Polymorphicrecursive getPolymorphicrecursive() {
        return this.polymorphicrecursive;
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     */
    public AutoRestComplexTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestComplexTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestComplexTestServiceImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
                this.basicOperations = new BasicOperationsImpl(restAdapter);
        this.primitive = new PrimitiveImpl(restAdapter);
        this.array = new ArrayImpl(restAdapter);
        this.dictionary = new DictionaryImpl(restAdapter);
        this.inheritance = new InheritanceImpl(restAdapter);
        this.polymorphism = new PolymorphismImpl(restAdapter);
        this.polymorphicrecursive = new PolymorphicrecursiveImpl(restAdapter);
    }
}
