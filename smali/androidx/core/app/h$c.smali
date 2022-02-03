.class public final Landroidx/core/app/h$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public static a(Landroidx/core/app/h$c;)Landroid/app/Notification$BubbleMetadata;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance p0, Landroid/app/Notification$BubbleMetadata$Builder;

    invoke-direct {p0}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>()V

    throw v0
.end method
