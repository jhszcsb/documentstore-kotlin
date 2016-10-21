package com.toportyu.service

import com.toportyu.model.Document
import com.toportyu.repository.DocumentRepository
import org.springframework.stereotype.Service

/**
 * Created by csaba.juhasz on 10/21/2016.
 */
@Service
class DocumentService (val documentRepository: DocumentRepository) {

    fun getAllDocuments(): Iterable<Document> = documentRepository.findAll()
    // return type can be inferred + block not necessary as one line
    // however, the ide is suggesting to specify the type

    fun save(document: Document): Document = documentRepository.save(document)

    fun findByTitle(title: String) = documentRepository.findByTitle(title)
}