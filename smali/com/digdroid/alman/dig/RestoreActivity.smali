.class public Lcom/digdroid/alman/dig/RestoreActivity;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/RestoreActivity$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public X(Z)V
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/RestoreActivity$a;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/RestoreActivity$a;-><init>(Lcom/digdroid/alman/dig/RestoreActivity;Z)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0026

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/d;->onResume()V

    invoke-static {p0}, Lcom/digdroid/alman/dig/a4;->q(Landroid/content/Context;)V

    new-instance v0, Lcom/digdroid/alman/dig/g;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/g;->h(Lcom/digdroid/alman/dig/g$c;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g;->f()V

    return-void
.end method
