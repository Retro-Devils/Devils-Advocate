.class public final enum Lfr/bmartel/youtubetv/h/g;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfr/bmartel/youtubetv/h/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfr/bmartel/youtubetv/h/g;

.field public static final enum c:Lfr/bmartel/youtubetv/h/g;

.field public static final enum d:Lfr/bmartel/youtubetv/h/g;

.field public static final enum e:Lfr/bmartel/youtubetv/h/g;

.field public static final enum f:Lfr/bmartel/youtubetv/h/g;

.field public static final enum g:Lfr/bmartel/youtubetv/h/g;

.field private static final synthetic h:[Lfr/bmartel/youtubetv/h/g;


# instance fields
.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lfr/bmartel/youtubetv/h/g;

    const-string v1, "UNSTARTED"

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lfr/bmartel/youtubetv/h/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfr/bmartel/youtubetv/h/g;->b:Lfr/bmartel/youtubetv/h/g;

    new-instance v1, Lfr/bmartel/youtubetv/h/g;

    const-string v3, "ENDED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lfr/bmartel/youtubetv/h/g;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lfr/bmartel/youtubetv/h/g;->c:Lfr/bmartel/youtubetv/h/g;

    new-instance v3, Lfr/bmartel/youtubetv/h/g;

    const-string v5, "PLAYING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Lfr/bmartel/youtubetv/h/g;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lfr/bmartel/youtubetv/h/g;->d:Lfr/bmartel/youtubetv/h/g;

    new-instance v5, Lfr/bmartel/youtubetv/h/g;

    const-string v7, "PAUSED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v6}, Lfr/bmartel/youtubetv/h/g;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lfr/bmartel/youtubetv/h/g;->e:Lfr/bmartel/youtubetv/h/g;

    new-instance v7, Lfr/bmartel/youtubetv/h/g;

    const-string v9, "BUFFERING"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v8}, Lfr/bmartel/youtubetv/h/g;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lfr/bmartel/youtubetv/h/g;->f:Lfr/bmartel/youtubetv/h/g;

    new-instance v9, Lfr/bmartel/youtubetv/h/g;

    const-string v11, "VIDEO_CUED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lfr/bmartel/youtubetv/h/g;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lfr/bmartel/youtubetv/h/g;->g:Lfr/bmartel/youtubetv/h/g;

    const/4 v11, 0x6

    new-array v11, v11, [Lfr/bmartel/youtubetv/h/g;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lfr/bmartel/youtubetv/h/g;->h:[Lfr/bmartel/youtubetv/h/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lfr/bmartel/youtubetv/h/g;->i:I

    return-void
.end method

.method public static b(I)Lfr/bmartel/youtubetv/h/g;
    .locals 5

    invoke-static {}, Lfr/bmartel/youtubetv/h/g;->values()[Lfr/bmartel/youtubetv/h/g;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lfr/bmartel/youtubetv/h/g;->a()I

    move-result v4

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lfr/bmartel/youtubetv/h/g;->b:Lfr/bmartel/youtubetv/h/g;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lfr/bmartel/youtubetv/h/g;
    .locals 1

    const-class v0, Lfr/bmartel/youtubetv/h/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfr/bmartel/youtubetv/h/g;

    return-object p0
.end method

.method public static values()[Lfr/bmartel/youtubetv/h/g;
    .locals 1

    sget-object v0, Lfr/bmartel/youtubetv/h/g;->h:[Lfr/bmartel/youtubetv/h/g;

    invoke-virtual {v0}, [Lfr/bmartel/youtubetv/h/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfr/bmartel/youtubetv/h/g;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/h/g;->i:I

    return v0
.end method
