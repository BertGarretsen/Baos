package me.imspooks.baos;

import me.imspooks.baos.io.BaosInputStream;

/**
 * Created by Nick on 05 aug. 2021.
 * Copyright © ImSpooks
 */
public interface BaosDeserializer {

    void deserialize(BaosInputStream in);
}