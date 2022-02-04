package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.z2 */
public class C2887z2 extends SQLiteOpenHelper {

    /* renamed from: b */
    private static C2775u f9722b;

    /* renamed from: c */
    private static C2887z2 f9723c;

    /* renamed from: d */
    public boolean f9724d = false;

    public C2887z2(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static synchronized C2887z2 m11970a(Context context, String str, C2775u uVar) {
        C2887z2 z2Var;
        synchronized (C2887z2.class) {
            f9722b = uVar;
            if (f9723c == null) {
                f9723c = new C2887z2(context.getApplicationContext(), str);
            }
            z2Var = f9723c;
        }
        return z2Var;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f9724d = true;
        sQLiteDatabase.execSQL(((((("CREATE TABLE roms(_id integer primary key autoincrement, mdbid integer, gdbid integer, crc integer, gfcover text," + "title text, sortname text, system text, pathid integer, filename text, foldername text, merged_with integer default -1, emulator integer,") + "last_played integer, times_played integer, time_played integer, favorite int, released integer, publisher text, developer text, info text, notes text,") + "merged_last_played integer, merged_times_played integer, merged_time_played integer, rating real,") + "comments INTEGER NOT NULL default 0,lastcomment INTEGER NOT NULL DEFAULT 0,c_rating real NOT NULL default 0, c_rating_count integer NOT NULL default 0,") + "c_played_total integer NOT NULL default 0, c_played_count integer NOT NULL default 0,fuzzy_match integer,forumcreated INTEGER NOT NULL DEFAULT 0,") + "present integer, ignored integer, cover_status integer, cover_requested integer, has_images integer, age_rating integer, youtube text )");
        sQLiteDatabase.execSQL("CREATE INDEX mdbididx ON roms (mdbid)");
        sQLiteDatabase.execSQL("CREATE INDEX sortidx ON roms (sortname)");
        sQLiteDatabase.execSQL("CREATE INDEX sysidx ON roms (system)");
        sQLiteDatabase.execSQL("CREATE INDEX pathididx ON roms (pathid)");
        sQLiteDatabase.execSQL("CREATE INDEX fileidx ON roms (filename)");
        sQLiteDatabase.execSQL("CREATE INDEX mergeidx ON roms (merged_with)");
        sQLiteDatabase.execSQL("CREATE INDEX relidx ON roms (released)");
        sQLiteDatabase.execSQL("CREATE INDEX lpidx ON roms (last_played)");
        sQLiteDatabase.execSQL("CREATE INDEX favidx ON roms (favorite)");
        sQLiteDatabase.execSQL("CREATE INDEX covidx ON roms (cover_status)");
        sQLiteDatabase.execSQL("CREATE INDEX covreqidx ON roms (cover_requested)");
        sQLiteDatabase.execSQL("CREATE INDEX mergedidx ON roms (merged_with)");
        sQLiteDatabase.execSQL("CREATE INDEX cratingidx ON roms (c_rating)");
        sQLiteDatabase.execSQL("CREATE INDEX cratingcountidx ON roms (c_rating_count)");
        sQLiteDatabase.execSQL("CREATE INDEX cplayedtotalidx ON roms (c_played_total)");
        sQLiteDatabase.execSQL("CREATE INDEX cplayedcountidx ON roms (c_played_count)");
        sQLiteDatabase.execSQL("CREATE INDEX fuzzyidx ON roms (fuzzy_match)");
        sQLiteDatabase.execSQL("CREATE INDEX has_images_idx ON roms (has_images)");
        sQLiteDatabase.execSQL(((("CREATE TABLE systems(_id integer primary key autoincrement, slug text, parent text, name text, type text," + "introduced integer, generation integer, extensions text, folder_exts text, numgames integer, emulator integer,") + "overlay text, overlay_opacity real NOT NULL default 0.7, user_set_overlay integer not null default 0,") + "forumcreated INTEGER NOT NULL DEFAULT 0,has_theme_icon INTEGER,icon_aspect_ratio REAL NOT NULL DEFAULT 1.0,") + "ignored integer NOT NULL default 0, show_covers INTEGER NOT NULL DEFAULT 1, show_merged INTEGER NOT NULL DEFAULT 1 )");
        sQLiteDatabase.execSQL("CREATE INDEX slug_idx ON systems (slug)");
        sQLiteDatabase.execSQL("CREATE INDEX numgames_idx ON systems (numgames)");
        sQLiteDatabase.execSQL("CREATE TABLE emulators(_id integer primary key autoincrement, name text, system text, package text, class text, core text, config_dir text, rom_key text, action_type text, data_type text, takes_zip integer, use_retroarch64 integer not null default 0,user_edited integer not null default 0 )");
        sQLiteDatabase.execSQL("CREATE INDEX sysidx2 ON emulators (system)");
        sQLiteDatabase.execSQL("CREATE TABLE genres(_id integer primary key autoincrement, name text)");
        sQLiteDatabase.execSQL("CREATE INDEX nameidx ON genres( name ) ");
        sQLiteDatabase.execSQL("CREATE TABLE gamegenres( _id integer primary key autoincrement, game integer, genre integer)");
        sQLiteDatabase.execSQL("CREATE INDEX gameidx ON gamegenres( game )");
        sQLiteDatabase.execSQL("CREATE INDEX genreidx ON gamegenres( genre )");
        sQLiteDatabase.execSQL("CREATE TABLE collections(_id integer primary key autoincrement, name text, parent integer, isfolder integer )");
        sQLiteDatabase.execSQL("CREATE INDEX collectionidx ON collections( parent, name ) ");
        sQLiteDatabase.execSQL("CREATE TABLE gamecollection( _id integer primary key autoincrement, game integer, collection integer)");
        sQLiteDatabase.execSQL("CREATE INDEX colectiongameidx ON gamegenres( game )");
        sQLiteDatabase.execSQL("CREATE INDEX colectioncolectionidx ON gamegenres( genre )");
        sQLiteDatabase.execSQL("CREATE TABLE rompaths( _id integer primary key autoincrement, system text, path text, uri text, selected integer, last_checked integer, present integer not null default 1, matches integer not null default 0, restoring integer not null default 0 )");
        sQLiteDatabase.execSQL("CREATE INDEX pathidx ON rompaths( path )");
        sQLiteDatabase.execSQL("CREATE TABLE main(_id integer primary key autoincrement, type integer, enabled integer NOT NULL DEFAULT 1, position integer, itemid integer, itemaux integer )");
        int i = 0;
        while (i < 7) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("position", Integer.valueOf(i < 6 ? i : 9999999));
            sQLiteDatabase.insert("main", null, contentValues);
            i++;
        }
        sQLiteDatabase.execSQL("CREATE TABLE themes(_id integer primary key autoincrement, name text, forum_id integer, image_url text, modified integer, minsize integer, maxsize integer)");
        sQLiteDatabase.execSQL("CREATE INDEX themenameidx ON themes( name ) ");
        sQLiteDatabase.execSQL("CREATE INDEX thememodifiedidx ON themes( modified ) ");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
