.class Lcom/digdroid/alman/dig/n0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/TextView;

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/digdroid/alman/dig/n0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n0;Ljava/lang/String;Landroid/widget/TextView;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/n0$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/n0$a;->c:Landroid/widget/TextView;

    iput p4, p0, Lcom/digdroid/alman/dig/n0$a;->d:I

    iput-object p5, p0, Lcom/digdroid/alman/dig/n0$a;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    sget-object p1, Lcom/digdroid/alman/dig/n0;->n0:[I

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [Ljava/lang/CharSequence;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    new-array p1, p1, [I

    iget-object v1, p0, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    const v2, 0x7f110278

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, -0x1

    aput v1, p1, v2

    const/4 v1, 0x2

    :goto_0
    sget-object v2, Lcom/digdroid/alman/dig/n0;->n0:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    add-int/lit8 v3, v1, -0x1

    iget-object v4, p0, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    aget v2, v2, v1

    invoke-virtual {v4, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    sget-object v2, Lcom/digdroid/alman/dig/n0;->o0:[I

    aget v2, v2, v1

    aput v2, p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$a;->f:Lcom/digdroid/alman/dig/n0;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->s(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/n0$a$a;

    invoke-direct {v2, p0, p1}, Lcom/digdroid/alman/dig/n0$a$a;-><init>(Lcom/digdroid/alman/dig/n0$a;[I)V

    invoke-virtual {v1, v0, v2}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
