package com.capsteam;

import com.capsteam.service.ReadService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ReadService.class)
public class ReadServiceTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void loadData(){

    }
}
