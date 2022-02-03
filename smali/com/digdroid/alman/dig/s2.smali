.class public Lcom/digdroid/alman/dig/s2;
.super Lcom/digdroid/alman/dig/t;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/s2$d;
    }
.end annotation


# instance fields
.field F:Lcom/digdroid/alman/dig/s2$d;

.field G:Lcom/digdroid/alman/dig/s2$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t;-><init>()V

    return-void
.end method

.method private X0(ILjava/io/File;I)V
    .locals 2

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/s2$a;

    invoke-direct {v0, p0, p2, p3}, Lcom/digdroid/alman/dig/s2$a;-><init>(Lcom/digdroid/alman/dig/s2;Ljava/io/File;I)V

    const p2, 0x7f1101da

    invoke-virtual {p1, p2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method


# virtual methods
.method Y0(Lcom/digdroid/alman/dig/s2$d;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/s2;->G:Lcom/digdroid/alman/dig/s2$d;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p1, v0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/s2;->G:Lcom/digdroid/alman/dig/s2$d;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/s2$d;->a()V

    return-void

    :cond_0
    invoke-static {p0, v0}, Landroidx/core/app/a;->l(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f09026e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f110042

    const/4 v1, -0x2

    invoke-static {p1, v0, v1}, Lcom/google/android/material/snackbar/Snackbar;->X(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    const v0, 0x7f1101da

    new-instance v1, Lcom/digdroid/alman/dig/s2$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s2$c;-><init>(Lcom/digdroid/alman/dig/s2;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/material/snackbar/Snackbar;->Z(ILandroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->N()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const/16 v0, 0x65

    invoke-static {p0, p1, v0}, Landroidx/core/app/a;->k(Landroid/app/Activity;[Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method Z0(Lcom/digdroid/alman/dig/s2$d;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/s2;->F:Lcom/digdroid/alman/dig/s2$d;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x7f110207

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x7f1101c3

    new-instance v1, Lcom/digdroid/alman/dig/s2$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s2$b;-><init>(Lcom/digdroid/alman/dig/s2;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/s2;->F:Lcom/digdroid/alman/dig/s2$d;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/s2$d;->a()V

    :goto_0
    return-void
.end method

.method a1()Z
    .locals 9

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v4, "/Android.*$"

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v2, "dig_dir"

    invoke-virtual {v0, v2, v1}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "retroarch_dir"

    invoke-virtual {v0, v6, v1}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1e

    if-ge v7, v8, :cond_2

    if-nez v4, :cond_0

    new-instance v4, Ljava/io/File;

    const-string v5, "Dig"

    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_1
    if-nez v1, :cond_6

    new-instance v1, Ljava/io/File;

    const-string v2, "RetroArch"

    invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    if-eqz v4, :cond_8

    const-string v6, "://"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {p0, v4}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v4

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/i2;->exists()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    const-string v1, "com.retroarch"

    invoke-static {p0, v1}, Lcom/digdroid/alman/dig/a4;->s(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "com.retroarch.ra32"

    invoke-static {p0, v1}, Lcom/digdroid/alman/dig/a4;->s(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "com.retroarch.aarch64"

    invoke-static {p0, v1}, Lcom/digdroid/alman/dig/a4;->s(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, -0x1

    const-string v4, "cover_storage"

    invoke-virtual {v0, v4, v1}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "cover_dir"

    invoke-virtual {v0, v1, v5}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const v0, 0x7f1100a1

    const/16 v1, 0x67

    :goto_0
    invoke-direct {p0, v0, v3, v1}, Lcom/digdroid/alman/dig/s2;->X0(ILjava/io/File;I)V

    return v2

    :cond_6
    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_7
    :goto_2
    const v0, 0x7f11021e

    const/16 v1, 0x69

    goto :goto_0

    :cond_8
    :goto_3
    const v0, 0x7f1100c8

    const/16 v1, 0x66

    goto :goto_0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/16 p2, 0x64

    if-eq p1, p2, :cond_2

    const/16 p2, 0x65

    if-eq p1, p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/s2;->G:Lcom/digdroid/alman/dig/s2$d;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/s2;->F:Lcom/digdroid/alman/dig/s2$d;

    :goto_0
    if-nez p1, :cond_3

    return-void

    :cond_3
    array-length p2, p3

    if-lez p2, :cond_4

    const/4 p2, 0x0

    aget p2, p3, p2

    if-nez p2, :cond_4

    invoke-interface {p1}, Lcom/digdroid/alman/dig/s2$d;->a()V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lcom/digdroid/alman/dig/s2$d;->b()V

    :goto_1
    return-void
.end method
