.class Lcom/digdroid/alman/dig/MainActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/s2$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$a;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$a;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/s2;->a1()Z

    move-result v1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/MainActivity;->t1:Z

    return-void
.end method

.method public b()V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/MainActivity$a;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f11025f

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/MainActivity$a$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MainActivity$a$a;-><init>(Lcom/digdroid/alman/dig/MainActivity$a;)V

    const v2, 0x7f1101da

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
