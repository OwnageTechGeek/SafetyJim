/*
 * This file is generated by jOOQ.
*/
package jooq.generated;


import javax.annotation.Generated;

import jooq.generated.tables.Banlist;
import jooq.generated.tables.Commandlogs;
import jooq.generated.tables.Joinlist;
import jooq.generated.tables.Kicklist;
import jooq.generated.tables.Mutelist;
import jooq.generated.tables.Reminderlist;
import jooq.generated.tables.Settings;
import jooq.generated.tables.Softbanlist;
import jooq.generated.tables.Taglist;
import jooq.generated.tables.Warnlist;
import jooq.generated.tables.records.BanlistRecord;
import jooq.generated.tables.records.CommandlogsRecord;
import jooq.generated.tables.records.JoinlistRecord;
import jooq.generated.tables.records.KicklistRecord;
import jooq.generated.tables.records.MutelistRecord;
import jooq.generated.tables.records.ReminderlistRecord;
import jooq.generated.tables.records.SettingsRecord;
import jooq.generated.tables.records.SoftbanlistRecord;
import jooq.generated.tables.records.TaglistRecord;
import jooq.generated.tables.records.WarnlistRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BanlistRecord, Integer> IDENTITY_BANLIST = Identities0.IDENTITY_BANLIST;
    public static final Identity<CommandlogsRecord, Integer> IDENTITY_COMMANDLOGS = Identities0.IDENTITY_COMMANDLOGS;
    public static final Identity<JoinlistRecord, Integer> IDENTITY_JOINLIST = Identities0.IDENTITY_JOINLIST;
    public static final Identity<KicklistRecord, Integer> IDENTITY_KICKLIST = Identities0.IDENTITY_KICKLIST;
    public static final Identity<MutelistRecord, Integer> IDENTITY_MUTELIST = Identities0.IDENTITY_MUTELIST;
    public static final Identity<ReminderlistRecord, Integer> IDENTITY_REMINDERLIST = Identities0.IDENTITY_REMINDERLIST;
    public static final Identity<SoftbanlistRecord, Integer> IDENTITY_SOFTBANLIST = Identities0.IDENTITY_SOFTBANLIST;
    public static final Identity<WarnlistRecord, Integer> IDENTITY_WARNLIST = Identities0.IDENTITY_WARNLIST;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BanlistRecord> BANLIST_PKEY = UniqueKeys0.BANLIST_PKEY;
    public static final UniqueKey<CommandlogsRecord> COMMANDLOGS_PKEY = UniqueKeys0.COMMANDLOGS_PKEY;
    public static final UniqueKey<JoinlistRecord> JOINLIST_PKEY = UniqueKeys0.JOINLIST_PKEY;
    public static final UniqueKey<KicklistRecord> KICKLIST_PKEY = UniqueKeys0.KICKLIST_PKEY;
    public static final UniqueKey<MutelistRecord> MUTELIST_PKEY = UniqueKeys0.MUTELIST_PKEY;
    public static final UniqueKey<ReminderlistRecord> REMINDERLIST_PKEY = UniqueKeys0.REMINDERLIST_PKEY;
    public static final UniqueKey<SettingsRecord> SETTINGS_PKEY = UniqueKeys0.SETTINGS_PKEY;
    public static final UniqueKey<SoftbanlistRecord> SOFTBANLIST_PKEY = UniqueKeys0.SOFTBANLIST_PKEY;
    public static final UniqueKey<TaglistRecord> TAGLIST_PKEY = UniqueKeys0.TAGLIST_PKEY;
    public static final UniqueKey<WarnlistRecord> WARNLIST_PKEY = UniqueKeys0.WARNLIST_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<BanlistRecord, Integer> IDENTITY_BANLIST = createIdentity(Banlist.BANLIST, Banlist.BANLIST.ID);
        public static Identity<CommandlogsRecord, Integer> IDENTITY_COMMANDLOGS = createIdentity(Commandlogs.COMMANDLOGS, Commandlogs.COMMANDLOGS.ID);
        public static Identity<JoinlistRecord, Integer> IDENTITY_JOINLIST = createIdentity(Joinlist.JOINLIST, Joinlist.JOINLIST.ID);
        public static Identity<KicklistRecord, Integer> IDENTITY_KICKLIST = createIdentity(Kicklist.KICKLIST, Kicklist.KICKLIST.ID);
        public static Identity<MutelistRecord, Integer> IDENTITY_MUTELIST = createIdentity(Mutelist.MUTELIST, Mutelist.MUTELIST.ID);
        public static Identity<ReminderlistRecord, Integer> IDENTITY_REMINDERLIST = createIdentity(Reminderlist.REMINDERLIST, Reminderlist.REMINDERLIST.ID);
        public static Identity<SoftbanlistRecord, Integer> IDENTITY_SOFTBANLIST = createIdentity(Softbanlist.SOFTBANLIST, Softbanlist.SOFTBANLIST.ID);
        public static Identity<WarnlistRecord, Integer> IDENTITY_WARNLIST = createIdentity(Warnlist.WARNLIST, Warnlist.WARNLIST.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<BanlistRecord> BANLIST_PKEY = createUniqueKey(Banlist.BANLIST, "banlist_pkey", Banlist.BANLIST.ID);
        public static final UniqueKey<CommandlogsRecord> COMMANDLOGS_PKEY = createUniqueKey(Commandlogs.COMMANDLOGS, "commandlogs_pkey", Commandlogs.COMMANDLOGS.ID);
        public static final UniqueKey<JoinlistRecord> JOINLIST_PKEY = createUniqueKey(Joinlist.JOINLIST, "joinlist_pkey", Joinlist.JOINLIST.ID);
        public static final UniqueKey<KicklistRecord> KICKLIST_PKEY = createUniqueKey(Kicklist.KICKLIST, "kicklist_pkey", Kicklist.KICKLIST.ID);
        public static final UniqueKey<MutelistRecord> MUTELIST_PKEY = createUniqueKey(Mutelist.MUTELIST, "mutelist_pkey", Mutelist.MUTELIST.ID);
        public static final UniqueKey<ReminderlistRecord> REMINDERLIST_PKEY = createUniqueKey(Reminderlist.REMINDERLIST, "reminderlist_pkey", Reminderlist.REMINDERLIST.ID);
        public static final UniqueKey<SettingsRecord> SETTINGS_PKEY = createUniqueKey(Settings.SETTINGS, "settings_pkey", Settings.SETTINGS.GUILDID, Settings.SETTINGS.KEY);
        public static final UniqueKey<SoftbanlistRecord> SOFTBANLIST_PKEY = createUniqueKey(Softbanlist.SOFTBANLIST, "softbanlist_pkey", Softbanlist.SOFTBANLIST.ID);
        public static final UniqueKey<TaglistRecord> TAGLIST_PKEY = createUniqueKey(Taglist.TAGLIST, "taglist_pkey", Taglist.TAGLIST.GUILDID, Taglist.TAGLIST.NAME);
        public static final UniqueKey<WarnlistRecord> WARNLIST_PKEY = createUniqueKey(Warnlist.WARNLIST, "warnlist_pkey", Warnlist.WARNLIST.ID);
    }
}
