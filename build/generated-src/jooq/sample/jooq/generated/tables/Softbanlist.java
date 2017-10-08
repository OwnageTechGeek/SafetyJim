/*
 * This file is generated by jOOQ.
*/
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.SoftbanlistRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Softbanlist extends TableImpl<SoftbanlistRecord> {

    private static final long serialVersionUID = 759249517;

    /**
     * The reference instance of <code>public.softbanlist</code>
     */
    public static final Softbanlist SOFTBANLIST = new Softbanlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SoftbanlistRecord> getRecordType() {
        return SoftbanlistRecord.class;
    }

    /**
     * The column <code>public.softbanlist.id</code>.
     */
    public final TableField<SoftbanlistRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('softbanlist_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.softbanlist.userid</code>.
     */
    public final TableField<SoftbanlistRecord, String> USERID = createField("userid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.softbanlist.moderatoruserid</code>.
     */
    public final TableField<SoftbanlistRecord, String> MODERATORUSERID = createField("moderatoruserid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.softbanlist.guildid</code>.
     */
    public final TableField<SoftbanlistRecord, String> GUILDID = createField("guildid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.softbanlist.softbantime</code>.
     */
    public final TableField<SoftbanlistRecord, Long> SOFTBANTIME = createField("softbantime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.softbanlist.deletedays</code>.
     */
    public final TableField<SoftbanlistRecord, Integer> DELETEDAYS = createField("deletedays", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.softbanlist.reason</code>.
     */
    public final TableField<SoftbanlistRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.softbanlist</code> table reference
     */
    public Softbanlist() {
        this("softbanlist", null);
    }

    /**
     * Create an aliased <code>public.softbanlist</code> table reference
     */
    public Softbanlist(String alias) {
        this(alias, SOFTBANLIST);
    }

    private Softbanlist(String alias, Table<SoftbanlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Softbanlist(String alias, Table<SoftbanlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SoftbanlistRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SOFTBANLIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SoftbanlistRecord> getPrimaryKey() {
        return Keys.SOFTBANLIST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SoftbanlistRecord>> getKeys() {
        return Arrays.<UniqueKey<SoftbanlistRecord>>asList(Keys.SOFTBANLIST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Softbanlist as(String alias) {
        return new Softbanlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Softbanlist rename(String name) {
        return new Softbanlist(name, null);
    }
}
