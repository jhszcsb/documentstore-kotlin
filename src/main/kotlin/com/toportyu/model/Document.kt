package com.toportyu.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by csaba.juhasz on 10/21/2016.
 */
@Entity
data class Document(@Id @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO) var id: Long = 0,
                    var title: String = "",
                    var body: String = "",
                    @JsonIgnore var internalMessage: String ? = null)

// default values are necessary if you want Kotlin to create a default constructor automatically