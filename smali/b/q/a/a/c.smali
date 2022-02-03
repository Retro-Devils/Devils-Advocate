.class public final Lb/q/a/a/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/q/a/a/c$a;
    }
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;


# instance fields
.field b:Landroid/content/ContentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lb/q/a/a/c;->a()[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/q/a/a/c;->a:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lb/q/a/a/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lb/q/a/a/c$a;->a:Landroid/content/ContentValues;

    iput-object p1, p0, Lb/q/a/a/c;->b:Landroid/content/ContentValues;

    return-void
.end method

.method private static a()[Ljava/lang/String;
    .locals 13

    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "description"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "display_name"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "display_number"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "input_id"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "internal_provider_data"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    const-string v1, "network_affiliation"

    const/4 v8, 0x6

    aput-object v1, v0, v8

    const-string v1, "original_network_id"

    const/4 v9, 0x7

    aput-object v1, v0, v9

    const-string v1, "package_name"

    const/16 v10, 0x8

    aput-object v1, v0, v10

    const-string v1, "searchable"

    const/16 v11, 0x9

    aput-object v1, v0, v11

    const/16 v1, 0xa

    const-string v12, "service_id"

    aput-object v12, v0, v1

    const/16 v1, 0xb

    const-string v12, "service_type"

    aput-object v12, v0, v1

    const/16 v1, 0xc

    const-string v12, "transport_stream_id"

    aput-object v12, v0, v1

    const/16 v1, 0xd

    const-string v12, "type"

    aput-object v12, v0, v1

    const/16 v1, 0xe

    const-string v12, "video_format"

    aput-object v12, v0, v1

    const/16 v1, 0xf

    const-string v12, "browsable"

    aput-object v12, v0, v1

    const/16 v1, 0x10

    const-string v12, "locked"

    aput-object v12, v0, v1

    new-array v1, v11, [Ljava/lang/String;

    const-string v11, "app_link_color"

    aput-object v11, v1, v2

    const-string v11, "app_link_icon_uri"

    aput-object v11, v1, v3

    const-string v11, "app_link_intent_uri"

    aput-object v11, v1, v4

    const-string v11, "app_link_poster_art_uri"

    aput-object v11, v1, v5

    const-string v11, "app_link_text"

    aput-object v11, v1, v6

    const-string v11, "internal_provider_flag1"

    aput-object v11, v1, v7

    const-string v11, "internal_provider_flag2"

    aput-object v11, v1, v8

    const-string v8, "internal_provider_flag3"

    aput-object v8, v1, v9

    const-string v8, "internal_provider_flag4"

    aput-object v8, v1, v10

    new-array v7, v7, [Ljava/lang/String;

    const-string v8, "internal_provider_id"

    aput-object v8, v7, v2

    const-string v8, "transient"

    aput-object v8, v7, v3

    const-string v8, "system_approved"

    aput-object v8, v7, v4

    const-string v8, "configuration_display_order"

    aput-object v8, v7, v5

    const-string v5, "system_channel_key"

    aput-object v5, v7, v6

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1a

    if-lt v5, v6, :cond_0

    new-array v4, v4, [[Ljava/lang/String;

    aput-object v1, v4, v2

    aput-object v7, v4, v3

    invoke-static {v0, v4}, Lb/q/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, [Ljava/lang/String;

    return-object v0

    :cond_0
    const/16 v4, 0x17

    if-lt v5, v4, :cond_1

    new-array v3, v3, [[Ljava/lang/String;

    aput-object v1, v3, v2

    invoke-static {v0, v3}, Lb/q/a/a/e;->a([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public b()Landroid/content/ContentValues;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb/q/a/a/c;->c(Z)Landroid/content/ContentValues;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Landroid/content/ContentValues;
    .locals 4

    new-instance v0, Landroid/content/ContentValues;

    iget-object v1, p0, Lb/q/a/a/c;->b:Landroid/content/ContentValues;

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_0

    const-string v2, "app_link_color"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "app_link_text"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "app_link_icon_uri"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "app_link_poster_art_uri"

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v2, "app_link_intent_uri"

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
    const/16 v2, 0x1a

    if-ge v1, v2, :cond_1

    const-string v3, "internal_provider_id"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "transient"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "configuration_display_order"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "system_channel_key"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_1
    if-nez p1, :cond_2

    const-string v3, "browsable"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    const-string v3, "locked"

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_2
    if-lt v1, v2, :cond_3

    if-nez p1, :cond_4

    :cond_3
    const-string p1, "system_approved"

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    :cond_4
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lb/q/a/a/c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lb/q/a/a/c;->b:Landroid/content/ContentValues;

    check-cast p1, Lb/q/a/a/c;

    iget-object p1, p1, Lb/q/a/a/c;->b:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb/q/a/a/c;->b:Landroid/content/ContentValues;

    invoke-virtual {v0}, Landroid/content/ContentValues;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Channel{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/q/a/a/c;->b:Landroid/content/ContentValues;

    invoke-virtual {v1}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
