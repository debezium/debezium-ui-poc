package io.debezium.configserver;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeValidatePostgresConnectionIT extends ValidatePostgresConnectionIT {

    // Execute the same tests but in native mode.
}