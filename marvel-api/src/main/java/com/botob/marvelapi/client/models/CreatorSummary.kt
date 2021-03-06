/**
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Cable
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.botob.marvelapi.client.models


/**
 * 
 * @param resourceURI The path to the individual creator resource.
 * @param name The full name of the creator.
 * @param role The role of the creator in the parent entity.
 */
data class CreatorSummary (

    /* The path to the individual creator resource. */
    val resourceURI: String? = null,
    /* The full name of the creator. */
    val name: String? = null,
    /* The role of the creator in the parent entity. */
    val role: String? = null
) {
}