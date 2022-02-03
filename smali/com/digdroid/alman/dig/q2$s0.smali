.class Lcom/digdroid/alman/dig/q2$s0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "s0"
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$s0;->a:Lcom/digdroid/alman/dig/q2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$s0;->a:Lcom/digdroid/alman/dig/q2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->k0(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$s0;->a:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->E(Landroid/content/Context;)V

    if-eqz p1, :cond_1

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {p1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance v0, Ljava/io/File;

    const-string v1, "dig_backup.bak"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "*/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$s0;->a:Lcom/digdroid/alman/dig/q2;

    const-string v1, "Send to"

    invoke-static {p1, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->m2(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {p1, v0, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110049

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101d8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method
