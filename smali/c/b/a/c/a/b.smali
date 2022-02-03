.class public final enum Lc/b/a/c/a/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/b/a/c/a/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/b/a/c/a/b;

.field public static final enum c:Lc/b/a/c/a/b;

.field public static final enum d:Lc/b/a/c/a/b;

.field public static final enum e:Lc/b/a/c/a/b;

.field public static final enum f:Lc/b/a/c/a/b;

.field public static final enum g:Lc/b/a/c/a/b;

.field public static final enum h:Lc/b/a/c/a/b;

.field public static final enum i:Lc/b/a/c/a/b;

.field public static final enum j:Lc/b/a/c/a/b;

.field public static final enum k:Lc/b/a/c/a/b;

.field public static final enum l:Lc/b/a/c/a/b;

.field public static final enum m:Lc/b/a/c/a/b;

.field private static final synthetic n:[Lc/b/a/c/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lc/b/a/c/a/b;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/b/a/c/a/b;->b:Lc/b/a/c/a/b;

    new-instance v1, Lc/b/a/c/a/b;

    const-string v3, "INTERNAL_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc/b/a/c/a/b;->c:Lc/b/a/c/a/b;

    new-instance v3, Lc/b/a/c/a/b;

    const-string v5, "UNKNOWN_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc/b/a/c/a/b;->d:Lc/b/a/c/a/b;

    new-instance v5, Lc/b/a/c/a/b;

    const-string v7, "SERVICE_MISSING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lc/b/a/c/a/b;->e:Lc/b/a/c/a/b;

    new-instance v7, Lc/b/a/c/a/b;

    const-string v9, "SERVICE_VERSION_UPDATE_REQUIRED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lc/b/a/c/a/b;->f:Lc/b/a/c/a/b;

    new-instance v9, Lc/b/a/c/a/b;

    const-string v11, "SERVICE_DISABLED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lc/b/a/c/a/b;->g:Lc/b/a/c/a/b;

    new-instance v11, Lc/b/a/c/a/b;

    const-string v13, "SERVICE_INVALID"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lc/b/a/c/a/b;->h:Lc/b/a/c/a/b;

    new-instance v13, Lc/b/a/c/a/b;

    const-string v15, "ERROR_CONNECTING_TO_SERVICE"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lc/b/a/c/a/b;->i:Lc/b/a/c/a/b;

    new-instance v15, Lc/b/a/c/a/b;

    const-string v14, "CLIENT_LIBRARY_UPDATE_REQUIRED"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lc/b/a/c/a/b;->j:Lc/b/a/c/a/b;

    new-instance v14, Lc/b/a/c/a/b;

    const-string v12, "NETWORK_ERROR"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lc/b/a/c/a/b;->k:Lc/b/a/c/a/b;

    new-instance v12, Lc/b/a/c/a/b;

    const-string v10, "DEVELOPER_KEY_INVALID"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lc/b/a/c/a/b;->l:Lc/b/a/c/a/b;

    new-instance v10, Lc/b/a/c/a/b;

    const-string v8, "INVALID_APPLICATION_SIGNATURE"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Lc/b/a/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lc/b/a/c/a/b;->m:Lc/b/a/c/a/b;

    const/16 v8, 0xc

    new-array v8, v8, [Lc/b/a/c/a/b;

    aput-object v0, v8, v2

    aput-object v1, v8, v4

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v7, v8, v0

    const/4 v0, 0x5

    aput-object v9, v8, v0

    const/4 v0, 0x6

    aput-object v11, v8, v0

    const/4 v0, 0x7

    aput-object v13, v8, v0

    const/16 v0, 0x8

    aput-object v15, v8, v0

    const/16 v0, 0x9

    aput-object v14, v8, v0

    const/16 v0, 0xa

    aput-object v12, v8, v0

    aput-object v10, v8, v6

    sput-object v8, Lc/b/a/c/a/b;->n:[Lc/b/a/c/a/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/b/a/c/a/b;
    .locals 1

    const-class v0, Lc/b/a/c/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/b/a/c/a/b;

    return-object p0
.end method

.method public static values()[Lc/b/a/c/a/b;
    .locals 1

    sget-object v0, Lc/b/a/c/a/b;->n:[Lc/b/a/c/a/b;

    invoke-virtual {v0}, [Lc/b/a/c/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/b/a/c/a/b;

    return-object v0
.end method
