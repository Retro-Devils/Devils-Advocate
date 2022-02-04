package com.digdroid.alman.dig;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p006b.p007a.C0763j;

/* renamed from: com.digdroid.alman.dig.l0 */
class C2456l0 {

    /* renamed from: a */
    SQLiteDatabase f8578a;

    /* renamed from: b */
    Pattern f8579b = Pattern.compile("^(the|an?) ");

    /* renamed from: c */
    Pattern f8580c = Pattern.compile("[^a-z0-9]");

    /* renamed from: d */
    Pattern f8581d = Pattern.compile("(?:\\:|\\- ).+$");

    /* renamed from: e */
    Pattern f8582e = Pattern.compile("^(.*), ?(the|an?)(.*)$", 2);

    public C2456l0(SQLiteDatabase sQLiteDatabase) {
        this.f8578a = sQLiteDatabase;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo8708a(String str, boolean z) {
        int lastIndexOf;
        if (Pattern.compile("^\\d\\d\\d\\d - ").matcher(str).find()) {
            str = str.substring(7);
        }
        if (!z && (lastIndexOf = str.lastIndexOf(46)) > 0) {
            str = str.substring(0, lastIndexOf);
        }
        int indexOf = str.indexOf(40);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(91);
        if (indexOf2 > 0) {
            str = str.substring(0, indexOf2);
        }
        return str.replaceAll("_", " ").trim();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo8709b(String str) {
        int indexOf = str.indexOf(40);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(91);
        if (indexOf2 > 0) {
            str = str.substring(0, indexOf2);
        }
        Matcher matcher = this.f8582e.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        return matcher.group(2) + " " + matcher.group(1) + matcher.group(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8710c(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 50:
                if (str.equals("2")) {
                    c = 0;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 1;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 2;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    c = 5;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c = 6;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    c = 7;
                    break;
                }
                break;
            case C0763j.f3613H0:
                if (str.equals("v")) {
                    c = '\b';
                    break;
                }
                break;
            case 3360:
                if (str.equals("ii")) {
                    c = '\t';
                    break;
                }
                break;
            case 3373:
                if (str.equals("iv")) {
                    c = '\n';
                    break;
                }
                break;
            case 3375:
                if (str.equals("ix")) {
                    c = 11;
                    break;
                }
                break;
            case 3763:
                if (str.equals("vi")) {
                    c = '\f';
                    break;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = '\r';
                    break;
                }
                break;
            case 116758:
                if (str.equals("vii")) {
                    c = 14;
                    break;
                }
                break;
            case 3619603:
                if (str.equals("viii")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case '\t':
                return 2;
            case 1:
            case '\r':
                return 3;
            case 2:
            case '\n':
                return 4;
            case 3:
            case '\b':
                return 5;
            case 4:
            case '\f':
                return 6;
            case 5:
            case 14:
                return 7;
            case 6:
            case 15:
                return 8;
            case 7:
            case 11:
                return 9;
            default:
                return 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo8711d(long j, SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT gdbid,gfcover FROM games WHERE _id=" + j, null);
        boolean z = false;
        if (rawQuery.moveToFirst() && (rawQuery.getLong(0) >= 0 || (!rawQuery.isNull(1) && !rawQuery.getString(1).equals("")))) {
            z = true;
        }
        rawQuery.close();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo8712e(String str, String str2, boolean z, int i, boolean z2) {
        return mo8713f(str, str2, z, i, z2, this.f8578a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0416 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo8713f(java.lang.String r24, java.lang.String r25, boolean r26, int r27, boolean r28, android.database.sqlite.SQLiteDatabase r29) {
        /*
        // Method dump skipped, instructions count: 1170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2456l0.mo8713f(java.lang.String, java.lang.String, boolean, int, boolean, android.database.sqlite.SQLiteDatabase):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8714g(String str) {
        return mo8709b(str).toLowerCase().replaceAll("(the|an?|or|and|of|in|to) ", " ").replaceAll("[^ a-z0-9]", " ").replaceAll(" {2,}", " ").trim().replaceAll(" ", " OR ");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo8715h(String str) {
        return this.f8580c.matcher(this.f8579b.matcher(str.toLowerCase()).replaceFirst("")).replaceAll("");
    }
}
