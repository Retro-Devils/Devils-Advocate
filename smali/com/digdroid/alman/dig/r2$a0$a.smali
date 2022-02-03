.class Lcom/digdroid/alman/dig/r2$a0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/h2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$a0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/digdroid/alman/dig/r2$a0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$a0;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$a0$a;->b:Lcom/digdroid/alman/dig/r2$a0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$a0$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 5

    if-eqz p1, :cond_3

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$a0$a;->b:Lcom/digdroid/alman/dig/r2$a0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$a0;->b:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const/4 v1, 0x0

    aget-object v2, p1, v1

    const-string v3, "temp_storage_dir"

    invoke-virtual {v0, v3, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/r2$a0$a$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/r2$a0$a$b;-><init>(Lcom/digdroid/alman/dig/r2$a0$a;)V

    array-length v3, p1

    new-array v3, v3, [Ljava/lang/CharSequence;

    :goto_0
    array-length v4, p1

    if-ge v1, v4, :cond_2

    aget-object v4, p1, v1

    aput-object v4, v3, v1

    aget-object v4, p1, v1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iput v1, v2, Lcom/digdroid/alman/dig/r2$a0$a$b;->a:I

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$a0$a;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v0, v1, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget v1, v2, Lcom/digdroid/alman/dig/r2$a0$a$b;->a:I

    new-instance v4, Lcom/digdroid/alman/dig/r2$a0$a$c;

    invoke-direct {v4, p0, v2}, Lcom/digdroid/alman/dig/r2$a0$a$c;-><init>(Lcom/digdroid/alman/dig/r2$a0$a;Lcom/digdroid/alman/dig/r2$a0$a$b;)V

    invoke-virtual {v0, v3, v1, v4}, Landroidx/appcompat/app/b$a;->q([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101da

    new-instance v3, Lcom/digdroid/alman/dig/r2$a0$a$a;

    invoke-direct {v3, p0, p1, v2}, Lcom/digdroid/alman/dig/r2$a0$a$a;-><init>(Lcom/digdroid/alman/dig/r2$a0$a;[Ljava/lang/String;Lcom/digdroid/alman/dig/r2$a0$a$b;)V

    invoke-virtual {v0, v1, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_3
    :goto_1
    return-void
.end method
