package com.luizleite.service;

import com.luizleite.entity.Operation;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Date;

@QuarkusTest
public class OperationTest {

    @Test
    public void createOperationClass() {
        Operation operation = new Operation("STOK-CODE", new Date(), 5L, 15.3, 0.5, "Broker");
    }

}
