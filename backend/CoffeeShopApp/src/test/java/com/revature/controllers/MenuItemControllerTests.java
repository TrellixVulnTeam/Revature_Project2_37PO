package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.models.*;
import com.revature.services.DailySpecialService;
import com.revature.services.MenuItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest(classes = com.revature.app.CoffeeShopAppApplication.class)
@TestPropertySource("classpath:application-test.properties")
public class MenuItemControllerTests {
    @MockBean
    MenuItemService os;
    @Autowired
    MockMvc mvc;

    @Test
    void getAllMenuItems() throws Exception {
        ResultActions ra = mvc.perform(MockMvcRequestBuilders.get("/menuItems"));
        ra.andExpect(MockMvcResultMatchers.status().isOk());
    }
}
