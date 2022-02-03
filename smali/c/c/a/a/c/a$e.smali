.class public final enum Lc/c/a/a/c/a$e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/c/a/a/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/c/a/a/c/a$e;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final enum b:Lc/c/a/a/c/a$e;

.field public static final enum c:Lc/c/a/a/c/a$e;

.field public static final enum d:Lc/c/a/a/c/a$e;

.field public static final enum e:Lc/c/a/a/c/a$e;

.field public static final enum f:Lc/c/a/a/c/a$e;

.field public static final enum g:Lc/c/a/a/c/a$e;

.field public static final enum h:Lc/c/a/a/c/a$e;

.field private static final synthetic i:[Lc/c/a/a/c/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lc/c/a/a/c/a$e;

    const-string v1, "Horizontal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/c/a/a/c/a$e;->b:Lc/c/a/a/c/a$e;

    new-instance v1, Lc/c/a/a/c/a$e;

    const-string v3, "Wheel"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc/c/a/a/c/a$e;->c:Lc/c/a/a/c/a$e;

    new-instance v3, Lc/c/a/a/c/a$e;

    const-string v5, "CoverFlow"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc/c/a/a/c/a$e;->d:Lc/c/a/a/c/a$e;

    new-instance v5, Lc/c/a/a/c/a$e;

    const-string v7, "TimeMachine"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lc/c/a/a/c/a$e;->e:Lc/c/a/a/c/a$e;

    new-instance v7, Lc/c/a/a/c/a$e;

    const-string v9, "InverseTimeMachine"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lc/c/a/a/c/a$e;->f:Lc/c/a/a/c/a$e;

    new-instance v9, Lc/c/a/a/c/a$e;

    const-string v11, "Parameterized"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lc/c/a/a/c/a$e;->g:Lc/c/a/a/c/a$e;

    new-instance v11, Lc/c/a/a/c/a$e;

    const-string v13, "Custom"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lc/c/a/a/c/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lc/c/a/a/c/a$e;->h:Lc/c/a/a/c/a$e;

    const/4 v13, 0x7

    new-array v13, v13, [Lc/c/a/a/c/a$e;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lc/c/a/a/c/a$e;->i:[Lc/c/a/a/c/a$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/c/a/a/c/a$e;
    .locals 1

    const-class v0, Lc/c/a/a/c/a$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/c/a/a/c/a$e;

    return-object p0
.end method

.method public static values()[Lc/c/a/a/c/a$e;
    .locals 1

    sget-object v0, Lc/c/a/a/c/a$e;->i:[Lc/c/a/a/c/a$e;

    invoke-virtual {v0}, [Lc/c/a/a/c/a$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/c/a/a/c/a$e;

    return-object v0
.end method
