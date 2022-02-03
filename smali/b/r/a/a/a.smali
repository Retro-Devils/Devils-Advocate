.class public abstract Lb/r/a/a/a;
.super Lb/r/a/a/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/r/a/a/a$a;
    }
.end annotation


# static fields
.field public static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lb/r/a/a/a;->a()[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/r/a/a/a;->c:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lb/r/a/a/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/r/a/a/b;-><init>(Lb/r/a/a/b$a;)V

    return-void
.end method

.method private static a()[Ljava/lang/String;
    .locals 5

    const/16 v0, 0x1b

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "internal_provider_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "preview_video_uri"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v4, "last_playback_position_millis"

    aput-object v4, v0, v1

    const/4 v1, 0x3

    const-string v4, "duration_millis"

    aput-object v4, v0, v1

    const/4 v1, 0x4

    const-string v4, "intent_uri"

    aput-object v4, v0, v1

    const/4 v1, 0x5

    const-string v4, "transient"

    aput-object v4, v0, v1

    const/4 v1, 0x6

    const-string v4, "type"

    aput-object v4, v0, v1

    const/4 v1, 0x7

    const-string v4, "poster_art_aspect_ratio"

    aput-object v4, v0, v1

    const/16 v1, 0x8

    const-string v4, "poster_thumbnail_aspect_ratio"

    aput-object v4, v0, v1

    const/16 v1, 0x9

    const-string v4, "logo_uri"

    aput-object v4, v0, v1

    const/16 v1, 0xa

    const-string v4, "availability"

    aput-object v4, v0, v1

    const/16 v1, 0xb

    const-string v4, "starting_price"

    aput-object v4, v0, v1

    const/16 v1, 0xc

    const-string v4, "offer_price"

    aput-object v4, v0, v1

    const/16 v1, 0xd

    const-string v4, "release_date"

    aput-object v4, v0, v1

    const/16 v1, 0xe

    const-string v4, "item_count"

    aput-object v4, v0, v1

    const/16 v1, 0xf

    const-string v4, "live"

    aput-object v4, v0, v1

    const/16 v1, 0x10

    const-string v4, "interaction_type"

    aput-object v4, v0, v1

    const/16 v1, 0x11

    const-string v4, "interaction_count"

    aput-object v4, v0, v1

    const/16 v1, 0x12

    const-string v4, "author"

    aput-object v4, v0, v1

    const/16 v1, 0x13

    const-string v4, "browsable"

    aput-object v4, v0, v1

    const/16 v1, 0x14

    const-string v4, "content_id"

    aput-object v4, v0, v1

    const/16 v1, 0x15

    const-string v4, "logo_content_description"

    aput-object v4, v0, v1

    const/16 v1, 0x16

    const-string v4, "genre"

    aput-object v4, v0, v1

    const/16 v1, 0x17

    const-string v4, "start_time_utc_millis"

    aput-object v4, v0, v1

    const/16 v1, 0x18

    const-string v4, "end_time_utc_millis"

    aput-object v4, v0, v1

    const/16 v1, 0x19

    const-string v4, "preview_audio_uri"

    aput-object v4, v0, v1

    const/16 v1, 0x1a

    const-string v4, "tv_series_item_type"

    aput-object v4, v0, v1

    sget-object v1, Lb/r/a/a/b;->a:[Ljava/lang/String;

    new-array v3, v3, [[Ljava/lang/String;

    aput-object v0, v3, v2

    invoke-static {v1, v3}, Lb/r/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public c(Z)Landroid/content/ContentValues;
    .locals 4

    invoke-super {p0}, Lb/r/a/a/b;->b()Landroid/content/ContentValues;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    const-string v3, "internal_provider_id"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "preview_video_uri"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "last_playback_position_millis"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "duration_millis"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "intent_uri"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "transient"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "type"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "poster_art_aspect_ratio"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "poster_thumbnail_aspect_ratio"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "logo_uri"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "availability"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "starting_price"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "offer_price"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "release_date"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "item_count"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "live"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "interaction_count"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "author"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "content_id"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "logo_content_description"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "genre"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "start_time_utc_millis"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "end_time_utc_millis"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "preview_audio_uri"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "tv_series_item_type"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_0
    if-lt v1, v2, :cond_1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "browsable"

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_2
    return-object v0
.end method
