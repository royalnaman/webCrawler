package com.naman.jain.WebCrawler.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.concurrent.Future;

@Builder
@Getter
public class CrawlerModel {
    private String currentURL;
    private List<Future<CrawlerModel>> childrenFutures;
    private int currentDepth;
    private String error;
}
