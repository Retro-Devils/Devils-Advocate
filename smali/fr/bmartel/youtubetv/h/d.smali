.class public final enum Lfr/bmartel/youtubetv/h/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfr/bmartel/youtubetv/h/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfr/bmartel/youtubetv/h/d;

.field public static final enum c:Lfr/bmartel/youtubetv/h/d;

.field public static final enum d:Lfr/bmartel/youtubetv/h/d;

.field private static final synthetic e:[Lfr/bmartel/youtubetv/h/d;


# instance fields
.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfr/bmartel/youtubetv/h/d;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lfr/bmartel/youtubetv/h/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfr/bmartel/youtubetv/h/d;->b:Lfr/bmartel/youtubetv/h/d;

    new-instance v1, Lfr/bmartel/youtubetv/h/d;

    const-string v4, "ALWAYS"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lfr/bmartel/youtubetv/h/d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lfr/bmartel/youtubetv/h/d;->c:Lfr/bmartel/youtubetv/h/d;

    new-instance v4, Lfr/bmartel/youtubetv/h/d;

    const-string v6, "NONE"

    invoke-direct {v4, v6, v5, v2}, Lfr/bmartel/youtubetv/h/d;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lfr/bmartel/youtubetv/h/d;->d:Lfr/bmartel/youtubetv/h/d;

    const/4 v6, 0x3

    new-array v6, v6, [Lfr/bmartel/youtubetv/h/d;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    sput-object v6, Lfr/bmartel/youtubetv/h/d;->e:[Lfr/bmartel/youtubetv/h/d;

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

    iput p3, p0, Lfr/bmartel/youtubetv/h/d;->f:I

    return-void
.end method

.method public static b(I)Lfr/bmartel/youtubetv/h/d;
    .locals 5

    invoke-static {}, Lfr/bmartel/youtubetv/h/d;->values()[Lfr/bmartel/youtubetv/h/d;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lfr/bmartel/youtubetv/h/d;->a()I

    move-result v4

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lfr/bmartel/youtubetv/h/d;->b:Lfr/bmartel/youtubetv/h/d;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lfr/bmartel/youtubetv/h/d;
    .locals 1

    const-class v0, Lfr/bmartel/youtubetv/h/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfr/bmartel/youtubetv/h/d;

    return-object p0
.end method

.method public static values()[Lfr/bmartel/youtubetv/h/d;
    .locals 1

    sget-object v0, Lfr/bmartel/youtubetv/h/d;->e:[Lfr/bmartel/youtubetv/h/d;

    invoke-virtual {v0}, [Lfr/bmartel/youtubetv/h/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfr/bmartel/youtubetv/h/d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/h/d;->f:I

    return v0
.end method
