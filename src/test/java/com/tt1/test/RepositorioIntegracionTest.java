package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;

public class RepositorioIntegracionTest extends IRepositorioTestTemplate {
    @Override
    @BeforeEach
    void setup() {
        super.repo = new Repositorio(new DBStub());
    }

}
