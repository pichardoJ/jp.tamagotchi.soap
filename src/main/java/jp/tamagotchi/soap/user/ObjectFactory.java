//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.04 at 10:16:59 PM PDT 
//


package jp.tamagotchi.soap.user;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.tamagotchi.soap.user package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.tamagotchi.soap.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link SaveUserRequest }
     * 
     */
    public SaveUserRequest createSaveUserRequest() {
        return new SaveUserRequest();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link SaveUserResponse }
     * 
     */
    public SaveUserResponse createSaveUserResponse() {
        return new SaveUserResponse();
    }

    /**
     * Create an instance of {@link GetUsersRequest }
     * 
     */
    public GetUsersRequest createGetUsersRequest() {
        return new GetUsersRequest();
    }

    /**
     * Create an instance of {@link GetUsersResponse.Data }
     * 
     */
    public GetUsersResponse.Data createGetUsersResponseData() {
        return new GetUsersResponse.Data();
    }

}
