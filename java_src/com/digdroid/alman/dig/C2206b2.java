package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.b2 */
public class C2206b2 extends AbstractC2526p {

    /* renamed from: e */
    SQLiteDatabase f7919e;

    /* renamed from: f */
    SQLiteDatabase f7920f;

    public C2206b2() {
    }

    public C2206b2(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        this.f7919e = sQLiteDatabase;
        this.f7920f = sQLiteDatabase2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: b */
    public String mo8091b(long j) {
        String str = null;
        Cursor rawQuery = this.f7920f.rawQuery("SELECT title,system FROM roms WHERE _id=" + j, null);
        if (rawQuery.moveToFirst()) {
            str = "http://www.mobygames.com/game/" + mo8093f(rawQuery.getString(1)) + "/" + mo8094g(rawQuery.getString(0));
        }
        rawQuery.close();
        return str;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2526p
    /* renamed from: c */
    public String mo8092c(int i, String str, long j, long j2, String str2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo8093f(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1768596351:
                if (str.equals("gamegear")) {
                    c = 0;
                    break;
                }
                break;
            case -1411061736:
                if (str.equals("apple2")) {
                    c = 1;
                    break;
                }
                break;
            case -1215608382:
                if (str.equals("dreamcast")) {
                    c = 2;
                    break;
                }
                break;
            case -909461557:
                if (str.equals("saturn")) {
                    c = 3;
                    break;
                }
                break;
            case -861391249:
                if (str.equals("android")) {
                    c = 4;
                    break;
                }
                break;
            case -807883082:
                if (str.equals("x68000")) {
                    c = 5;
                    break;
                }
                break;
            case -692392346:
                if (str.equals("atarist")) {
                    c = 6;
                    break;
                }
                break;
            case -682220596:
                if (str.equals("wonderswan")) {
                    c = 7;
                    break;
                }
                break;
            case -667060529:
                if (str.equals("spectrumzx")) {
                    c = '\b';
                    break;
                }
                break;
            case 3291:
                if (str.equals("gb")) {
                    c = '\t';
                    break;
                }
                break;
            case 3292:
                if (str.equals("gc")) {
                    c = '\n';
                    break;
                }
                break;
            case 3479:
                if (str.equals("md")) {
                    c = 11;
                    break;
                }
                break;
            case 3571:
                if (str.equals("pc")) {
                    c = '\f';
                    break;
                }
                break;
            case 52222:
                if (str.equals("3do")) {
                    c = '\r';
                    break;
                }
                break;
            case 96865:
                if (str.equals("c64")) {
                    c = 14;
                    break;
                }
                break;
            case 102118:
                if (str.equals("gba")) {
                    c = 15;
                    break;
                }
                break;
            case 102120:
                if (str.equals("gbc")) {
                    c = 16;
                    break;
                }
                break;
            case 107436:
                if (str.equals("n64")) {
                    c = 17;
                    break;
                }
                break;
            case 108434:
                if (str.equals("msx")) {
                    c = 18;
                    break;
                }
                break;
            case 108925:
                if (str.equals("nds")) {
                    c = 19;
                    break;
                }
                break;
            case 108956:
                if (str.equals("nes")) {
                    c = 20;
                    break;
                }
                break;
            case 110802:
                if (str.equals("pce")) {
                    c = 21;
                    break;
                }
                break;
            case 111247:
                if (str.equals("ps2")) {
                    c = 22;
                    break;
                }
                break;
            case 111309:
                if (str.equals("psp")) {
                    c = 23;
                    break;
                }
                break;
            case 111317:
                if (str.equals("psx")) {
                    c = 24;
                    break;
                }
                break;
            case 114009:
                if (str.equals("sms")) {
                    c = 25;
                    break;
                }
                break;
            case 117719:
                if (str.equals("wii")) {
                    c = 26;
                    break;
                }
                break;
            case 3534921:
                if (str.equals("snes")) {
                    c = 27;
                    break;
                }
                break;
            case 10614995:
                if (str.equals("atari800")) {
                    c = 28;
                    break;
                }
                break;
            case 35217721:
                if (str.equals("colecovision")) {
                    c = 29;
                    break;
                }
                break;
            case 92932951:
                if (str.equals("amiga")) {
                    c = 30;
                    break;
                }
                break;
            case 112200270:
                if (str.equals("vic20")) {
                    c = 31;
                    break;
                }
                break;
            case 328891913:
                if (str.equals("atari2600")) {
                    c = ' ';
                    break;
                }
                break;
            case 461338414:
                if (str.equals("amstradcpc")) {
                    c = '!';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "game-gear";
            case 1:
            case 2:
            case 4:
            case 7:
            case '\r':
            case 14:
            case 17:
            case 18:
            case 20:
            case 22:
            case 23:
            case 26:
            case 27:
            case 29:
            case 30:
                return str;
            case 3:
                return "sega-saturn";
            case 5:
                return "sharp-x68000";
            case 6:
                return "atari-st";
            case '\b':
                return "zx-spectrum";
            case '\t':
                return "gameboy";
            case '\n':
                return "gamecube";
            case 11:
                return "genesis";
            case '\f':
                return "dos";
            case 15:
                return "gameboy-advance";
            case 16:
                return "gameboy-color";
            case 19:
                return "nintendo-ds";
            case 21:
                return "turbo-grafx";
            case 24:
                return "playstation";
            case 25:
                return "sega-master-system";
            case 28:
                return "atari-8-bit";
            case 31:
                return "vic-20";
            case ' ':
                return "atari-2600";
            case '!':
                return "cpc";
            default:
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8094g(String str) {
        return str.toLowerCase().replaceFirst("^(the|a) ", "").replaceAll("-", " ").replaceAll(" +", " ").replaceAll("[^a-z0-9 ]", "").trim().replaceAll(" ", "-");
    }
}
