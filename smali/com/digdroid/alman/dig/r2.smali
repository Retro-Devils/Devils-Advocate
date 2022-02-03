.class public Lcom/digdroid/alman/dig/r2;
.super Lcom/digdroid/alman/dig/t;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/r2$c;
    }
.end annotation


# instance fields
.field F:Lcom/digdroid/alman/dig/r2$c;

.field G:Lcom/digdroid/alman/dig/r2$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t;-><init>()V

    return-void
.end method


# virtual methods
.method X0(Lcom/digdroid/alman/dig/r2$c;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2;->G:Lcom/digdroid/alman/dig/r2$c;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p1, v0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2;->G:Lcom/digdroid/alman/dig/r2$c;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/r2$c;->a()V

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

    const v0, 0x7f1101d8

    new-instance v1, Lcom/digdroid/alman/dig/r2$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$b;-><init>(Lcom/digdroid/alman/dig/r2;)V

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

.method Y0(Lcom/digdroid/alman/dig/r2$c;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2;->F:Lcom/digdroid/alman/dig/r2$c;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x7f110205

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x7f1101c1

    new-instance v1, Lcom/digdroid/alman/dig/r2$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$a;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2;->F:Lcom/digdroid/alman/dig/r2$c;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/r2$c;->a()V

    :goto_0
    return-void
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
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2;->G:Lcom/digdroid/alman/dig/r2$c;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2;->F:Lcom/digdroid/alman/dig/r2$c;

    :goto_0
    if-nez p1, :cond_3

    return-void

    :cond_3
    array-length p2, p3

    if-lez p2, :cond_4

    const/4 p2, 0x0

    aget p2, p3, p2

    if-nez p2, :cond_4

    invoke-interface {p1}, Lcom/digdroid/alman/dig/r2$c;->a()V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lcom/digdroid/alman/dig/r2$c;->b()V

    :goto_1
    return-void
.end method
