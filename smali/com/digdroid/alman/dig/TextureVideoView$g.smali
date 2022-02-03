.class public final enum Lcom/digdroid/alman/dig/TextureVideoView$g;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/TextureVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/digdroid/alman/dig/TextureVideoView$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/digdroid/alman/dig/TextureVideoView$g;

.field public static final enum c:Lcom/digdroid/alman/dig/TextureVideoView$g;

.field public static final enum d:Lcom/digdroid/alman/dig/TextureVideoView$g;

.field public static final enum e:Lcom/digdroid/alman/dig/TextureVideoView$g;

.field private static final synthetic f:[Lcom/digdroid/alman/dig/TextureVideoView$g;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/digdroid/alman/dig/TextureVideoView$g;

    const-string v1, "CENTER_CROP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/digdroid/alman/dig/TextureVideoView$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/digdroid/alman/dig/TextureVideoView$g;->b:Lcom/digdroid/alman/dig/TextureVideoView$g;

    new-instance v1, Lcom/digdroid/alman/dig/TextureVideoView$g;

    const-string v3, "TOP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/digdroid/alman/dig/TextureVideoView$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/digdroid/alman/dig/TextureVideoView$g;->c:Lcom/digdroid/alman/dig/TextureVideoView$g;

    new-instance v3, Lcom/digdroid/alman/dig/TextureVideoView$g;

    const-string v5, "BOTTOM"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/digdroid/alman/dig/TextureVideoView$g;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/digdroid/alman/dig/TextureVideoView$g;->d:Lcom/digdroid/alman/dig/TextureVideoView$g;

    new-instance v5, Lcom/digdroid/alman/dig/TextureVideoView$g;

    const-string v7, "FIT_CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/digdroid/alman/dig/TextureVideoView$g;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/digdroid/alman/dig/TextureVideoView$g;->e:Lcom/digdroid/alman/dig/TextureVideoView$g;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/digdroid/alman/dig/TextureVideoView$g;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/digdroid/alman/dig/TextureVideoView$g;->f:[Lcom/digdroid/alman/dig/TextureVideoView$g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/digdroid/alman/dig/TextureVideoView$g;
    .locals 1

    const-class v0, Lcom/digdroid/alman/dig/TextureVideoView$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/digdroid/alman/dig/TextureVideoView$g;

    return-object p0
.end method

.method public static values()[Lcom/digdroid/alman/dig/TextureVideoView$g;
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$g;->f:[Lcom/digdroid/alman/dig/TextureVideoView$g;

    invoke-virtual {v0}, [Lcom/digdroid/alman/dig/TextureVideoView$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/digdroid/alman/dig/TextureVideoView$g;

    return-object v0
.end method
