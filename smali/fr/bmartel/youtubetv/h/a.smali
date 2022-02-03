.class public final enum Lfr/bmartel/youtubetv/h/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfr/bmartel/youtubetv/h/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfr/bmartel/youtubetv/h/a;

.field public static final enum c:Lfr/bmartel/youtubetv/h/a;

.field public static final enum d:Lfr/bmartel/youtubetv/h/a;

.field public static final enum e:Lfr/bmartel/youtubetv/h/a;

.field public static final enum f:Lfr/bmartel/youtubetv/h/a;

.field private static final synthetic g:[Lfr/bmartel/youtubetv/h/a;


# instance fields
.field private h:Ljava/lang/String;

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lfr/bmartel/youtubetv/h/a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const-string v3, "default"

    invoke-direct {v0, v1, v2, v2, v3}, Lfr/bmartel/youtubetv/h/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lfr/bmartel/youtubetv/h/a;->b:Lfr/bmartel/youtubetv/h/a;

    new-instance v1, Lfr/bmartel/youtubetv/h/a;

    const-string v3, "HQ_DEFAULT"

    const/4 v4, 0x1

    const-string v5, "hqdefault"

    invoke-direct {v1, v3, v4, v4, v5}, Lfr/bmartel/youtubetv/h/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v1, Lfr/bmartel/youtubetv/h/a;->c:Lfr/bmartel/youtubetv/h/a;

    new-instance v3, Lfr/bmartel/youtubetv/h/a;

    const-string v5, "MQ_DEFAULT"

    const/4 v6, 0x2

    const-string v7, "mqdefault"

    invoke-direct {v3, v5, v6, v6, v7}, Lfr/bmartel/youtubetv/h/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v3, Lfr/bmartel/youtubetv/h/a;->d:Lfr/bmartel/youtubetv/h/a;

    new-instance v5, Lfr/bmartel/youtubetv/h/a;

    const-string v7, "SD_DEFAULT"

    const/4 v8, 0x3

    const-string v9, "sddefault"

    invoke-direct {v5, v7, v8, v8, v9}, Lfr/bmartel/youtubetv/h/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v5, Lfr/bmartel/youtubetv/h/a;->e:Lfr/bmartel/youtubetv/h/a;

    new-instance v7, Lfr/bmartel/youtubetv/h/a;

    const-string v9, "MAXRES_DEFAULT"

    const/4 v10, 0x4

    const-string v11, "maxresdefault"

    invoke-direct {v7, v9, v10, v10, v11}, Lfr/bmartel/youtubetv/h/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v7, Lfr/bmartel/youtubetv/h/a;->f:Lfr/bmartel/youtubetv/h/a;

    const/4 v9, 0x5

    new-array v9, v9, [Lfr/bmartel/youtubetv/h/a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lfr/bmartel/youtubetv/h/a;->g:[Lfr/bmartel/youtubetv/h/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lfr/bmartel/youtubetv/h/a;->i:I

    iput-object p4, p0, Lfr/bmartel/youtubetv/h/a;->h:Ljava/lang/String;

    return-void
.end method

.method public static b(I)Lfr/bmartel/youtubetv/h/a;
    .locals 5

    invoke-static {}, Lfr/bmartel/youtubetv/h/a;->values()[Lfr/bmartel/youtubetv/h/a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lfr/bmartel/youtubetv/h/a;->a()I

    move-result v4

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lfr/bmartel/youtubetv/h/a;->b:Lfr/bmartel/youtubetv/h/a;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lfr/bmartel/youtubetv/h/a;
    .locals 1

    const-class v0, Lfr/bmartel/youtubetv/h/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfr/bmartel/youtubetv/h/a;

    return-object p0
.end method

.method public static values()[Lfr/bmartel/youtubetv/h/a;
    .locals 1

    sget-object v0, Lfr/bmartel/youtubetv/h/a;->g:[Lfr/bmartel/youtubetv/h/a;

    invoke-virtual {v0}, [Lfr/bmartel/youtubetv/h/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfr/bmartel/youtubetv/h/a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/h/a;->i:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/h/a;->h:Ljava/lang/String;

    return-object v0
.end method
