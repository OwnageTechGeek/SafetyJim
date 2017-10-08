/*
 * This file is generated by jOOQ.
*/
package jooq.generated.tables.records;


import javax.annotation.Generated;

import jooq.generated.tables.Kicklist;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class KicklistRecord extends UpdatableRecordImpl<KicklistRecord> implements Record6<Integer, String, String, String, Long, String> {

    private static final long serialVersionUID = -955581960;

    /**
     * Setter for <code>public.kicklist.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.kicklist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.kicklist.userid</code>.
     */
    public void setUserid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.kicklist.userid</code>.
     */
    public String getUserid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.kicklist.moderatoruserid</code>.
     */
    public void setModeratoruserid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.kicklist.moderatoruserid</code>.
     */
    public String getModeratoruserid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.kicklist.guildid</code>.
     */
    public void setGuildid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.kicklist.guildid</code>.
     */
    public String getGuildid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.kicklist.kicktime</code>.
     */
    public void setKicktime(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.kicklist.kicktime</code>.
     */
    public Long getKicktime() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.kicklist.reason</code>.
     */
    public void setReason(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.kicklist.reason</code>.
     */
    public String getReason() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Kicklist.KICKLIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Kicklist.KICKLIST.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Kicklist.KICKLIST.MODERATORUSERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Kicklist.KICKLIST.GUILDID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Kicklist.KICKLIST.KICKTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Kicklist.KICKLIST.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModeratoruserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGuildid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getKicktime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord value2(String value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord value3(String value) {
        setModeratoruserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord value4(String value) {
        setGuildid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord value5(Long value) {
        setKicktime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord value6(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KicklistRecord values(Integer value1, String value2, String value3, String value4, Long value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KicklistRecord
     */
    public KicklistRecord() {
        super(Kicklist.KICKLIST);
    }

    /**
     * Create a detached, initialised KicklistRecord
     */
    public KicklistRecord(Integer id, String userid, String moderatoruserid, String guildid, Long kicktime, String reason) {
        super(Kicklist.KICKLIST);

        set(0, id);
        set(1, userid);
        set(2, moderatoruserid);
        set(3, guildid);
        set(4, kicktime);
        set(5, reason);
    }
}
