package com.github.mjdbc;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Sets statement's parameter value using position idx provided.
 * See {@link Binders} for sample implementations.
 */
public interface DbBinder<T> {
    void bind(@NotNull PreparedStatement statement, int idx, @Nullable T value) throws SQLException;
}
