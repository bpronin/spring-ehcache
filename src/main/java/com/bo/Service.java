package com.bo;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.Date;

/**
 * Class Service.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class Service {

    private int counter = 0;

    @Cacheable("reports")
    public String getReport() {
        return (counter++) + " [" + new Date() + "]";
    }

    @CacheEvict(value = "reports", allEntries = true)
    public void resetCache() {
        System.out.println("clear");
    }
}
