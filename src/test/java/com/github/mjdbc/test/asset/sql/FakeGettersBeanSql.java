package com.github.mjdbc.test.asset.sql;

import com.github.mjdbc.Bind;
import com.github.mjdbc.BindBean;
import com.github.mjdbc.Sql;
import com.github.mjdbc.UseGeneratedKeys;
import com.github.mjdbc.test.asset.model.FakeGettersBean;

public interface FakeGettersBeanSql {

    @Sql("INSERT INTO bean(boolean_field, int_field, string_field, int_value_field) " +
            "VALUES(:booleanField, :intField, :stringField, :intValueField)")
    @UseGeneratedKeys
    long insert(@BindBean FakeGettersBean bean);

    @Sql("UPDATE bean SET boolean_field = :booleanField, int_field = :intField, string_field = :stringField, int_value_field = :intValueField " +
            "WHERE id = :id")
    void update(@BindBean FakeGettersBean bean);

    @Sql("SELECT * FROM bean WHERE id = :id")
    FakeGettersBean get(@Bind("id") long id);
}
