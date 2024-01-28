package com.naman.jain.WebCrawler.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

public class CrawlerModelTest {

    @Test
    public void testModelCreation(){
        List<Future<CrawlerModel>> actual = Collections.emptyList();
        int currentDepth = 10;
        String actualURL = "someURL";
        String actualError = "actualError";
        CrawlerModel model = CrawlerModel.builder()
                .currentURL(actualURL)
                .currentDepth(currentDepth)
                .childrenFutures(actual)
                .error(actualError)
                .build();
        Assert.assertNotNull(model);
        Assert.assertEquals(actualURL, model.getCurrentURL());
        Assert.assertEquals(currentDepth, model.getCurrentDepth());
        Assert.assertEquals(actual, model.getChildrenFutures());
        Assert.assertEquals(actualError, model.getError());
    }
}