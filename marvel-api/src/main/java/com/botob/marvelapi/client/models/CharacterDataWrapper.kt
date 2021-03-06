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

import com.botob.marvelapi.client.models.CharacterDataContainer

/**
 * 
 * @param code 
 * @param status A string description of the call status.
 * @param copyright The copyright notice for the returned result.
 * @param attributionText The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
 * @param attributionHTML An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
 * @param &#x60;data&#x60; 
 * @param etag A digest value of the content returned by the call.
 */
data class CharacterDataWrapper (

    val code: Int? = null,
    /* A string description of the call status. */
    val status: String? = null,
    /* The copyright notice for the returned result. */
    val copyright: String? = null,
    /* The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API. */
    val attributionText: String? = null,
    /* An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API. */
    val attributionHTML: String? = null,
    val `data`: CharacterDataContainer? = null,
    /* A digest value of the content returned by the call. */
    val etag: String? = null
) {
}