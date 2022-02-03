.class public abstract Landroidx/core/app/h$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# instance fields
.field protected a:Landroidx/core/app/h$d;

.field b:Ljava/lang/CharSequence;

.field c:Ljava/lang/CharSequence;

.field d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/core/app/h$e;->d:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public abstract b(Landroidx/core/app/g;)V
.end method

.method public c(Landroidx/core/app/g;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroidx/core/app/g;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Landroidx/core/app/g;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Landroidx/core/app/h$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/h$e;->a:Landroidx/core/app/h$d;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/core/app/h$e;->a:Landroidx/core/app/h$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroidx/core/app/h$d;->n(Landroidx/core/app/h$e;)Landroidx/core/app/h$d;

    :cond_0
    return-void
.end method
