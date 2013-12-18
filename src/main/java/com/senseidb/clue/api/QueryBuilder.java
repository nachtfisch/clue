package com.senseidb.clue.api;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.search.Query;
import org.apache.lucene.util.Version;

public interface QueryBuilder {  
  void initialize(String defaultField, Analyzer analyzer, Version luceneVersion) throws Exception;
  Query build(String rawQuery) throws Exception;
}
