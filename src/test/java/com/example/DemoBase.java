package com.example;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public abstract class DemoBase {

    @InjectMocks
    private DemoController demoController;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(demoController);
    }

}
