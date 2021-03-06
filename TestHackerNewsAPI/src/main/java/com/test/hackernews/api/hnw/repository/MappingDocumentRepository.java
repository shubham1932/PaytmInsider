package com.test.hackernews.api.hnw.repository;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.stereotype.Repository;

import com.test.hackernews.api.hnw.model.MappingDocument;



@Repository
@ViewIndexed(designDoc = "mappingDocs")
public interface MappingDocumentRepository extends BaseRepository<MappingDocument, String> {


}
