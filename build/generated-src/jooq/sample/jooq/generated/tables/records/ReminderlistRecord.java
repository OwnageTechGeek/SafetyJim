/*
 * This file is generated by jOOQ.
*/
package jooq.generated.tables.records;


import javax.annotation.Generated;

import jooq.generated.tables.Reminderlist;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ReminderlistRecord extends UpdatableRecordImpl<ReminderlistRecord> implements Record8<Integer, String, String, String, Long, Long, Boolean, String> {

    private static final long serialVersionUID = 1041992401;

    /**
     * Setter for <code>public.reminderlist.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.reminderlist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.reminderlist.userid</code>.
     */
    public void setUserid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.reminderlist.userid</code>.
     */
    public String getUserid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.reminderlist.channelid</code>.
     */
    public void setChannelid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.reminderlist.channelid</code>.
     */
    public String getChannelid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.reminderlist.guildid</code>.
     */
    public void setGuildid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.reminderlist.guildid</code>.
     */
    public String getGuildid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.reminderlist.createtime</code>.
     */
    public void setCreatetime(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.reminderlist.createtime</code>.
     */
    public Long getCreatetime() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.reminderlist.remindtime</code>.
     */
    public void setRemindtime(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.reminderlist.remindtime</code>.
     */
    public Long getRemindtime() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.reminderlist.reminded</code>.
     */
    public void setReminded(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.reminderlist.reminded</code>.
     */
    public Boolean getReminded() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.reminderlist.message</code>.
     */
    public void setMessage(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.reminderlist.message</code>.
     */
    public String getMessage() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Long, Long, Boolean, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Long, Long, Boolean, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Reminderlist.REMINDERLIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Reminderlist.REMINDERLIST.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Reminderlist.REMINDERLIST.CHANNELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Reminderlist.REMINDERLIST.GUILDID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Reminderlist.REMINDERLIST.CREATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Reminderlist.REMINDERLIST.REMINDTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Reminderlist.REMINDERLIST.REMINDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Reminderlist.REMINDERLIST.MESSAGE;
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
        return getChannelid();
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
        return getCreatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getRemindtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getReminded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value2(String value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value3(String value) {
        setChannelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value4(String value) {
        setGuildid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value5(Long value) {
        setCreatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value6(Long value) {
        setRemindtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value7(Boolean value) {
        setReminded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord value8(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReminderlistRecord values(Integer value1, String value2, String value3, String value4, Long value5, Long value6, Boolean value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReminderlistRecord
     */
    public ReminderlistRecord() {
        super(Reminderlist.REMINDERLIST);
    }

    /**
     * Create a detached, initialised ReminderlistRecord
     */
    public ReminderlistRecord(Integer id, String userid, String channelid, String guildid, Long createtime, Long remindtime, Boolean reminded, String message) {
        super(Reminderlist.REMINDERLIST);

        set(0, id);
        set(1, userid);
        set(2, channelid);
        set(3, guildid);
        set(4, createtime);
        set(5, remindtime);
        set(6, reminded);
        set(7, message);
    }
}
