.class Lcom/digdroid/alman/dig/a3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/a3$b;
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a(Lcom/digdroid/alman/dig/a3$b;)V
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const v1, 0x7f110298

    const v2, 0x7f11023b

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/16 v6, 0x13

    if-ge v0, v6, :cond_0

    new-array v0, v5, [Ljava/lang/CharSequence;

    iget-object v6, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-virtual {v6, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    iget-object v1, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    new-array v1, v5, [I

    fill-array-data v1, :array_0

    goto :goto_0

    :cond_0
    const/16 v6, 0x1e

    if-ge v0, v6, :cond_1

    const/4 v0, 0x3

    new-array v6, v0, [Ljava/lang/CharSequence;

    iget-object v7, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-virtual {v7, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v4

    iget-object v1, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v3

    iget-object v1, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    const v2, 0x7f11023c

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v5

    new-array v1, v0, [I

    fill-array-data v1, :array_1

    move-object v0, v6

    goto :goto_0

    :cond_1
    new-array v0, v3, [Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    new-array v1, v3, [I

    aput v5, v1, v4

    :goto_0
    new-instance v2, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f1100c7

    invoke-virtual {v2, v3}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v2

    new-instance v3, Lcom/digdroid/alman/dig/a3$a;

    invoke-direct {v3, p0, v1, p1}, Lcom/digdroid/alman/dig/a3$a;-><init>(Lcom/digdroid/alman/dig/a3;[ILcom/digdroid/alman/dig/a3$b;)V

    invoke-virtual {v2, v0, v3}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
        0x2
    .end array-data
.end method
