.class public abstract Lb/q/a/a/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/q/a/a/b$a;
    }
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;


# instance fields
.field protected b:Landroid/content/ContentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lb/q/a/a/b;->a()[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/q/a/a/b;->a:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lb/q/a/a/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lb/q/a/a/b$a;->a:Landroid/content/ContentValues;

    iput-object p1, p0, Lb/q/a/a/b;->b:Landroid/content/ContentValues;

    return-void
.end method

.method private static a()[Ljava/lang/String;
    .locals 11

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "package_name"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "title"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "episode_title"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x18

    if-lt v1, v6, :cond_0

    const-string v7, "season_display_number"

    goto :goto_0

    :cond_0
    const-string v7, "season_number"

    :goto_0
    const/4 v8, 0x4

    aput-object v7, v0, v8

    if-lt v1, v6, :cond_1

    const-string v7, "episode_display_number"

    goto :goto_1

    :cond_1
    const-string v7, "episode_number"

    :goto_1
    const/4 v9, 0x5

    aput-object v7, v0, v9

    const/4 v7, 0x6

    const-string v10, "short_description"

    aput-object v10, v0, v7

    const/4 v7, 0x7

    const-string v10, "long_description"

    aput-object v10, v0, v7

    const/16 v7, 0x8

    const-string v10, "poster_art_uri"

    aput-object v10, v0, v7

    const/16 v7, 0x9

    const-string v10, "thumbnail_uri"

    aput-object v10, v0, v7

    const/16 v7, 0xa

    const-string v10, "audio_language"

    aput-object v10, v0, v7

    const/16 v7, 0xb

    const-string v10, "canonical_genre"

    aput-object v10, v0, v7

    const/16 v7, 0xc

    const-string v10, "content_rating"

    aput-object v10, v0, v7

    const/16 v7, 0xd

    const-string v10, "video_width"

    aput-object v10, v0, v7

    const/16 v7, 0xe

    const-string v10, "video_height"

    aput-object v10, v0, v7

    const/16 v7, 0xf

    const-string v10, "internal_provider_data"

    aput-object v10, v0, v7

    new-array v7, v9, [Ljava/lang/String;

    const-string v9, "searchable"

    aput-object v9, v7, v2

    const-string v9, "internal_provider_flag1"

    aput-object v9, v7, v3

    const-string v9, "internal_provider_flag2"

    aput-object v9, v7, v4

    const-string v9, "internal_provider_flag3"

    aput-object v9, v7, v5

    const-string v9, "internal_provider_flag4"

    aput-object v9, v7, v8

    new-array v8, v3, [Ljava/lang/String;

    const-string v9, "season_title"

    aput-object v9, v8, v2

    new-array v9, v4, [Ljava/lang/String;

    const-string v10, "review_rating"

    aput-object v10, v9, v2

    const-string v10, "review_rating_style"

    aput-object v10, v9, v3

    const/16 v10, 0x1a

    if-lt v1, v10, :cond_2

    new-array v1, v5, [[Ljava/lang/String;

    aput-object v7, v1, v2

    aput-object v8, v1, v3

    aput-object v9, v1, v4

    invoke-static {v0, v1}, Lb/q/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    :goto_2
    check-cast v0, [Ljava/lang/String;

    return-object v0

    :cond_2
    if-lt v1, v6, :cond_3

    new-array v1, v4, [[Ljava/lang/String;

    aput-object v7, v1, v2

    aput-object v8, v1, v3

    invoke-static {v0, v1}, Lb/q/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_3
    const/16 v4, 0x17

    if-lt v1, v4, :cond_4

    new-array v1, v3, [[Ljava/lang/String;

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lb/q/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_4
    return-object v0
.end method


# virtual methods
.method public b()Landroid/content/ContentValues;
    .locals 3

    new-instance v0, Landroid/content/ContentValues;

    iget-object v1, p0, Lb/q/a/a/b;->b:Landroid/content/ContentValues;

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_0

    const-string v2, "searchable"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "internal_provider_flag1"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "internal_provider_flag2"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "internal_provider_flag3"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "internal_provider_flag4"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_0
    const/16 v2, 0x18

    if-ge v1, v2, :cond_1

    const-string v2, "season_title"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_1
    const/16 v2, 0x1a

    if-ge v1, v2, :cond_2

    const-string v1, "review_rating_style"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v1, "review_rating"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_2
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb/q/a/a/b;->b:Landroid/content/ContentValues;

    invoke-virtual {v0}, Landroid/content/ContentValues;->hashCode()I

    move-result v0

    return v0
.end method
