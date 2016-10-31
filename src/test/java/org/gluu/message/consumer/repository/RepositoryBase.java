package org.gluu.message.consumer.repository;

import org.junit.Before;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.test.web.servlet.MockMvc;

import javax.inject.Inject;
import java.text.SimpleDateFormat;

/**
 * Created by eugeniuparvan on 10/31/16.
 */
public class RepositoryBase<T extends PagingAndSortingRepository & ILogCleaner> {

    @Inject
    protected MockMvc mockMvc;

    @Inject
    protected T repository;

    protected SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Before
    public void deleteAllBeforeTests() throws Exception {
        repository.deleteAll();
    }
}
