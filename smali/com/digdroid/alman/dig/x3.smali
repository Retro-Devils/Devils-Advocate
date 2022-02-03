.class public Lcom/digdroid/alman/dig/x3;
.super Lcom/digdroid/alman/dig/r2;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/w3$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/x3$c;
    }
.end annotation


# instance fields
.field private H:Lcom/digdroid/alman/dig/w3;

.field private I:Ljava/lang/String;

.field private J:Landroid/app/ProgressDialog;

.field private K:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    const-string v1, "unzip_task_fragment"

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->I:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->K:Landroid/app/ProgressDialog;

    return-void
.end method

.method static synthetic Z0(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/w3;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    return-object p0
.end method

.method private c1(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f11027f

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    new-instance v0, Lcom/digdroid/alman/dig/x3$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/x3$a;-><init>(Lcom/digdroid/alman/dig/x3;)V

    const/4 v1, -0x2

    const-string v2, "Cancel"

    invoke-virtual {p1, v1, v2, v0}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    return-void
.end method


# virtual methods
.method public P(Z)V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    invoke-virtual {v2, v3}, Landroidx/fragment/app/n;->h(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/n;->e()I

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    if-eqz p1, :cond_2

    const-string v2, "launch"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "game"

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->z:Lcom/digdroid/alman/dig/b0;

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, p0, v3, v4}, Lcom/digdroid/alman/dig/b0;->w(Lcom/digdroid/alman/dig/x3;J)V

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lcom/digdroid/alman/dig/t;->z:Lcom/digdroid/alman/dig/b0;

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v4, p0, v5, v6, v2}, Lcom/digdroid/alman/dig/b0;->q(Lcom/digdroid/alman/dig/x3;JLjava/lang/String;)V

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const v0, 0x7f1101cc

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101d8

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/x3;->a1()V

    :cond_3
    return-void
.end method

.method a1()V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/x3$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/digdroid/alman/dig/x3$c;-><init>(Lcom/digdroid/alman/dig/x3;Lcom/digdroid/alman/dig/x3$a;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public b(ILjava/lang/String;I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/x3;->c1(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {p1, p3}, Landroid/app/ProgressDialog;->setProgress(I)V

    return-void
.end method

.method b1()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/x3;->c1(Ljava/lang/String;)V

    return-void
.end method

.method public d1(Landroid/content/Intent;)V
    .locals 6

    const-string v0, "label"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    new-instance v1, Landroid/app/ProgressDialog;

    invoke-direct {v1, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/16 v3, 0x64

    invoke-virtual {v1, v3}, Landroid/app/ProgressDialog;->setMax(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const/4 v3, -0x2

    new-instance v4, Lcom/digdroid/alman/dig/x3$b;

    invoke-direct {v4, p0}, Lcom/digdroid/alman/dig/x3$b;-><init>(Lcom/digdroid/alman/dig/x3;)V

    const-string v5, "Cancel"

    invoke-virtual {v1, v3, v5, v4}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    iput-boolean v2, v1, Lcom/digdroid/alman/dig/b3;->g:Z

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    const-string v1, "progress"

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setProgress(I)V

    return-void
.end method

.method public e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "zipfile"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "game"

    invoke-virtual {v0, p1, p4, p5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "title"

    invoke-virtual {v0, p1, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "launch"

    invoke-virtual {v0, p1, p7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/digdroid/alman/dig/w3;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/w3;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->c2(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    iget-object p3, p0, Lcom/digdroid/alman/dig/x3;->I:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Landroidx/fragment/app/n;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/n;->e()I

    return-void
.end method

.method public j0()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->J:Landroid/app/ProgressDialog;

    invoke-static {p0}, Lcom/digdroid/alman/dig/y3;->c(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    invoke-virtual {v1, v2}, Landroidx/fragment/app/n;->h(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/n;->e()I

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "unzipping"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/w3;

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->H:Lcom/digdroid/alman/dig/w3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "unzipping"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
