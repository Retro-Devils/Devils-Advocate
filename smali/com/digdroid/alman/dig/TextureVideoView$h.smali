.class public final enum Lcom/digdroid/alman/dig/TextureVideoView$h;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/TextureVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/digdroid/alman/dig/TextureVideoView$h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/digdroid/alman/dig/TextureVideoView$h;

.field public static final enum c:Lcom/digdroid/alman/dig/TextureVideoView$h;

.field public static final enum d:Lcom/digdroid/alman/dig/TextureVideoView$h;

.field public static final enum e:Lcom/digdroid/alman/dig/TextureVideoView$h;

.field public static final enum f:Lcom/digdroid/alman/dig/TextureVideoView$h;

.field private static final synthetic g:[Lcom/digdroid/alman/dig/TextureVideoView$h;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/digdroid/alman/dig/TextureVideoView$h;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/digdroid/alman/dig/TextureVideoView$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/digdroid/alman/dig/TextureVideoView$h;->b:Lcom/digdroid/alman/dig/TextureVideoView$h;

    new-instance v1, Lcom/digdroid/alman/dig/TextureVideoView$h;

    const-string v3, "PLAY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/digdroid/alman/dig/TextureVideoView$h;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/digdroid/alman/dig/TextureVideoView$h;->c:Lcom/digdroid/alman/dig/TextureVideoView$h;

    new-instance v3, Lcom/digdroid/alman/dig/TextureVideoView$h;

    const-string v5, "STOP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/digdroid/alman/dig/TextureVideoView$h;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/digdroid/alman/dig/TextureVideoView$h;->d:Lcom/digdroid/alman/dig/TextureVideoView$h;

    new-instance v5, Lcom/digdroid/alman/dig/TextureVideoView$h;

    const-string v7, "PAUSE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/digdroid/alman/dig/TextureVideoView$h;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/digdroid/alman/dig/TextureVideoView$h;->e:Lcom/digdroid/alman/dig/TextureVideoView$h;

    new-instance v7, Lcom/digdroid/alman/dig/TextureVideoView$h;

    const-string v9, "END"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/digdroid/alman/dig/TextureVideoView$h;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/digdroid/alman/dig/TextureVideoView$h;->f:Lcom/digdroid/alman/dig/TextureVideoView$h;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/digdroid/alman/dig/TextureVideoView$h;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/digdroid/alman/dig/TextureVideoView$h;->g:[Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/digdroid/alman/dig/TextureVideoView$h;
    .locals 1

    const-class v0, Lcom/digdroid/alman/dig/TextureVideoView$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-object p0
.end method

.method public static values()[Lcom/digdroid/alman/dig/TextureVideoView$h;
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$h;->g:[Lcom/digdroid/alman/dig/TextureVideoView$h;

    invoke-virtual {v0}, [Lcom/digdroid/alman/dig/TextureVideoView$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-object v0
.end method
