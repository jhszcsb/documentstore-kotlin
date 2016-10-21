package com.toportyu.repository

import com.toportyu.model.Document
import org.springframework.data.repository.CrudRepository

/**
 * Created by csaba.juhasz on 10/21/2016.
 */
interface DocumentRepository : CrudRepository<Document, Long> {

    fun findByTitle(title: String): Iterable<Document>
}