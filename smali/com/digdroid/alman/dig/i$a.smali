.class Lcom/digdroid/alman/dig/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/h2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/i;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/i$a;->a:Lcom/digdroid/alman/dig/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/i$a;->a:Lcom/digdroid/alman/dig/i;

    invoke-static {v0}, Lcom/digdroid/alman/dig/i;->c(Lcom/digdroid/alman/dig/i;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i$a;->a:Lcom/digdroid/alman/dig/i;

    aget-object p1, p1, v2

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/i;->e(Ljava/lang/String;)V

    return-void

    :cond_2
    array-length v1, p1

    new-array v1, v1, [Ljava/lang/CharSequence;

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_3

    aget-object v3, p1, v2

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v2, v0, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110237

    invoke-virtual {v2, v0}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/i$a$a;

    invoke-direct {v2, p0, p1}, Lcom/digdroid/alman/dig/i$a$a;-><init>(Lcom/digdroid/alman/dig/i$a;[Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_4
    :goto_1
    return-void
.end method
