package com.toportyu.web

import com.toportyu.model.Document
import com.toportyu.service.DocumentService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

/**
 * Created by csaba.juhasz on 10/21/2016.
 */
@RestController
class DocumentController (val documentService: DocumentService) {

    // Unlike Java, Kotlin currently does not allow to specify array
    // annotation attribute as a single value except for value attribute,
    // so be aware that you will have to write arrayOf()

    @RequestMapping(value = "/documents", method = arrayOf(RequestMethod.GET))
    fun getAllDocuments(): Iterable<Document> = documentService.getAllDocuments()

    @RequestMapping(value = "/documents", method = arrayOf(RequestMethod.POST), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun saveNewDocument(@RequestBody newDocument: Document): Document = documentService.save(newDocument)

    // todo: write in one fun?
    @RequestMapping(value = "/documents/{title}", method = arrayOf(RequestMethod.GET))
    fun getAllDocuments(@PathVariable title: String): Iterable<Document> = documentService.findByTitle(title)
}