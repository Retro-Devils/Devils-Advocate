.class final enum Lcom/digdroid/alman/dig/t0$l;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/digdroid/alman/dig/t0$l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/digdroid/alman/dig/t0$l;

.field public static final enum c:Lcom/digdroid/alman/dig/t0$l;

.field public static final enum d:Lcom/digdroid/alman/dig/t0$l;

.field private static final synthetic e:[Lcom/digdroid/alman/dig/t0$l;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/digdroid/alman/dig/t0$l;

    const-string v1, "CONTAINS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/digdroid/alman/dig/t0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/digdroid/alman/dig/t0$l;->b:Lcom/digdroid/alman/dig/t0$l;

    new-instance v1, Lcom/digdroid/alman/dig/t0$l;

    const-string v3, "STARTS_WITH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/digdroid/alman/dig/t0$l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/digdroid/alman/dig/t0$l;->c:Lcom/digdroid/alman/dig/t0$l;

    new-instance v3, Lcom/digdroid/alman/dig/t0$l;

    const-string v5, "FUZZY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/digdroid/alman/dig/t0$l;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/digdroid/alman/dig/t0$l;->d:Lcom/digdroid/alman/dig/t0$l;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/digdroid/alman/dig/t0$l;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/digdroid/alman/dig/t0$l;->e:[Lcom/digdroid/alman/dig/t0$l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/digdroid/alman/dig/t0$l;
    .locals 1

    const-class v0, Lcom/digdroid/alman/dig/t0$l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/digdroid/alman/dig/t0$l;

    return-object p0
.end method

.method public static values()[Lcom/digdroid/alman/dig/t0$l;
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/t0$l;->e:[Lcom/digdroid/alman/dig/t0$l;

    invoke-virtual {v0}, [Lcom/digdroid/alman/dig/t0$l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/digdroid/alman/dig/t0$l;

    return-object v0
.end method
