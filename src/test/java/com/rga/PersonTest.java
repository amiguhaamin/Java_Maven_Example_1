package com.rga;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class PersonTest {

    private Person person = new Person();

    @Test
    public void greeterSaysHello() {
        MatcherAssert.assertThat(person.greet(), CoreMatchers.containsString("Hello"));
    }

}
