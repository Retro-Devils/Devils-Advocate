.class Lcom/digdroid/alman/dig/s$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s;->h3(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lcom/digdroid/alman/dig/s;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s$f;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$f;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    iget v0, v0, Lcom/digdroid/alman/dig/s;->w0:I

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/r3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/r3;->f:Ljava/lang/String;

    sget-object v1, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/s3;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x7f1101d8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {p1, v0, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f11005c

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {v0, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    const v5, 0x7f1100bb

    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "name"

    invoke-virtual {p1, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/appcompat/app/b$a;->s(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v3, 0x7f11008b

    invoke-virtual {v0, v3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v3, 0x7f11005a

    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/s$f$a;

    invoke-direct {v2, p0, p1}, Lcom/digdroid/alman/dig/s$f$a;-><init>(Lcom/digdroid/alman/dig/s$f;Lcom/digdroid/alman/dig/r3;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    goto :goto_0
.end method
